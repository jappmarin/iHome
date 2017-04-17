package controller;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Homestay;

@WebServlet(name = "AddHomestay", urlPatterns = {"/AddHomestay"})
public class AddHomestay extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        HttpSession session = request.getSession();

        Homestay homestay = (Homestay) session.getAttribute("homestay");

        String appPath = request.getServletContext().getRealPath("");
        String savePath = appPath + "/asset/img/homestay";

        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }

        Part part = request.getPart("art");
        String fileName = homestay.getHs_id() + "_" + extractFileName(part);

        ArrayList<String> acceptedFile = new ArrayList<String>();
        acceptedFile.add(".jpg");
        acceptedFile.add(".bmp");
        acceptedFile.add(".png");
        acceptedFile.add(".gif");

        if (!acceptedFile.contains((fileName.substring(fileName.length() - 4)).toLowerCase())) {
            out.println((fileName.substring(fileName.length() - 4)).toLowerCase());
            response.sendRedirect("Error.jsp");
            return;
        }

        fileName = new File(fileName).getName();
        part.write(savePath + File.separator + fileName);

        try {
            BufferedImage bufferedImage;

            bufferedImage = ImageIO.read(new File(savePath + File.separator + fileName));

            BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(),
                    bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
            newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);

            ImageIO.write(newBufferedImage, "jpg", new File(savePath + File.separator + homestay.getHs_id() + ".jpg"));

            File file = new File(savePath + File.separator + fileName);
            file.delete();

        } catch (IOException ex) {
            response.sendRedirect("Error.jsp");
        }

        PreparedStatement insert_homestay = connection.prepareStatement("insert into test_base.homestay (hs_name, hs_desc, hs_price, hs_guest, hs_address, hs_province, hs_lat, hs_long) values (?, ?, ?, ?, ?, ?, ?, ?)");
        insert_homestay.setString(1, request.getParameter("homestayname"));
        insert_homestay.setString(2, request.getParameter("detail"));
        insert_homestay.setFloat(3, Float.parseFloat(request.getParameter("price")));
        insert_homestay.setInt(4, Integer.parseInt(request.getParameter("guest")));
        insert_homestay.setString(5, request.getParameter("address"));
        insert_homestay.setString(6, "Bangkok");
        insert_homestay.setString(7, request.getParameter("latitude"));
        insert_homestay.setString(8, request.getParameter("longtitude"));
        insert_homestay.executeUpdate();

        PreparedStatement select_homestay = connection.prepareStatement("select * from test_base.homestay where hs_name = ?");
        select_homestay.setString(1, request.getParameter("homestayname"));
        ResultSet display_homestay = select_homestay.executeQuery();
        display_homestay.next();

        session.setAttribute("hs_name", display_homestay.getString("hs_name"));
        session.setAttribute("hs_desc", display_homestay.getString("hs_desc"));
        session.setAttribute("hs_price", display_homestay.getFloat("hs_price"));
        session.setAttribute("hs_guest", display_homestay.getInt("hs_guest"));
        session.setAttribute("hs_address", display_homestay.getString("hs_address"));
        session.setAttribute("hs_province", display_homestay.getString("hs_province"));
        session.setAttribute("hs_lat", display_homestay.getString("hs_lat"));
        session.setAttribute("hs_long", display_homestay.getString("hs_long"));

        response.sendRedirect("profile_host.jsp");
    }

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
