<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-4" id="signin">
                    <div class="card">
                        <h3 class="card-header">Sign In</h3>
                        <div class="card-block">
                            <form action="Signin" method="POST">
                                <div class="form-group">
                                    <label for="username">Username</label>
                                    <input type="text" class="form-control" name="username" required>
                                </div>
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" name="password" required>
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-primary btn-block" id="SignInButton">Sign In</button>
                                </div>
                            </form>
                            <hr>
                            <div class="text-center">
                                <p>Need an account? <a href="signup.jsp" class="btn btn-secondary btn-sm">Sign Up</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />