package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Homestay;

@WebServlet(name = "Review", urlPatterns = {"/Review"})
public class Review extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        String text = request.getParameter("comment");
            Calendar calendar = Calendar.getInstance();
            
            ServletContext ctx = getServletContext();
            Connection conn = (Connection) ctx.getAttribute("connection");
            
            HttpSession session = request.getSession();
            Customer customer = (Customer) session.getAttribute("customer");
            
            String room_id = request.getParameter("id");
            
            try {
                PreparedStatement pstmt = conn.prepareStatement("insert into test_base.review (username, room_id, comment, review_date) values(?,?,?,?)");
                pstmt.setString(1, customer.getUsername());
                pstmt.setString(2, room_id);
                pstmt.setString(3, text);
                pstmt.setTimestamp(4, new Timestamp(calendar.getTime().getTime()));
                pstmt.executeUpdate();
                
                response.sendRedirect("../ViewHomestay/?id=" + room_id);    
                
            } catch (SQLException ex) {
            }
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
