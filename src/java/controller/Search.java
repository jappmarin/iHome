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
        
        String sql_home = "select * from test_base.homestay where homestay_agree like 'YES' and homestay_name like'%" + search + "%'";
        Statement select_homestay_name = connection.createStatement();
        ResultSet display_homestay_name = select_homestay_name.executeQuery(sql_home);
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
            homestay.setHs_pic(display_homestay_name.getString("homestay_picture"));
           
            allHome.add(homestay);
        }
        
        String sql_room = "select * from test_base.homestay join test_base.room using(homestay_id) where homestay_agree like 'YES' and room_name like'%" + search + "%'";
        Statement select_room_name = connection.createStatement();
        ResultSet display_room_name = select_room_name.executeQuery(sql_room);
        while (display_room_name.next()) {
            Homestay homestay = new Homestay();
            homestay.setHs_id(display_room_name.getString("homestay_id"));
            homestay.setHs_name(display_room_name.getString("homestay_name"));
            homestay.setHs_desc(display_room_name.getString("homestay_desc"));
            homestay.setHs_address(display_room_name.getString("homestay_address"));
            homestay.setHs_license(display_room_name.getString("homestay_license"));
            homestay.setHs_region(display_room_name.getString("homestay_region"));
            homestay.setHs_province(display_room_name.getString("homestay_province"));
            homestay.setHs_district(display_room_name.getString("homestay_district"));
            homestay.setHs_pic(display_room_name.getString("homestay_picture"));
           
            allHome.add(homestay);
        }
        

        PreparedStatement select_homestay_provinc = connection.prepareStatement("select * from test_base.homestay where homestay_province = ? and homestay_agree = 'YES'");
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
            homestay.setHs_pic(display_homestay_province.getString("homestay_picture"));
            allHome.add(homestay);
        }

        PreparedStatement select_homestay_district = connection.prepareStatement("select * from test_base.homestay where homestay_district = ? and homestay_agree = 'YES'");
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
            homestay.setHs_pic(display_homestay_district.getString("homestay_picture"));
            allHome.add(homestay);
        }
        if (low_price != null || max_price != null) {
            
                PreparedStatement select_room_price = connection.prepareStatement("select * from test_base.homestay JOIN test_base.room USING (homestay_id) HAVING (room_price >= ? and room_price <= ? and homestay_agree = 'YES')");
                select_room_price.setString(1, low_price);
                select_room_price.setString(2, max_price);
                ResultSet display_room_price = select_room_price.executeQuery();
                while (display_room_price.next()) {
                    Homestay homestay = new Homestay();
                    homestay.setHs_id(display_room_price.getString("homestay_id"));
                    homestay.setHs_name(display_room_price.getString("homestay_name"));
                    homestay.setHs_desc(display_room_price.getString("homestay_desc"));
                    homestay.setHs_address(display_room_price.getString("homestay_address"));
                    homestay.setHs_license(display_room_price.getString("homestay_license"));
                    homestay.setHs_region(display_room_price.getString("homestay_region"));
                    homestay.setHs_province(display_room_price.getString("homestay_province"));
                    homestay.setHs_district(display_room_price.getString("homestay_district"));
                    homestay.setHs_pic(display_room_price.getString("homestay_picture"));
                    allHome.add(homestay);
                }
            
        }
        if (region != null) {
            for (String reg : region) {
                PreparedStatement select_homestay_region = connection.prepareStatement("select * from test_base.homestay where homestay_region = ? and homestay_agree = 'YES'");
                select_homestay_region.setString(1, reg);
                ResultSet display_homestay_region = select_homestay_region.executeQuery();
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
                    homestay.setHs_pic(display_homestay_region.getString("homestay_picture"));
                    allHome.add(homestay);
                }
            }                       
        }
        
        if (c_in == null || c_out == null) {
            PreparedStatement select_homestay_date = connection.prepareStatement("select * from test_base.booking join test_base.room using(room_id) where check_in >= ? and check_out <= ?");
            select_homestay_date.setString(1, c_in);
            select_homestay_date.setString(2, c_out);
            ResultSet display_homestay_date = select_homestay_district.executeQuery();
            while (display_homestay_date.next()) {
                Homestay homestay = new Homestay();
                homestay.setHs_id(display_homestay_date.getString("homestay_id"));
                homestay.setHs_name(display_homestay_date.getString("homestay_name"));
                homestay.setHs_desc(display_homestay_date.getString("homestay_desc"));
                homestay.setHs_address(display_homestay_date.getString("homestay_address"));
                homestay.setHs_license(display_homestay_date.getString("homestay_license"));
                homestay.setHs_region(display_homestay_date.getString("homestay_region"));
                homestay.setHs_province(display_homestay_date.getString("homestay_province"));
                homestay.setHs_district(display_homestay_date.getString("homestay_district"));
                homestay.setHs_pic(display_room_name.getString("homestay_picture"));    
                allHome.add(homestay);
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
