package controller;

import java.io.IOException;
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
import model.Homestay;

@WebServlet(name = "Search", urlPatterns = {"/Search"})
public class Search extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        
        PreparedStatement select_homestay = connection.prepareStatement("select * from test_base.homestay");
        ResultSet display_homestay = select_homestay.executeQuery();
        
        ArrayList<Homestay> allHome = new ArrayList<Homestay>();
        
        while(display_homestay.next()) {
            Homestay homestay = new Homestay();
            homestay.setHs_id(display_homestay.getString("hs_id"));
            homestay.setHs_name(display_homestay.getString("hs_name"));
            homestay.setHs_desc(display_homestay.getString("hs_desc"));
            homestay.setHs_price(display_homestay.getFloat("hs_price"));
            homestay.setHs_guest(display_homestay.getInt("hs_guest"));
            homestay.setHs_address(display_homestay.getString("hs_address"));
            homestay.setHs_province(display_homestay.getString("hs_province"));
            allHome.add(homestay);     
        }
        
        request.setAttribute("allHome", allHome);
        RequestDispatcher obj = request.getRequestDispatcher("search.jsp");
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
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
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
