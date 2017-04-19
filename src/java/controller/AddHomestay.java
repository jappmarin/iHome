package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
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

        String hs_name = request.getParameter("homestayname");
        String hs_desc = request.getParameter("detail");
        String hs_address = request.getParameter("address");
        String hs_license = request.getParameter("license");
        String hs_region = request.getParameter("region");
        String hs_province = request.getParameter("province");
        String hs_district = request.getParameter("district");
        String hs_lat = request.getParameter("latitude");
        String hs_long = request.getParameter("longtitude");

        try {
            Homestay homestay = new Homestay();
            homestay.setHs_name(hs_name);
            homestay.setHs_desc(hs_desc);
            homestay.setHs_address(hs_address);
            homestay.setHs_license(hs_license);
            homestay.setHs_region(hs_region);
            homestay.setHs_province(hs_province);
            homestay.setHs_district(hs_district);
            homestay.setHs_lat(hs_lat);
            homestay.setHs_long(hs_long);
            homestay.addHomestay(connection);
            
        } catch (SQLException ex) {

        }

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
