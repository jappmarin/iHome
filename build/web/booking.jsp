<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container mt-5">
            <div class="row justify-content-center mt-3 mb-3">
                <div class="col-sm-12 col-md-6">
                    <div class="card">
                        <h3 class="card-header">Customer Information</h3>
                        <div class="card-block">
                            <div class="row">
                                <div class="col-sm-12">
                                    <form action="/Booking" method="POST">
                                        <div class="form-group has-feedback" id="firstNameInDiv">
                                            <label for="firstname">First Name</label>
                                            <input type="text" class="form-control" name="firstname" id="firstNameIn" placeholder="John" required>
                                        </div>
                                        <div class="form-group has-feedback" id="lastNameInDiv">
                                            <label for="firstname">Last Name</label>
                                            <input type="text" class="form-control" name="lastname" id="lastNameIn" placeholder="English" required>
                                        </div>
                                        <div class="form-group has-feedback" id="emailInDiv">
                                            <label for="username">Email</label>
                                            <input type="email" class="form-control" name="email" id="emailIn" placeholder="john@english.com" required>
                                        </div>
                                        <div class="form-group has-feedback" id="phneInDiv">
                                            <label for="phone">Phone Number</label>
                                            <input type="text" class="form-control" name="phone" id="phoneIn" placeholder="094-546-467" required>
                                        </div>  
                                    </form>
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
                                    <form action="/Booking" method="POST">
                                        <div class="form-group has-feedback" id="homestayNameInDivInDiv">
                                            <label for="homestayName">Homestay Name</label>
                                            <input type="text" class="form-control" name="homestayname" id="homestayNameIn" placeholder="" value="Example A" required disabled>
                                        </div>
                                        <div class="form-group has-feedback" id="checkinInDiv">
                                            <label for="checkin">Check-in</label>
                                            <input type="date" class="form-control" name="checkin" id="checkinIn" placeholder="" required>
                                        </div>
                                        <div class="form-group has-feedback" id="checkoutInDiv">
                                            <label for="checkout">Check-out</label>
                                            <input type="date" class="form-control" name="checkout" id="checkoutIn" placeholder="" required>
                                        </div>
                                        <div class="form-group has-feedback" id="priceInDiv">
                                            <label for="price">Price Total</label>
                                            <input type="text" class="form-control" name="price" id="priceIn" placeholder="" required>
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" class="btn btn-primary btn-block" id="signUpButton">Confirm Booking</button>
                                            <button type="submit" class="btn btn-secondary btn-block" id="signUpButton">Cancel</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> 
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />