<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-12 col-md-8" id="signup">
                    <div class="card">
                        <h3 class="card-header">Sign Up Host</h3>
                        <div class="card-block">
                            <form action="Signup" method="POST">
                                <% request.setAttribute("cus_type", "HOST"); %>
                                <input type="hidden" name="cus_type" value="HOST" />
                                <div class="form-group has-feedback" id="firstNameInDiv">
                                    <label for="firstname">First Name</label>
                                    <input type="text" class="form-control" name="firstname" id="firstNameIn" placeholder="John" required="">
                                </div>
                                <div class="form-group has-feedback" id="lastNameInDiv">
                                    <label for="lastname">Last Name</label>
                                    <input type="text" class="form-control" name="lastname" id="lastNameIn" placeholder="English" required>
                                </div>
                                <div class="form-group has-feedback" id="usernameInDiv">
                                    <label for="username">Username</label>
                                    <input type="text" class="form-control" name="username" id="usernameIn" placeholder="johnenglish" required>
                                </div>
                                <div class="form-group has-feedback" id="emailInDiv">
                                    <label for="email">Email</label>
                                    <input type="email" class="form-control" name="email" id="emailIn" placeholder="john@english.com" required>
                                </div>
                                <div class="form-group has-feedback" id="birthdateInDiv">
                                    <label for="birthdate">Birthdate</label>
                                    <input type="date" class="form-control" name="birthdate" id="birthdateIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="phoneInDiv">
                                    <label for="phone">Phone Number</label>
                                    <input type="text" class="form-control" name="phone" id="phoneIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="passInDiv">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" name="password" id="passIn" required>
                                </div>
                                <div class="form-group has-feedback" id="confirmPassInDiv">
                                    <label for="confirmPass">Confirm Password</label>
                                    <input type="password" class="form-control" name="confirmPass" id="confirmPassIn" required>
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary btn-block" id="signUpButton">Sign Up</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />