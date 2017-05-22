/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Homestay;

/**
 *
 * @author JAPP
 */
@WebServlet(name = "MyHomestay", urlPatterns = {"/MyHomestay"})
public class MyHomestay extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        ServletContext context = request.getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");

        
        HttpSession session = request.getSession();
      
        String username = (String) session.getAttribute("username");       
        
        Homestay homestay;
        ArrayList<Homestay> myHomestay = new ArrayList<>();
        
        PreparedStatement select_myHomestay = connection.prepareStatement("select * from test_base.homestay where username = '"+ username +"'");
        ResultSet display_myHomestay = select_myHomestay.executeQuery();
        while(display_myHomestay.next()){
            homestay = new Homestay();
            homestay.setHs_id(display_myHomestay.getString("homestay_id"));
            homestay.setHs_name(display_myHomestay.getString("homestay_name"));
            homestay.setHs_desc(display_myHomestay.getString("homestay_desc"));
            homestay.setHs_address(display_myHomestay.getString("homestay_address"));
            homestay.setHs_license(display_myHomestay.getString("homestay_license"));
            homestay.setHs_region(display_myHomestay.getString("homestay_region"));
            homestay.setHs_province(display_myHomestay.getString("homestay_province"));
            homestay.setHs_district(display_myHomestay.getString("homestay_district"));
            homestay.setMyRoom(connection, display_myHomestay.getString("homestay_id"));
            myHomestay.add(homestay);
            
            System.out.println(display_myHomestay.getString("homestay_name"));
            
        }
               
        request.setAttribute("myHomestay", myHomestay);
        
        RequestDispatcher obj = request.getRequestDispatcher("/myhomestay.jsp");
        obj.forward(request, response);
        
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
            Logger.getLogger(MyHomestay.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(MyHomestay.class.getName()).log(Level.SEVERE, null, ex);
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
