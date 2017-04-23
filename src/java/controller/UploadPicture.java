package controller;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Customer;

@WebServlet("/UploadServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class UploadPicture extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // gets absolute path of the web application
        String appPath = request.getServletContext().getRealPath("");
        // constructs path of the directory to save uploaded file
        String savePath = appPath + "/asset/img/homestay";

        Calendar calendar = Calendar.getInstance();
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        String Id = (customer.getUsername() + new Timestamp(calendar.getTime().getTime()).toString()).hashCode() + "";

        // creates the save directory if it does not exists
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }

        Part part = request.getPart("file");
        
        part.write(savePath + File.separator + Id + ".jpg");
        
        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        
        try {
            PreparedStatement upload_picture = connection.prepareStatement("insert into test_base.homestay (homestay_picture) values (?)");
            upload_picture.setString(1, Id + ".jpg");
            upload_picture.executeUpdate();
        } catch (SQLException ex) {
            
        }
        
        RequestDispatcher obj = request.getRequestDispatcher("/MyHomestay");
        obj.forward(request, response);
    }

    /**
     * Extracts file name from HTTP header content-disposition
     */
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }
}
