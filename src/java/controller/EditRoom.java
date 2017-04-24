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
import java.sql.SQLException;
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

/**
 *
 * @author JAPP
 */
@WebServlet(name = "EditRoom", urlPatterns = {"/EditRoom"})
public class EditRoom extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        HttpSession session = request.getSession();

        String room_id = request.getParameter("room_id");
        String room_name = request.getParameter("room_name");
        String room_price = request.getParameter("room_price");
        String room_limit = request.getParameter("room_limit");
        String[] room_fac = request.getParameterValues("facilities");
//        
//        Room room = new Room(Integer.parseInt(room_id));
//        room.setRoom_name(room_name);
//        room.setRoom_limit(Integer.parseInt(room_limit));
//        room.setRoom_price(Float.parseFloat(room_price));
//
//        room.changeRoom_name(connection);
//        room.changeRoom_limit(connection);
//        room.changeRoom_limit(connection);

        PreparedStatement update_room = connection.prepareStatement("update test_base.room SET room_name = ?, room_limit = ?, room_price = ? where room_id = ?;");
        update_room.setString(1, room_name);
        update_room.setString(2, room_limit);
        update_room.setString(3, room_price);
        update_room.setString(4, room_id);
        update_room.executeUpdate();

        RequestDispatcher obj = request.getRequestDispatcher("/MyHomestay");
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
            Logger.getLogger(EditRoom.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EditRoom.class.getName()).log(Level.SEVERE, null, ex);
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
