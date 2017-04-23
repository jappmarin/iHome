package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
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
import model.Room;

@WebServlet(name = "BookingConfirm", urlPatterns = {"/BookingConfirm/"})
public class BookingConfirm extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        
        PreparedStatement select_info = connection.prepareStatement("select * from test_base.room join test_base.homestay using (homestay_id) where room_id = '" + request.getParameter("id") + "';");
        ResultSet display_info = select_info.executeQuery();

        Homestay homestay = new Homestay();
        Room room = new Room();

        if (display_info.next()) {
            homestay.setHs_id(display_info.getString("homestay_id"));
            homestay.setHs_name(display_info.getString("homestay_name"));
            homestay.setHs_desc(display_info.getString("homestay_desc"));
            homestay.setHs_address(display_info.getString("homestay_address"));
            homestay.setHs_license(display_info.getString("homestay_license"));
            homestay.setHs_region(display_info.getString("homestay_region"));
            homestay.setHs_province(display_info.getString("homestay_province"));
            homestay.setHs_district(display_info.getString("homestay_district"));
            homestay.setHs_lat(display_info.getString("homestay_latitude"));
            homestay.setHs_long(display_info.getString("homestay_longtitude"));
            
            room.setRoom_id(display_info.getInt("room_id"));
            room.setRoom_name(display_info.getString("room_name"));
            room.setRoom_price(display_info.getInt("room_limit"));
            room.setRoom_price(display_info.getFloat("room_price"));
        }

        PreparedStatement insert_booking = connection.prepareStatement("insert into test_base.booking (check_in, check_out, room_id) values (?,?,?)");
        insert_booking.setString(1, request.getParameter("checkin"));
        insert_booking.setString(2, request.getParameter("checkout"));
        insert_booking.setFloat(3, (Float.parseFloat(request.getParameter("price"))));
        insert_booking.setString(3, homestay.getHs_id());
        insert_booking.executeUpdate();
        
        PreparedStatement select_booking = connection.prepareStatement("select * from test_base.booking where hs_id = '" + request.getParameter("id") + "';" );
        ResultSet display_booking = select_booking.executeQuery();
        display_booking.next();
        
        request.setAttribute("booking_id", display_booking.getString("booking_id"));
        request.setAttribute("check_in", display_booking.getString("check_in"));
        request.setAttribute("check_out", display_booking.getString("check_out"));
        request.setAttribute("total", display_booking.getString("total"));
        request.setAttribute("homestay", homestay);
        request.setAttribute("room", room);
        
        RequestDispatcher obj = request.getRequestDispatcher("../booking_print.jsp");
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
            Logger.getLogger(BookingConfirm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(BookingConfirm.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(BookingConfirm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(BookingConfirm.class.getName()).log(Level.SEVERE, null, ex);
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
