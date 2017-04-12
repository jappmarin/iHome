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

/**
 *
 * @author tkitb
 */
@WebServlet(name = "EditProfile", urlPatterns = {"/EditProfile"})
public class EditProfile extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        HttpSession session = request.getSession();

        String password = (String) session.getAttribute("password");
        System.out.println("Password" + password);

        if (password.equals(request.getParameter("password"))) {
            PreparedStatement update_customer = connection.prepareStatement("update customer set first_name = ?, last_name = ?, email = ?, phone = ?");
            update_customer.setString(1, request.getParameter("firstname"));
            update_customer.setString(2, request.getParameter("lastname"));
            update_customer.setString(3, request.getParameter("email"));
            update_customer.setString(4, request.getParameter("phone"));
            update_customer.executeUpdate();

        }
        PreparedStatement select_customer = connection.prepareStatement("select * from customer where username = ? and password = ?");
        select_customer.setString(1, (String) session.getAttribute("username"));
        select_customer.setString(2, (String) session.getAttribute("password"));
        ResultSet display_customer = select_customer.executeQuery();
        display_customer.next();

        session.setAttribute("username", display_customer.getString("username"));
        session.setAttribute("firstname", display_customer.getString("first_name"));
        session.setAttribute("lastname", display_customer.getString("last_name"));
        session.setAttribute("email", display_customer.getString("email"));
        session.setAttribute("phone", display_customer.getString("phone"));
        response.sendRedirect("profile.jsp");
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
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
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
