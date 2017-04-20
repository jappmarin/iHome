<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-8" id="profile">
            <div class="card">
                <h3 class="card-header">My Homestay</h3>
                <div class="card-block">
                    <p>Homestay Name : ${sessionScope.hs_name}</p>
                    <p>Price : ${sessionScope.hs_price} Bath / Night</p>
                    <p>Guest : ${sessionScope.hs_guest} Person</p>
                    <a href="edit_homestay.jsp" class="btn btn-primary btn-block mt-3">Edit Homestay</a>
                    <a href="add_room.jsp" class="btn btn-info btn-block mt-3">Add Room</a>
                </div>
            </div>
            <a href="add_homestay.jsp" class="btn btn-success btn-block mt-3">Add Homestay</a>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />