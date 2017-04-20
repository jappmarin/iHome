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

        String search = request.getParameter("search");
        String[] region = request.getParameterValues("region");
        String low_price = request.getParameter("min_price");
        String max_price = request.getParameter("max_price");
        String c_in = request.getParameter("c_in");
        String c_out = request.getParameter("c_out");

        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");

        ArrayList<Homestay> allHome = new ArrayList<>();

        PreparedStatement select_homestay_provinc = connection.prepareStatement("select * from test_base.homestay where homestay_province = ?");
        select_homestay_provinc.setString(1, search);
        ResultSet display_homestay_province = select_homestay_provinc.executeQuery();
        while (display_homestay_province.next()) {
            Homestay homestay = new Homestay();
            homestay.setHs_id(display_homestay_province.getString("homestay_id"));
            homestay.setHs_name(display_homestay_province.getString("homestay_name"));
            homestay.setHs_desc(display_homestay_province.getString("homestay_desc"));
            homestay.setHs_address(display_homestay_province.getString("homestay_address"));
            homestay.setHs_license(display_homestay_province.getString("homestay_license"));
            homestay.setHs_region(display_homestay_province.getString("homestay_region"));
            homestay.setHs_province(display_homestay_province.getString("homestay_province"));
            homestay.setHs_district(display_homestay_province.getString("homestay_district"));
            homestay.setHs_lat(display_homestay_province.getString("homestay_latitude"));
            homestay.setHs_long(display_homestay_province.getString("homestay_longitude"));
            allHome.add(homestay);
        }
        
        PreparedStatement select_homestay_district = connection.prepareStatement("select * from test_base.homestay where homestay_district = ?");
        select_homestay_district.setString(1, search);
        ResultSet display_homestay_district = select_homestay_district.executeQuery();
        while (display_homestay_district.next()) {
            Homestay homestay = new Homestay();
            homestay.setHs_id(display_homestay_district.getString("homestay_id"));
            homestay.setHs_name(display_homestay_district.getString("homestay_name"));
            homestay.setHs_desc(display_homestay_district.getString("homestay_desc"));
            homestay.setHs_address(display_homestay_district.getString("homestay_address"));
            homestay.setHs_license(display_homestay_district.getString("homestay_license"));
            homestay.setHs_region(display_homestay_district.getString("homestay_region"));
            homestay.setHs_province(display_homestay_district.getString("homestay_province"));
            homestay.setHs_district(display_homestay_district.getString("homestay_district"));
            homestay.setHs_lat(display_homestay_district.getString("homestay_latitude"));
            homestay.setHs_long(display_homestay_district.getString("homestay_longitude"));
            allHome.add(homestay);
        }
        
        if (region != null) {
            for (String reg : region) {
                PreparedStatement select_homestay_region = connection.prepareStatement("select * from test_base.homestay where homestay_region = ?");
                select_homestay_region.setString(1, reg);
                ResultSet display_homestay_region = select_homestay_district.executeQuery();
                while (display_homestay_region.next()) {
                    Homestay homestay = new Homestay();
                    homestay.setHs_id(display_homestay_region.getString("homestay_id"));
                    homestay.setHs_name(display_homestay_region.getString("homestay_name"));
                    homestay.setHs_desc(display_homestay_region.getString("homestay_desc"));
                    homestay.setHs_address(display_homestay_region.getString("homestay_address"));
                    homestay.setHs_license(display_homestay_region.getString("homestay_license"));
                    homestay.setHs_region(display_homestay_region.getString("homestay_region"));
                    homestay.setHs_province(display_homestay_region.getString("homestay_province"));
                    homestay.setHs_district(display_homestay_region.getString("homestay_district"));
                    homestay.setHs_lat(display_homestay_region.getString("homestay_latitude"));
                    homestay.setHs_long(display_homestay_region.getString("homestay_longitude"));
                    allHome.add(homestay);
                }
            }
        }

        request.setAttribute("allHome", allHome);
        RequestDispatcher obj = request.getRequestDispatcher("/search.jsp");
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
