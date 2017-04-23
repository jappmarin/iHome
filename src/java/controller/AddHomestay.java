package controller;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import model.Homestay;

@WebServlet(name = "AddHomestay", urlPatterns = {"/AddHomestay"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class AddHomestay extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");

        Calendar calendar = Calendar.getInstance();

        String appPath = request.getServletContext().getRealPath("");
        String savePath = appPath + "/asset/img/homestay";
        String username = customer.getUsername();
        String hs_name = request.getParameter("homestayname");
        String hs_desc = request.getParameter("detail");
        String hs_address = request.getParameter("address");
        String hs_license = request.getParameter("license");
        String hs_region = request.getParameter("region");
        String hs_province = request.getParameter("province");
        String hs_district = request.getParameter("district");
        String hs_lat = request.getParameter("latitude");
        String hs_long = request.getParameter("longitude");
        String hs_pic = "hello";
//                (customer.getUsername() + new Timestamp(calendar.getTime().getTime()).toString()).hashCode() + "";

//        File fileSaveDir = new File(savePath);
//        if (!fileSaveDir.exists()) {
//            fileSaveDir.mkdir();
//        }
//
//        Part part = request.getPart("file");
//        part.write(savePath + File.separator + hs_pic + ".jpg");
//        part.delete();
        try {
            Homestay homestay = new Homestay();
            homestay.setHs_name(hs_name);
            homestay.setHs_desc(hs_desc);
            homestay.setHs_address(hs_address);
            homestay.setHs_license(hs_license);
            homestay.setHs_region(hs_region);
            homestay.setHs_province(hs_province);
            homestay.setHs_district(hs_district);
//            homestay.setHs_pic(hs_pic + ".jpg");
            homestay.setHost(username);
            homestay.addHomestay(connection);

        } catch (SQLException ex) {

        }

        PreparedStatement select_homestay = connection.prepareStatement("select * from test_base.homestay where homestay_name = ?");
        select_homestay.setString(1, request.getParameter("homestayname"));
        ResultSet display_homestay = select_homestay.executeQuery();
        if (display_homestay.next()) {
            session.setAttribute("hs_name", display_homestay.getString("homestay_name"));
            session.setAttribute("hs_desc", display_homestay.getString("homestay_desc"));
//            session.setAttribute("hs_pic", display_homestay.getString("homestay_pic"));
            session.setAttribute("hs_address", display_homestay.getString("homestay_address"));
            session.setAttribute("hs_province", display_homestay.getString("homestay_province"));
        }
        response.sendRedirect("upload.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddHomestay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddHomestay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
