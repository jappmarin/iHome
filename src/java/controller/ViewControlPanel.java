package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import model.Homestay;

@WebServlet(name = "PublishHomestay", urlPatterns = {"/PublishHomestay"})
public class ViewControlPanel extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        String[] checkbox = request.getParameterValues("checkbox");
        
        HttpSession session = request.getSession();
        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
       
         if (checkbox != null) {
            for (String homestay_id : checkbox) {
                PreparedStatement select_homestay = connection.prepareStatement("update test_base.homestay set homestay_agree = 'YES' where homestay_id = ?");
                select_homestay.setString(1, homestay_id);
                select_homestay.executeUpdate();

            }
        }
         
        ArrayList<Homestay> checkHome = new ArrayList<>();
        String sql = "select * from test_base.homestay where homestay_agree = 'NO';";
        Statement select_homestay_name = connection.createStatement();
        ResultSet display_homestay_name = select_homestay_name.executeQuery(sql);
        while (display_homestay_name.next()) {
            Homestay homestay = new Homestay();
            homestay.setHs_id(display_homestay_name.getString("homestay_id"));
            homestay.setHs_name(display_homestay_name.getString("homestay_name"));
            homestay.setHs_desc(display_homestay_name.getString("homestay_desc"));
            homestay.setHs_address(display_homestay_name.getString("homestay_address"));
            homestay.setHs_license(display_homestay_name.getString("homestay_license"));
            homestay.setHs_region(display_homestay_name.getString("homestay_region"));
            homestay.setHs_province(display_homestay_name.getString("homestay_province"));
            homestay.setHs_district(display_homestay_name.getString("homestay_district"));
            homestay.setHs_lat(display_homestay_name.getString("homestay_latitude"));
            homestay.setHs_long(display_homestay_name.getString("homestay_longitude"));
            checkHome.add(homestay);
        }
               
        
        request.setAttribute("checkHome", checkHome);
        RequestDispatcher obj = request.getRequestDispatcher("/cp.jsp");
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
            Logger.getLogger(ViewControlPanel.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ViewControlPanel.class.getName()).log(Level.SEVERE, null, ex);
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
