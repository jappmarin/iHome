/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.Connection;
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
import model.Room;

/**
 *
 * @author JAPP
 */
@WebServlet(name = "AddRoom", urlPatterns = {"/AddRoom"})
public class AddRoom extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        int room_id;
        String room_name = request.getParameter("room_name");
        int room_limit = Integer.parseInt(request.getParameter("room_limit"));
        float room_price = Float.parseFloat(request.getParameter("room_price"));
        String room_picture = "r2.jpg";
//                request.getParameter("room_picture");
        int homestay_id = Integer.parseInt(request.getParameter("homestay_id"));
        String[] room_fac = request.getParameterValues("facilities");
        
        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");  
        Room room = new Room();
        room.setRoom_name(room_name);
        room.setRoom_limit(room_limit);
        room.setRoom_price(room_price);
        room.setRoom_picture(room_picture);
        room.setHomestay_id(homestay_id);
        room.addNewRoom(connection);
        
        Room room_f = new Room(connection, room_name);
        room_id = room_f.getRoom_id();
        for (String room_fac1 : room_fac) {
            int fac_id = Integer.parseInt(room_fac1);
            room_f.addRoom_facilities(connection, room_id, fac_id);
        }
           
        RequestDispatcher obj = request.getRequestDispatcher("/myhomestay.jsp");
        obj.forward(request, response);
        
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
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
