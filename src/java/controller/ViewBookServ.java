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
import model.Customer;
import model.ViewBookClass;

/**
 *
 * @author Patta
 */
@WebServlet(name = "ViewBookServ", urlPatterns = {"/ViewBookServ"})
public class ViewBookServ extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        Customer customer = (Customer) session.getAttribute("customer");

        ArrayList<ViewBookClass> showBook = new ArrayList<>();
        String sql = "SELECT b.booking_id, b.check_in, b.check_out, b.night, b.total, r.room_name, h.homestay_name, b.customer_name, b.customer_phone, b.customer_email  FROM test_base.booking b JOIN test_base.room r USING (room_id) JOIN test_base.homestay h USING (homestay_id) WHERE h.username ='" + customer.getUsername() + "';";
        Statement select_show_book = connection.createStatement();
        ResultSet display_show_book = select_show_book.executeQuery(sql);
        while (display_show_book.next()) {
            ViewBookClass viewbook = new ViewBookClass();
            viewbook.setBooking_id(display_show_book.getInt("booking_id"));
            viewbook.setCheck_in(display_show_book.getString("check_in"));
            viewbook.setCheck_out(display_show_book.getString("check_out"));
            viewbook.setNight(display_show_book.getInt("night"));
            viewbook.setTotal(display_show_book.getFloat("total"));
            viewbook.setRoom_name(display_show_book.getString("room_name"));
            viewbook.setHomestay_name(display_show_book.getString("h.homestay_name"));
            viewbook.setCustomer_name(display_show_book.getString("customer_name"));
            viewbook.setPhone(display_show_book.getString("customer_phone"));
            viewbook.setEmail(display_show_book.getString("customer_email"));
            showBook.add(viewbook);
        }

        request.setAttribute("showBook", showBook);

        RequestDispatcher obj = request.getRequestDispatcher("/view_booking.jsp");
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
            Logger.getLogger(ViewBookServ.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ViewBookServ.class.getName()).log(Level.SEVERE, null, ex);
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
