<%@page import="model.ViewBookClass"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Homestay"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<div class="container-fluid" style="padding-left: 200px; padding-right: 200px;">
    <div class="row justify-content-center mt-5">
        <div class="col-md-12">
            <div class="card">
                <h3 class="card-header">View Booking</h3>
                <div class="card-block">
                    <table class="table table-bordered text-center" style="background-color: #fff" width="800">
                        <thead>
                            <tr>
                                <th class="text-center">Booking ID</th>
                                <th class="text-center">Room Name</th>
                                <th class="text-center">Homestay Name</th>
                                <th class="text-center">Check in</th>
                                <th class="text-center">Check out</th>
                                <th class="text-center">Night</th>
                                <th class="text-center">Total</th>
                                <th class="text-center">Customer</th>
                                <th class="text-center">Contact</th>
                                <th class="text-center">E-mail</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% ArrayList<ViewBookClass> showBook = (ArrayList<ViewBookClass>) request.getAttribute("showBook");
                                    if (showBook != null) {
                                        for (ViewBookClass show : showBook) { %>
                            <tr>
                                <th scope="row" class="text-center"><%=show.getBooking_id()%></th>
                                <td><%=show.getRoom_name()%></td>
                                <td><%=show.getHomestay_name()%></td>
                                <td><%=show.getCheck_in()%></td>
                                <td><%=show.getCheck_out()%></td>                          
                                <td><%=show.getNight()%></td>
                                <td><%=show.getTotal()%></td>
                                <td><%=show.getCustomer_name()%></td>
                                <td><%=show.getPhone()%></td>
                                <td><%=show.getEmail()%></td>
                            </tr>

                            <% } }%>
                        </tbody>
                    </table>                                  
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />