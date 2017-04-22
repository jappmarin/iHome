<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
        <div class="container">
            <div class="row justify-content-center my-2">
                <div class="col-sm-12 col-md-6" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Profile</h3>
                        <div class="card-block">
                            <p>Username : ${sessionScope.customer.username}</p>
                            <p>Name : ${sessionScope.customer.firstname} ${sessionScope.customer.lastname}</p>
                            <p>Email : ${sessionScope.customer.email}</p>
                            <p>Phone Number : ${sessionScope.customer.phone}</p>
                            <a href="edit_profile.jsp" class="btn btn-primary btn-block">Edit Profile</a>
                        </div>
                    </div>
                </div>       
            </div>
            <% if (session.getAttribute("type").equals("HOST")) { %>
            <div class="row justify-content-center">
                <div class="col-sm-12 col-md-6">
                    <a href="myhomestay.jsp" class="btn btn-warning btn-block" id="signUpButton">My Owned Homestay</a>
                </div>
            </div>
            <% }%>
        </div>
<jsp:include page="templates/footer.jsp" />