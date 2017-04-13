<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.isNew()) {  %><jsp:include page="templates/header.jsp" /><% } else { %><jsp:include page="templates/headerauth.jsp" /><% }%>
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-12 col-md-6" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Profile</h3>
                        <div class="card-block">
                            <p>Username : ${sessionScope.username}</p>
                            <p>Name : ${sessionScope.firstname} ${sessionScope.lastname}</p>
                            <p>Email : ${sessionScope.email}</p>
                            <p>Phone Number : ${sessionScope.phone}</p>
                            <a href="edit_profile.jsp" class="btn btn-primary btn-block">Edit Profile</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />