<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container mt-5">
            <div class="row justify-content-center mt-3 mb-3">
                <div class="col-sm-6">
                    <div class="card">
                        <h3 class="card-header">Customer Information</h3>
                        <div class="card-block">
                            <div class="row">
                                <div class="col">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td class="align-middle">First Name:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="First name">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Last Name:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Last name">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Identity Number or Passport Number:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Identity Number or Passport Number">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Date of Birth</td>
                                                <td>
                                                    <input type="date" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Email</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Email address">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Phone Number</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Phone number">
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>                
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card">
                        <h3 class="card-header">Homestay Book</h3>
                        <div class="card-block">
                            <div class="row">
                                <div class="col">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td class="align-middle">ชื่อโฮมสเตย์</td>
                                                <td>
                                                    <p>Example 1</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Check-in</td>
                                                <td>
                                                    <input type="date" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Last name">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Check-out</td>
                                                <td>
                                                    <input type="date" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Identity Number or Passport Number">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">จำนวนผู้เข้าพัก</td>
                                                <td>
                                                    <input type="date" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Last name">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Total Price</td>
                                                <td>
                                                    <p class="align-middle">500 Bath</p>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <div class="row">
                                        <div class="col">
                                            <a class="btn btn-primary" href="booking_confirm.html">Confirm</a>
                                            <a class="btn btn-secondary"  href="detail.html">Cancel</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

<jsp:include page="templates/modal.jsp" />
<jsp:include page="templates/footer.jsp" />