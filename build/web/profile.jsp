<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-4" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Profile</h3>
                        <div class="card-block">
                            <p>Username : ${sessionScope.customer.username}</p>
                            <p>Name : ${sessionScope.customer.firstname} ${sessionScope.cutomer.lastname}</p>
                            <p>Email : ${sessionScope.customer.email}</p>
                            <p>Phone Number : ${sessionScope.customer.phone}</p>
                            <button type="submit" class="btn btn-primary btn-block">Edit Profile</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />