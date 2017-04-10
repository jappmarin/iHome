<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
            <div class="row hidden-sm-down mx-auto">
                <div class="col-sm-2">
                    <img src="https://www.ownerdirect.com/images/1069509-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
                <div class="col-sm-4">
                    <img src="https://www.ownerdirect.com/images/1069512-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
                <div class="col-sm-2">
                    <img src="https://www.ownerdirect.com/images/1069501-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
                <div class="col-sm-4">
                    <img src="https://www.ownerdirect.com/images/1069506-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
            </div>
            <div class="row justify-content-center mx-auto">
                <div class="col-sm-2 hidden-sm-down">
                    <img src="https://www.ownerdirect.com/images/1069503-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                    <img src="https://www.ownerdirect.com/images/1104979-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
                <div class="col-sm-8 align-self-center">
                    <div class="card mt-2 mb-2">
                        <div class="card-block">
                            <br>
                            <div class="row justify-content-center">
                                <div class="col-sm-12">
                                    <h2 class="text-center">Where would you like to stay?</h2>
                                </div>
                            </div>
                            <br>
                            <div class="row justify-content-center">
                                <div class="col-sm-6">
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="search" aria-describedby="search" placeholder="eg. Samut Prakan, Bangkok, Chaingmai">
                                    </div>
                                </div>
                            </div>
                            <div class="row justify-content-center">
                                <div class="col-sm-2">
                                    <a class="btn btn-primary btn-lg" href="#" role="button">Search</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-2 hidden-sm-down">
                    <img src="https://www.ownerdirect.com/images/1069158-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                    <img src="https://www.ownerdirect.com/images/1069499-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
            </div>
            <div class="row hidden-sm-down mx-auto">
                <div class="col-sm-4">
                    <img src="https://www.ownerdirect.com/images/1069514-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
                <div class="col-sm-2">
                    <img src="https://www.ownerdirect.com/images/1069507-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
                <div class="col-sm-4">
                    <img src="https://www.ownerdirect.com/images/1069498-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
                <div class="col-sm-2">
                    <img src="https://www.ownerdirect.com/images/1069547-full.jpg" alt="..." class="mt-2 mb-2 w-100">
                </div>
            </div>
        </div>
        <%-- Modal Signup --%>
        <div class="modal fade" id="modal-signup" tabindex="-1" role="dialog" aria-labelledby="modal-signup" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <form id="form-signup">
                        <div class="modal-header">
                            <h5 class="modal-title">Sign Up</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="col-sm-12">
                                <table class="table">
                                    <tbody>
                                        <tr>
                                            <td class="align-middle">Username:</td>
                                            <td>
                                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="username-signup" placeholder="Username">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Password:</td>
                                            <td>
                                                <input type="password" class="form-control mb-2 mr-sm-2 mb-sm-0" id="pasword-signup" placeholder="Password">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Confirm Password:</td>
                                            <td>
                                                <input type="password" class="form-control mb-2 mr-sm-2 mb-sm-0" id="confirmpassword-signup" placeholder="Confirm password">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">First Name:</td>
                                            <td>
                                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="fname-signup" placeholder="First name">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Last Name:</td>
                                            <td>
                                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="lname-signup" placeholder="Last name">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Identity Number:</td>
                                            <td>
                                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="idnumber-signup" placeholder="ID Number or Passport ID">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Date of Birth</td>
                                            <td>
                                                <input type="date" class="form-control mb-2 mr-sm-2 mb-sm-0" id="birth-signup" placeholder="">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Gender</td>
                                            <td>
                                                <select class="custom-select mb-2 mr-sm-2 mb-sm-0" id="gender-signup">
                                                    <option selected>Choose...</option>
                                                    <option value="male">Male</option>
                                                    <option value="female">Female</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Home Address</td>
                                            <td>
                                                <textarea class="form-control" id="exampleTextarea" rows="3"></textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Email</td>
                                            <td>
                                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="email-signup" placeholder="Email address">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">Phone Number</td>
                                            <td>
                                                <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="phone-signup" placeholder="Phone number">
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Confirm</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <%-- Modal Login --%>
        <div class="modal fade" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="modal-login" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <form class="form-signin">
                        <div class="modal-header">
                            <h5 class="modal-title">Login</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="col-sm-12">
                                <label for="Email" class="sr-only">Email</label>
                                <input type="email" id="email-login" class="form-control" placeholder="Email address" required autofocus="">
                                <label for="Password" class="sr-only">Password</label>
                                <input type="password" id="password-login" class="form-control" placeholder="Password" required autofocus="">
                            </div>                        
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />