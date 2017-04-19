<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-12 col-md-8" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Profile</h3>
                        <div class="card-block">
                            <form action="EditProfile" method="POST">
                                <div class="form-group has-feedback" id="usernameInDiv">
                                    <label for="username">Username</label>
                                    <input type="text" class="form-control" name="username" id="usernameIn" placeholder="" value="${sessionScope.customer.username}" required disabled>
                                </div>
                                <div class="form-group has-feedback" id="firstNameInDiv">
                                    <label for="firstname">First Name</label>
                                    <input type="text" class="form-control" name="firstname" id="firstNameIn" placeholder="" value="${sessionScope.customer.firstname}" required>
                                </div>
                                <div class="form-group has-feedback" id="lastNameInDiv">
                                    <label for="lastname">Last Name</label>
                                    <input type="text" class="form-control" name="lastname" id="lastNameIn" placeholder="" value="${sessionScope.customer.lastname}" required>
                                </div>
                                <div class="form-group has-feedback" id="emailInDiv">
                                    <label for="email">Email</label>
                                    <input type="email" class="form-control" name="email" id="emailIn" placeholder="" value="${sessionScope.customer.email}" required>
                                </div>
                                <div class="form-group has-feedback" id="phoneInDiv">
                                    <label for="phone">Phone Number</label>
                                    <input type="text" class="form-control" name="phone" id="phoneIn" placeholder="" value="${sessionScope.customer.phone}" required>
                                </div>
                                <div class="form-group has-feedback" id="passwordInDiv">
                                    <label for="password">Re-enter your Password</label>
                                    <input type="password" class="form-control" name="password" id="passwordIn" placeholder="" value="" required>
                                </div>
                                <button type="submit" class="btn btn-primary btn-block">Save changes</button>
                                <a href="profile.jsp" class="btn btn-secondary btn-block">Cancel</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />