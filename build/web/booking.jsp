<%@page import="model.Homestay"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<% Homestay homestay = (Homestay) request.getAttribute("homestay");%>
        <div class="container mt-5">
            <form action="${SITE_URL}/BookingConfirm/?id=<%=homestay.getHs_id()%>" method="POST">
                <div class="row justify-content-center mt-3 mb-3">
                    <div class="col-sm-12 col-md-6">
                        <div class="card">
                            <h3 class="card-header">Customer Information</h3>
                            <div class="card-block">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group has-feedback" id="firstNameInDiv">
                                            <label for="firstname">First Name</label>
                                            <input type="text" class="form-control" name="firstname" id="firstNameIn" placeholder="John" value="${sessionScope.customer.firstname}" required>
                                        </div>
                                        <div class="form-group has-feedback" id="lastNameInDiv">
                                            <label for="firstname">Last Name</label>
                                            <input type="text" class="form-control" name="lastname" id="lastNameIn" placeholder="English" value="${sessionScope.customer.lastname}" required>
                                        </div>
                                        <div class="form-group has-feedback" id="emailInDiv">
                                            <label for="username">Email</label>
                                            <input type="email" class="form-control" name="email" id="emailIn" placeholder="john@english.com" value="${sessionScope.customer.email}" required>
                                        </div>
                                        <div class="form-group has-feedback" id="phneInDiv">
                                            <label for="phone">Phone Number</label>
                                            <input type="text" class="form-control" name="phone" id="phoneIn" placeholder="094-546-467" value="${sessionScope.customer.phone}" required>
                                        </div>  
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-12 col-md-6">
                        <div class="card">
                            <h3 class="card-header">Booking Information</h3>
                            <div class="card-block">
                                <div class="row">
                                    <div class="col">
                                        <div class="form-group has-feedback" id="homestayNameInDivInDiv">
                                            <label for="homestayName">Homestay Name</label>
                                            <input type="text" class="form-control" name="homestayname" id="homestayNameIn" placeholder="" value="<%=homestay.getHs_name()%>" required>
                                        </div>
                                        <div class="form-group has-feedback" id="checkinInDiv">
                                            <label for="checkin">Check-in</label>
                                            <input type="date" class="form-control" name="checkin" id="checkinIn" placeholder="" required>
                                        </div>
                                        <div class="form-group has-feedback" id="checkoutInDiv">
                                            <label for="checkout">Check-out</label>
                                            <input type="date" class="form-control" name="checkout" id="checkoutIn" placeholder="" onchange="totalDate();" required>
                                        </div>
                                        <div class="form-group has-feedback" id="priceInDiv">
                                            <label for="price">Price Total</label>
                                            <input type="text" class="form-control" name="price" id="priceIn" placeholder="" value="" disabled>
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" class="btn btn-primary btn-block" id="confirmButton">Confirm Booking</button>
                                            <a class="btn btn-secondary btn-block" href="${SITE_URL}/Booking/?id=<%=homestay.getHs_id()%>" id="cancelButton">Cancel</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div> 
                </div>
            </form>
        </div>
        <script>
            function totalDate() {
                var diff = (Math.ceil((new Date(document.getElementById("checkoutIn").value) - new Date(document.getElementById("checkinIn").value)) / (1000 * 3600 * 24)));
                document.getElementById("priceIn").value = diff;
            }
        </script>
<jsp:include page="templates/footer.jsp" />