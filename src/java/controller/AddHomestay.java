package controller;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
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
        String username = (String) session.getAttribute("username");

        String homestay_name = request.getParameter("homestay_name");
        String homestay_desc = request.getParameter("homestay_desc");
        String homestay_license = request.getParameter("homestay_license");
        String homestay_address = request.getParameter("homestay_address");
        String homestay_district = request.getParameter("homestay_district");
        String homestay_province = request.getParameter("homestay_province");
        String homestay_region = request.getParameter("homestay_region");
        String near1 = request.getParameter("nearplace1");
        String near2 = request.getParameter("nearplace2");
        String near3 = request.getParameter("nearplace3");
        String near4 = request.getParameter("nearplace4");
        String near5 = request.getParameter("nearplace5");

        Homestay homestay = new Homestay();
        homestay.setHs_name(homestay_name);
        homestay.setHs_desc(homestay_desc);
        homestay.setHs_address(homestay_address);
        homestay.setHs_license(homestay_license);
        homestay.setHs_region(homestay_region);
        homestay.setHs_province(homestay_province);
        homestay.setHs_district(homestay_district);
        homestay.setHost(username);
        homestay.addHomestay(connection);

        PreparedStatement select_homestay = connection.prepareStatement("select * from test_base.homestay where homestay_name = ?");
        select_homestay.setString(1, request.getParameter("homestay_name"));
        ResultSet display_homestay = select_homestay.executeQuery();
        if (display_homestay.next()) {
            session.setAttribute("hs_id", display_homestay.getString("homestay_id"));
            session.setAttribute("hs_name", display_homestay.getString("homestay_name"));
            session.setAttribute("hs_desc", display_homestay.getString("homestay_desc"));
            session.setAttribute("hs_address", display_homestay.getString("homestay_address"));
            session.setAttribute("hs_province", display_homestay.getString("homestay_province"));
            session.setAttribute("hs_district", display_homestay.getString("homestay_district"));
            System.out.println((String) session.getAttribute("hs_id"));
        }

        PreparedStatement add_near_place = connection.prepareStatement("insert into test_base.near_place (place_name) values (?)");
        PreparedStatement select_near_place = connection.prepareStatement("select place_id from test_base.near_place where place_name like ?");
        PreparedStatement insert_near_homestay = connection.prepareStatement("insert into test_base.near_homestay(homestay_id, place_id) values (?, ?)");
        
        if (!near1.equals("")) {
            add_near_place.setString(1,  near1);
            add_near_place.executeUpdate();
            select_near_place.setString(1, near1);
            ResultSet display_near_place = select_near_place.executeQuery();
            display_near_place.next();
            insert_near_homestay.setString(1, (String) session.getAttribute("hs_id"));
            insert_near_homestay.setString(2, display_near_place.getString("place_id"));
            insert_near_homestay.executeUpdate();
        } if (!near2.equals("")) {
            add_near_place.setString(1, near2);
            add_near_place.executeUpdate();
            select_near_place.setString(1, near2);
            ResultSet display_near_place = select_near_place.executeQuery();
            display_near_place.next();
            insert_near_homestay.setString(1, (String) session.getAttribute("hs_id"));
            insert_near_homestay.setString(2, display_near_place.getString("place_id"));
            insert_near_homestay.executeUpdate();
        } if (!near3.equals("")) {
            add_near_place.setString(1, near3);
            add_near_place.executeUpdate();
            select_near_place.setString(1, near3);
            ResultSet display_near_place = select_near_place.executeQuery();
            display_near_place.next();
            insert_near_homestay.setString(1, (String) session.getAttribute("hs_id"));
            insert_near_homestay.setString(2, display_near_place.getString("place_id"));
            insert_near_homestay.executeUpdate();
        } if (!near4.equals("")) {
            add_near_place.setString(1, near4);
            add_near_place.executeUpdate();
            select_near_place.setString(1, near4);
            ResultSet display_near_place = select_near_place.executeQuery();
            display_near_place.next();
            insert_near_homestay.setString(1, (String) session.getAttribute("hs_id"));
            insert_near_homestay.setString(2, display_near_place.getString("place_id"));
            insert_near_homestay.executeUpdate();
        } if (!near5.equals("")) {
            add_near_place.setString(1, near5);
            add_near_place.executeUpdate();
            select_near_place.setString(1, near5);
            ResultSet display_near_place = select_near_place.executeQuery();
            display_near_place.next();
            insert_near_homestay.setString(1, (String) session.getAttribute("hs_id"));
            insert_near_homestay.setString(2, display_near_place.getString("place_id"));
            insert_near_homestay.executeUpdate();
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
