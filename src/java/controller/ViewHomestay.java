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
import model.Comment;
import model.Homestay;
import model.Room;

@WebServlet(name = "ViewHomestay", urlPatterns = {"/ViewHomestay/"})
public class ViewHomestay extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ServletContext context = request.getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");

        PreparedStatement select_homestay = connection.prepareStatement("select * from test_base.homestay where homestay_id = '" + request.getParameter("id") + "';");
        ResultSet display_homestay = select_homestay.executeQuery();
        int score;
        Homestay homestay = new Homestay();

        if (display_homestay.next()) {
            homestay.setHs_id(display_homestay.getString("homestay_id"));
            homestay.setHs_name(display_homestay.getString("homestay_name"));
            homestay.setHs_desc(display_homestay.getString("homestay_desc"));
            homestay.setHs_address(display_homestay.getString("homestay_address"));
            homestay.setHs_license(display_homestay.getString("homestay_license"));
            homestay.setHs_region(display_homestay.getString("homestay_region"));
            homestay.setHs_province(display_homestay.getString("homestay_province"));
            homestay.setHs_district(display_homestay.getString("homestay_district"));
            homestay.setNear_homestay(connection, (request.getParameter("id") + "';"));
            homestay.setHs_pic(display_homestay.getString("homestay_picture"));
            homestay.setContact(connection, (request.getParameter("id") + "';"));

        }

        ArrayList<Room> allRoom = new ArrayList<>();
        Room room;

        PreparedStatement select_room = connection.prepareStatement("select * from test_base.room where homestay_id = '" + request.getParameter("id") + "';");
        ResultSet display_room = select_room.executeQuery();

        while (display_room.next()) {
            room = new Room();
            room.setRoom_id(display_room.getInt("room_id"));
            room.setRoom_name(display_room.getString("room_name"));
            room.setRoom_price(display_room.getFloat("room_price"));
            room.setRoom_limit(display_room.getInt("room_limit"));
            room.setRoom_picture(display_room.getString("room_picture"));
            room.setFacilities(connection, room.getRoom_id());
            
            allRoom.add(room);
        }

        ArrayList<Comment> allComment = new ArrayList<>();
        Comment comment;

        PreparedStatement select_comment = connection.prepareStatement("select * from test_base.review rew join test_base.customer cus using (username) join test_base.homestay home using(homestay_id) where homestay_id = ?;");
        select_comment.setString(1, request.getParameter("id"));
        ResultSet display_comment = select_comment.executeQuery();
        while (display_comment.next()) {
            comment = new Comment();
            comment.setUsername(display_comment.getString("username"));
            comment.setFirstname(display_comment.getString("f_name"));
            comment.setLastname(display_comment.getString("l_name"));
            comment.setComment_date(display_comment.getString("review_date"));
            comment.setText(display_comment.getString("comment"));
            allComment.add(comment);
        }
        //Score :
        PreparedStatement total_score = connection.prepareStatement("select sum(score)/count(review_id) score from test_base.review where homestay_id =" + homestay.getHs_id());
        ResultSet display_score = total_score.executeQuery();
        if (display_score.next()) {
            score = display_score.getInt("score");
        }else{
            score = 0;
        }
        
        request.setAttribute("score", score);
        request.setAttribute("homestay_id", homestay.getHs_id());
        request.setAttribute("allComment", allComment);
        request.setAttribute("allRoom", allRoom);
        request.setAttribute("homestay", homestay);

        RequestDispatcher obj = request.getRequestDispatcher("/detail.jsp");
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
            Logger.getLogger(ViewHomestay.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ViewHomestay.class.getName()).log(Level.SEVERE, null, ex);
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
