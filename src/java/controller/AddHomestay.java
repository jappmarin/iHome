/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
