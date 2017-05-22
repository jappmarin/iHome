<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container">
            <div class="row justify-content-center">
                <ul class="nav nav-pills nav-fill" id="tab-nav">
                    <a href="javascript:;" class="nav-link active" data-container="form-A">for HOST</a>
                    <a href="javascript:;" class="nav-link" data-container="form-B">for GUEST</a>
                </ul>
            </div>
            <div class="row justify-content-center mt-5">
                <div class="col-sm-12 col-md-8" id="signup">
                    <div class="card">
                        <div id="form-container">
                            <div id="form-A">
                                <h3 class="card-header">Sign Up for Host</h3>
                                <div class="card-block">
                                    <form action="${SITE_URL}/Signup" method="POST">
                                        <% session.setAttribute("cus_type", "HOST"); %>
                                        <div class="form-group has-feedback" id="firstNameInDiv">
                                            <label for="firstname">First Name</label>
                                            <input type="text" class="form-control" name="firstname" id="firstNameIn" placeholder="John">
                                        </div>
                                        <div class="form-group has-feedback" id="lastNameInDiv">
                                            <label for="lastname">Last Name</label>
                                            <input type="text" class="form-control" name="lastname" id="lastNameIn" placeholder="English">
                                        </div>
                                        <div class="form-group has-feedback" id="usernameInDiv">
                                            <label for="username">Username</label>
                                            <input type="text" class="form-control" name="username" id="usernameIn" placeholder="johnenglish">
                                            <div class="form-control-feedback" id="usernameDuplicate" hidden>Sorry, that username's taken. Try another?</div>
                                        </div>
                                        <div class="form-group has-feedback" id="emailInDiv">
                                            <label for="email">Email</label>
                                            <input type="email" class="form-control" name="email" id="emailIn" placeholder="john@english.com">
                                        </div>
                                        <div class="form-group has-feedback" id="birthdateInDiv">
                                            <label for="birthdate">Birthdate</label>
                                            <input type="date" class="form-control" name="birthdate" id="birthdateIn" placeholder="">
                                        </div>
                                        <div class="form-group has-feedback" id="phoneInDiv">
                                            <label for="phone">Phone Number</label>
                                            <input type="text" class="form-control" name="phone" id="phoneIn" placeholder="">
                                        </div>
                                        <div class="form-group has-feedback" id="passInDiv">
                                            <label for="password">Password</label>
                                            <input type="password" class="form-control" name="password" id="passIn">
                                        </div>
                                        <div class="form-group has-feedback" id="confirmPassInDiv">
                                            <label for="confirmPass">Confirm Password</label>
                                            <input type="password" class="form-control" name="confirmPass" id="confirmPassIn">
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-block" id="signUpButton">Sign Up</button>
                                    </form>
                                    <hr>
                                    <div class="text-center">
                                        <p>Already a member? <a href="${SITE_URL}/signin.jsp" class="btn btn-secondary btn-sm">Sign In</a></p>
                                    </div>
                                </div>
                            </div>
                            <div id="form-B" style="display: none;">
                                <h3 class="card-header">Sign Up for Guest</h3>
                                <div class="card-block">
                                    <form action="${SITE_URL}/Signup" method="POST">
                                        <% session.setAttribute("cus_type", "GUEST");%>
                                        <div class="form-group has-feedback" id="firstNameInDiv">
                                            <label for="firstname">First Name</label>
                                            <input type="text" class="form-control" name="firstname" id="firstNameIn" placeholder="John">
                                        </div>
                                        <div class="form-group has-feedback" id="lastNameInDiv">
                                            <label for="lastname">Last Name</label>
                                            <input type="text" class="form-control" name="lastname" id="lastNameIn" placeholder="English">
                                        </div>
                                        <div class="form-group has-feedback" id="usernameInDiv">
                                            <label for="username">Username</label>
                                            <input type="text" class="form-control" name="username" id="usernameIn" placeholder="johnenglish">
                                            <div class="form-control-feedback" id="usernameDuplicate" hidden>Sorry, that username's taken. Try another?</div>
                                        </div>
                                        <div class="form-group has-feedback" id="emailInDiv">
                                            <label for="email">Email</label>
                                            <input type="email" class="form-control" name="email" id="emailIn" placeholder="john@english.com">
                                        </div>
                                        <div class="form-group has-feedback" id="birthdateInDiv">
                                            <label for="birthdate">Birthdate</label>
                                            <input type="date" class="form-control" name="birthdate" id="birthdateIn" placeholder="">
                                        </div>
                                        <div class="form-group has-feedback" id="phoneInDiv">
                                            <label for="phone">Phone Number</label>
                                            <input type="text" class="form-control" name="phone" id="phoneIn" placeholder="">
                                        </div>
                                        <div class="form-group has-feedback" id="passInDiv">
                                            <label for="password">Password</label>
                                            <input type="password" class="form-control" name="password" id="passIn">
                                        </div>
                                        <div class="form-group has-feedback" id="confirmPassInDiv">
                                            <label for="confirmPass">Confirm Password</label>
                                            <input type="password" class="form-control" name="confirmPass" id="confirmPassIn">
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-block" id="signUpButton">Sign Up</button>
                                    </form>
                                    <hr>
                                    <div class="text-center">
                                        <p>Already a member? <a href="${SITE_URL}/signin.jsp" class="btn btn-secondary btn-sm">Sign In</a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<script type="text/javascript">
    (function () {
        var clack = function (e) {
            var e = e || window.event;
            if (e.srcElement) {
                e.target = e.srcElement;
            }
            ;
            var divs = document.getElementById("form-container").childNodes;
            for (var i = 0; i < divs.length; i++) {
                if (divs[i].firstChild !== null) {
                    divs[i].style.display = "none";
                }
            }
            document.getElementById(e.target.getAttribute("data-container")).style.display = "block";
            var links = document.getElementById("tab-nav").childNodes;
            for (var j = 0; j < links.length; j++) {
                if (links[j].firstChild !== null) {
                    links[j].className = "nav-link";
                }
            }
            e.target.className = "nav-link active";
        };
        var links = document.getElementById("tab-nav").childNodes;
        for (var i = 0; i < links.length; i++) {
            if (links[i].firstChild !== null) {
                links[i].onclick = clack;
            }
        }
    })();
</script>                       
<script src="${SITE_URL}/asset/js/authen.js"></script>
<jsp:include page="templates/footer.jsp" />