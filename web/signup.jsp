<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-4" id="signup">
                    <div class="card">
                        <h3 class="card-header">Sign Up</h3>
                        <div class="card-block">
                            <form action="/Signup" method="POST">
                                <div class="form-group has-feedback" id="firstNameInDiv">
                                    <label for="firstname">First Name</label>
                                    <input type="text" class="form-control" name="firstname" id="firstNameIn" placeholder="John" required>
                                </div>
                                <div class="form-group has-feedback" id="lastNameInDiv">
                                    <label for="firstname">Last Name</label>
                                    <input type="text" class="form-control" name="lastname" id="lastNameIn" placeholder="English" required>
                                </div>
                                <div class="form-group has-feedback" id="usernameInDiv">
                                    <label for="username">Username</label>
                                    <input type="text" class="form-control" name="username" id="usernameIn" placeholder="johnenglish" required>
                                </div>
                                <div class="form-group has-feedback" id="emailInDiv">
                                    <label for="username">Email</label>
                                    <input type="email" class="form-control" name="email" id="emailIn" placeholder="john@english.com" required>
                                </div>
                                <div class="form-group has-feedback" id="passInDiv">
                                    <label for="username">Password</label>
                                    <input type="password" class="form-control" name="password" id="passIn" required>
                                </div>
                                <div class="form-group has-feedback" id="confirmPassInDiv">
                                    <label for="username">Confirm Password</label>
                                    <input type="password" class="form-control" name="password" id="confirmPassIn" required>
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary btn-block" id="signUpButton">Sign Up</button>
                                </div>
                            </form>
                            <hr>
                            <div class="text-center">
                                <p>Already a member? <button type="submit" class="btn btn-default btn-sm" id="signInButton">Sign In</button></p>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />