/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Profile;

/**
 *
 * @author tkitb
 */
@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class Signup extends HttpServlet {

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
////        String username = request.getParameter("username");
////        String first_name = request.getParameter("first_name");
////        String last_name = request.getParameter("last_name");
////        String password = request.getParameter("password");
////        String email = request.getParameter("email");
////        
////        ServletContext context = getServletContext();
////        Connection connection = (Connection) context.getAttribute("connection");
////        
////        try {
////            Profile profile = new Profile();
////            profile.setUsername(username);
////            profile.setFirst_name(first_name);
////            profile.setLast_name(last_name);
////            profile.addNewProfile(connection);
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////        }
//        ของธี

//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String f_name = request.getParameter("f_name");
//        String l_name = request.getParameter("l_name");
//        String email = request.getParameter("email");
//        String phone = request.getParameter("phone");
//        
//        ServletContext contextdb = getServletContext();
//        Connection conn = (Connection) contextdb.getAttribute("conn");
//        String sql_select = "select * from ihomedb.customer where username ='" + username +"'";
//        String sql_insert = "insert into ihomedb.customer ("
//                + "username, password, f_name, l_name, email, phone) value ("
//                + "'" +username +"','" + password+ "','" +f_name+"','" +l_name+"','" +email+ "','" +phone+"')";
//                
//        
//        Statement stmt  = conn.createStatement();
//        ResultSet rt_select = stmt.executeQuery(sql_select);
//        
//        if(rt_select.next()){
//            if((rt_select.getString("username")).equals(username)){
//                if((rt_select.getString("password")).equals(username))
//            }
//        }
//    }
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
