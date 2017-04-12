<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-4" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Profile</h3>
                        <div class="card-block">
                            <form action="/EditProfile" method="POST">
                                <div class="form-group has-feedback" id="usernameInDiv">
                                    <label for="username">Username</label>
                                    <input type="text" class="form-control" name="username" id="usernameIn" placeholder="" value="iamteerawut" required disabled>
                                </div>
                                <div class="form-group has-feedback" id="firstNameInDiv">
                                    <label for="firstname">First Name</label>
                                    <input type="text" class="form-control" name="firstname" id="firstNameIn" placeholder="" value="Teerawut" required>
                                </div>
                                <div class="form-group has-feedback" id="lastNameInDiv">
                                    <label for="lastname">Last Name</label>
                                    <input type="text" class="form-control" name="lastname" id="lastNameIn" placeholder="" value="Kitbunjerdjarud" required>
                                </div>
                                <div class="form-group has-feedback" id="emailInDiv">
                                    <label for="email">Email</label>
                                    <input type="email" class="form-control" name="email" id="emailIn" placeholder="" value="t.kitbunjerdjarud@gmail.com" required>
                                </div>
                                <div class="form-group has-feedback" id="phoneInDiv">
                                    <label for="phone">Phone Number</label>
                                    <input type="text" class="form-control" name="phone" id="phoneIn" placeholder="" value="094-546-4678" required>
                                </div>
                                <div class="form-group has-feedback" id="passwordInDiv">
                                    <label for="password">Re-enter your Password</label>
                                    <input type="password" class="form-control" name="password" id="passwordIn" placeholder="" value="" required>
                                </div>
                                <button type="submit" class="btn btn-primary btn-block">Save changes</button>
                                <button class="btn btn-secondary btn-block">Cancel</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />