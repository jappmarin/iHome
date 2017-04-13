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

@WebServlet(name = "Signup", urlPatterns = {"/Signup"})
public class Signup extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        HttpSession session = request.getSession();

        PreparedStatement insert_customer = connection.prepareStatement("insert into customer (username, password, f_name, l_name, email, birth_date, phone, customer_type, customer_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        insert_customer.setString(1, request.getParameter("username"));
        insert_customer.setString(2, request.getParameter("password"));
        insert_customer.setString(3, request.getParameter("firstname"));
        insert_customer.setString(4, request.getParameter("lastname"));
        insert_customer.setString(5, request.getParameter("email"));
        insert_customer.setString(6, request.getParameter("birthdate"));
        insert_customer.setString(7, request.getParameter("phone"));
        insert_customer.setString(8, (String) session.getAttribute("customer_type"));
        insert_customer.setInt(9, 1);
        insert_customer.executeUpdate();
        
        PreparedStatement select_customer = connection.prepareStatement("select * from customer where username = ? and password = ?");
        select_customer.setString(1, request.getParameter("username"));
        select_customer.setString(2, request.getParameter("password"));
        ResultSet display_customer = select_customer.executeQuery();
        display_customer.next();

        session.setAttribute("username", display_customer.getString("username"));
        session.setAttribute("firstname", display_customer.getString("f_name"));
        session.setAttribute("lastname", display_customer.getString("l_name"));
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
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
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
