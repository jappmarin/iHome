<%@page import="model.Room"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Homestay"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<div class="container">
    <%--= if %>
    <div class="row justify-content-center my-2">
        <div class="col-sm-8" id="profile">
            <div class="card">
                <h3 class="card-header">My Homestay</h3>
                <div class="card-block">
                    <p>ชื่อโฮมสเตย์ : ${request.getAttribute("homestay")}</p>
                    <p>รายละเอียดโฮมสเตย์ : </p>
                    <a href="edit_homestay.jsp" class="btn btn-primary btn-block mt-3">Edit Homestay</a>
    <%--= if () --%>
    <% ArrayList<Homestay> myHomestay = (ArrayList<Homestay>) request.getAttribute("myHomestay");
        for (Homestay home : myHomestay) {
            request.setAttribute("homestay_id", home.getHs_id());%>           
    <div class="row justify-content-center my-2">
        <div class="col-sm-12" id="profile">
            <div class="card">
                <h3 class="card-header"><%=home.getHs_name()%></h3>
                <div class="card-block">
                    <p>รายละเอียดบ้านพัก : <%=home.getHs_desc()%></p>

                    <%ArrayList<Room> myRoom = home.getMyRoom();
                        for (Room room : myRoom) {
                            request.setAttribute("room_id", room.getRoom_id());%>      
                    <h4 class="class-header"><%=room.getRoom_name()%></h4>
                    <div class="card-block">                           
                        <p> ราคาที่พักต่อคืน : <%=room.getRoom_price()%></p>
                        <p> จำนวนผู้เข้าพักสูงสุด : <%=room.getRoom_limit()%></p>
                        <a href="${SITE_URL}/edit_room.jsp?homestay_id=<%=home.getHs_id()%>&homestay_name=<%=home.getHs_name()%>&room=<%=room%>" class="btn btn-primary btn-block mt-3">Edit Room</a>
                    </div>
                    <%}%>                                       
                </div>
                <a href="${SITE_URL}/add_room.jsp?homestay_id=<%=home.getHs_id()%>&homestay_name=<%=home.getHs_name()%>" class="btn btn-info btn-block mt-3">Add Room</a>
            </div>        
        </div>      
    </div> 
    <%}%>


    <div class="row justify-content-center my-2">
        <div class="col-sm-8">
            <a href="add_homestay.jsp" class="btn btn-success btn-block mt-3">Add Homestay</a>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />