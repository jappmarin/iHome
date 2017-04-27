<%@page import="model.Room"%>
<%@page import="model.Room"%>
<%@page import="model.Homestay"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<% Homestay homestay = (Homestay) request.getAttribute("homestay");%>
<% Room room = (Room) request.getAttribute("room");%>
        <div class="container mt-5">
            <div class="row">
                <div class="col-5">
                    <div class="card">
                        <h3 class="card-header">Booking Number - #<%=request.getAttribute("booking_id")%></h3>
                        <div class="card-block">
                            <p class="card-text">Name : <small class="text-muted"><%=request.getAttribute("firstname")%> <%=request.getAttribute("lastname")%></small></p>
                            <p class="card-text">Phone Number : <small class="text-muted"><%=request.getAttribute("phone")%></small></p>
                            <p class="card-text">Email : <small class="text-muted"><%=request.getAttribute("email")%></small></p>
                        </div>
                    </div>
                </div>
                <div class="col-7">
                    <div class="card">
                        <h3 class="card-header">Booking Detail</h3>
                        <div class="card-block">
                            <p class="card-text">Homestay Name : <small class="text-muted"><%=homestay.getHs_name()%></small></p>
                            <p class="card-text">Room Name : <small class="text-muted"><%=room.getRoom_name()%></small></p>
                            <p class="card-text">Room Detail : <small class="text-muted"><%=request.getAttribute("night")%> nights, 1 Room, <%=request.getAttribute("guest")%> People</small></p>
                            <p class="card-text">Checkin : <small class="text-muted"><%=request.getAttribute("check_in")%></small></p>
                            <p class="card-text">Checkout : <small class="text-muted"><%=request.getAttribute("check_out")%></small></p>
                            <p class="card-text">Total Price : <small class="text-muted"><%=request.getAttribute("total")%></small></p>
                            <p class="card-text">Contact : <small class="text-muted">012-345-678</small></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />