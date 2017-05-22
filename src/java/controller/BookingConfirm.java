package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
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
import model.Homestay;
import model.Room;

@WebServlet(name = "BookingConfirm", urlPatterns = {"/BookingConfirm/"})
public class BookingConfirm extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Calendar calendar = Calendar.getInstance();

        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");

        PreparedStatement select_info = connection.prepareStatement("select * from test_base.room join test_base.homestay using (homestay_id) join test_base.customer using(username) where room_id = '" + request.getParameter("id") + "';");
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
            homestay.setContact(display_info.getString("phone"));
            homestay.setHost(display_info.getString("username"));

            room.setRoom_id(display_info.getInt("room_id"));
            room.setRoom_name(display_info.getString("room_name"));
            room.setRoom_price(display_info.getInt("room_limit"));
            room.setRoom_price(display_info.getFloat("room_price"));
        }
        Float total = Float.parseFloat(request.getParameter("total"));
        Float price = room.getRoom_price();
        int night = (int) (total / price);
        String guest = request.getParameter("guest");

        PreparedStatement insert_booking = connection.prepareStatement("insert into test_base.booking (check_in, check_out, night, booking_date, total , room_id, customer_name, customer_phone, customer_email) values (?,?,?,?,?,?,?,?,?)");
        insert_booking.setString(1, request.getParameter("checkin"));
        insert_booking.setString(2, request.getParameter("checkout"));
        insert_booking.setInt(3, night);
        insert_booking.setTimestamp(4, new Timestamp(calendar.getTime().getTime()));
        insert_booking.setString(5, total + "");
        insert_booking.setString(6, room.getRoom_id() + "");
        insert_booking.setString(7, request.getParameter("firstname") + " " + request.getParameter("lastname"));
        insert_booking.setString(8, request.getParameter("phone"));
        insert_booking.setString(9, request.getParameter("email"));

        insert_booking.executeUpdate();
        PreparedStatement select_booking = connection.prepareStatement("select * from test_base.booking where booking_id >= (select max(booking_id) from test_base.booking);");
        ResultSet display_booking = select_booking.executeQuery();
        if (display_booking.next()) {
            request.setAttribute("booking_id", display_booking.getString("booking_id"));
            request.setAttribute("check_in", display_booking.getString("check_in"));
            request.setAttribute("check_out", display_booking.getString("check_out"));
            request.setAttribute("total", display_booking.getString("total"));
            request.setAttribute("name", display_booking.getString("customer_name"));
            request.setAttribute("phone", display_booking.getString("customer_phone"));
            request.setAttribute("email", display_booking.getString("customer_email"));
            request.setAttribute("night", display_booking.getString("night"));
            request.setAttribute("guest", guest);
        }

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
