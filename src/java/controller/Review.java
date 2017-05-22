package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
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

@WebServlet(name = "Review", urlPatterns = {"/Review/"})
public class Review extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String text = request.getParameter("comment");
        String homestay_id = request.getParameter("id");
        String score = request.getParameter("score");
        Calendar calendar = Calendar.getInstance();

        ServletContext ctx = getServletContext();
        Connection conn = (Connection) ctx.getAttribute("connection");

        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        System.out.println(customer.getUsername());

        PreparedStatement pstmt = conn.prepareStatement("insert into test_base.review (review_date, comment, score, username, homestay_id) values(?,?,?,?,?)");
        pstmt.setTimestamp(1, new Timestamp(calendar.getTime().getTime()));
        pstmt.setString(2, text);
        pstmt.setString(3, score);
        pstmt.setString(4, customer.getUsername());
        pstmt.setString(5, homestay_id);
        pstmt.executeUpdate();
//
//        RequestDispatcher obj = request.getRequestDispatcher("/ViewHomestay/?id=" + homestay_id);
//        obj.forward(request, response);
            response.sendRedirect("../ViewHomestay/?id=" + homestay_id);

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
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Review.class.getName()).log(Level.SEVERE, null, ex);
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
