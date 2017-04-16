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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Homestay;

@WebServlet(name = "Booking", urlPatterns = {"/Booking/"})
public class Booking extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        
        PreparedStatement select_homestay = connection.prepareStatement("select * from test_base.homestay where hs_id = '" + request.getParameter("id") + "';");
        ResultSet display_homestay = select_homestay.executeQuery();

        Homestay homestay = new Homestay();

        if (display_homestay.next()) {
            homestay.setHs_id(display_homestay.getString("hs_id"));
            homestay.setHs_name(display_homestay.getString("hs_name"));
            homestay.setHs_desc(display_homestay.getString("hs_desc"));
            homestay.setHs_price(display_homestay.getFloat("hs_price"));
            homestay.setHs_guest(display_homestay.getInt("hs_guest"));
        }
        
       session.setAttribute("hs_id", homestay.getHs_id());
//       session.setAttribute("hs_name", homestay.getHs_name());
//       session.setAttribute("hs_desc", homestay.getHs_desc());
//       session.setAttribute("hs_price", homestay.getHs_price());

//        PreparedStatement insert_booking = connection.prepareStatement("insert into test_base.booking (check_in, check_out, total, customer_id, hs_id) values (?, ?, ?, ?, ?)");
//        insert_booking.setString(1, request.getParameter("checkin"));
//        insert_booking.setString(2, request.getParameter("checkout"));
//        insert_booking.setFloat(3, 200);
//        insert_booking.setInt(4, (Integer) session.getAttribute("customer_id"));
//        insert_booking.setInt(5, (Integer) session.getAttribute("hs_id"));
//        insert_booking.executeUpdate();

        request.setAttribute("homestay", homestay);
        RequestDispatcher obj = request.getRequestDispatcher("/booking.jsp");
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
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
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
