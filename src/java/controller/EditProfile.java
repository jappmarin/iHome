package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;

@WebServlet(name = "EditProfile", urlPatterns = {"/EditProfile"})
public class EditProfile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("connection");
        HttpSession session = request.getSession();

        String password = (String) session.getAttribute("password");
        String confirmPassword = request.getParameter("re_enPass");

        String username = (String) session.getAttribute("username");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String type = (String) session.getAttribute("type");

        out.println(username);
        out.println(lastname);
        out.println(firstname);
        out.println(email);
        out.println(phone);
        out.println(confirmPassword);
        out.println(password);
        out.println(type);

        if (password.equals(confirmPassword)) {
            PreparedStatement update_customer = connection.prepareStatement("update test_base.customer set f_name = ?, l_name = ?, email = ?, phone = ? where username = ? and password = ?");
            update_customer.setString(1, request.getParameter("firstname"));
            update_customer.setString(2, request.getParameter("lastname"));
            update_customer.setString(3, request.getParameter("email"));
            update_customer.setString(4, request.getParameter("phone"));
            update_customer.setString(5, (String) session.getAttribute("username"));
            update_customer.setString(6, (String) session.getAttribute("password"));
            update_customer.executeUpdate();

            PreparedStatement select_customer = connection.prepareStatement("select * from test_base.customer where username = ? and password = ?");
            select_customer.setString(1, (String) session.getAttribute("username"));
            select_customer.setString(2, (String) session.getAttribute("password"));
            ResultSet display_customer = select_customer.executeQuery();
            display_customer.next();

//            session.setAttribute("username", display_customer.getString("username"));
//            session.setAttribute("firstname", display_customer.getString("f_name"));
//            session.setAttribute("lastname", display_customer.getString("l_name"));
//            session.setAttribute("email", display_customer.getString("email"));
//            session.setAttribute("phone", display_customer.getString("phone"));
            Customer customer = new Customer(connection, username);
            session.setAttribute("customer", customer);

            response.sendRedirect("profile.jsp");

        } else {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Password Wrong!');");
            out.println("location='edit_profile.jsp';");
            out.println("</script>");
//            response.sendRedirect("error.jsp");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
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
