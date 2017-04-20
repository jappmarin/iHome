<%-- 
    Document   : room
    Created on : Apr 20, 2017, 6:50:14 PM
    Author     : tkitb
--%>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
        <div class="container mt-5">
            <div class="row justify-content-center my-2">
                <div class="card">
                    <h3 class="card-header">ห้อง A ของ Homestay A</h3>
                    <div class="card-block">
                        <div class="row justify-content-center">
                            <div class="col-sm-6">
                                <div id="carousel" class="carousel slide" data-ride="carousel">
                                    <div class="carousel-inner" role="listbox">
                                        <div class="carousel-item active">
                                            <img class="d-block detail-img" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg" alt="">
                                        </div>
                                        <div class="carousel-item">
                                            <img class="d-block detail-img" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983992-full.jpg" alt="">
                                        </div>
                                        <div class="carousel-item">
                                            <img class="d-block detail-img" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983990-full.jpg" alt="">
                                        </div>
                                    </div>
                                    <a class="carousel-control-prev" href="#carousel" role="button" data-slide="prev">
                                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                        <span class="sr-only">Previous</span>
                                    </a>
                                    <a class="carousel-control-next" href="#carousel" role="button" data-slide="next">
                                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                        <span class="sr-only">Next</span>
                                    </a>
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="card">
                                    <div class="card-block">
                                        <h4 class="card-title">รายละเอียดห้องพัก</h4>
                                        <p class="card-text">ใส่ข้อความที่นี่</p>
                                        <h4 class="card-title">ราคาต่อคืน</h4>
                                        <p class="card-text">100 บาท</p>
                                        <h4 class="card-title">จำนวนผู้เข้าพัก</h4>
                                        <div class="form-inline">
                                            <button class="btn btn-primary btn-sm mr-2 ml-2 mb-3" onclick="removeGuest();">-</button>
                                            <input class="form-control mr-2 ml-2 mb-3" style="width: 45px;" type="text" id="guest" name="guest" value="1">
                                            <button class="btn btn-primary btn-sm mr-2 ml-2 mb-3    " onclick="addGuest();">+</button>
                                        </div>
                                        <script>
                                            var i = 1;
                                            function addGuest() {
                                                if (i >= 1 & i < 10) {
                                                    i++;
                                                    document.getElementById("guest").value = i;
                                                }
                                            }
                                            function removeGuest() {
                                                if (i > 1 & i <= 10) {
                                                    i--;
                                                    document.getElementById("guest").value = i;
                                                }
                                            }
                                        </script>
                                        <a href="${SITE_URL}/Booking/?id=" class="btn btn-primary btn-lg">Booking</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row justify-content-center my-2">
                <div class="card">
                    <h3 class="card-header">ห้อง B ของ Homestay A</h3>
                    <div class="card-block">
                        <div class="row justify-content-center">
                            <div class="col-sm-6">
                                <div id="carousel" class="carousel slide" data-ride="carousel">
                                    <div class="carousel-inner" role="listbox">
                                        <div class="carousel-item active">
                                            <img class="d-block detail-img" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg" alt="">
                                        </div>
                                        <div class="carousel-item">
                                            <img class="d-block detail-img" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983992-full.jpg" alt="">
                                        </div>
                                        <div class="carousel-item">
                                            <img class="d-block detail-img" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983990-full.jpg" alt="">
                                        </div>
                                    </div>
                                    <a class="carousel-control-prev" href="#carousel" role="button" data-slide="prev">
                                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                        <span class="sr-only">Previous</span>
                                    </a>
                                    <a class="carousel-control-next" href="#carousel" role="button" data-slide="next">
                                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                        <span class="sr-only">Next</span>
                                    </a>
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="card">
                                    <div class="card-block">
                                        <h4 class="card-title">รายละเอียดห้องพัก</h4>
                                        <p class="card-text">ใส่ข้อความที่นี่</p>
                                        <h4 class="card-title">ราคาต่อคืน</h4>
                                        <p class="card-text">100 บาท</p>
                                        <h4 class="card-title">จำนวนผู้เข้าพัก</h4>
                                        <div class="form-inline">
                                            <button class="btn btn-primary btn-sm mr-2 ml-2 mb-3" onclick="removeGuest2();">-</button>
                                            <input class="form-control mr-2 ml-2 mb-3" style="width: 45px;" type="text" id="guest2" name="guest" value="1">
                                            <button class="btn btn-primary btn-sm mr-2 ml-2 mb-3    " onclick="addGuest2();">+</button>
                                        </div>
                                        <script>
                                            var i2 = 1;
                                            function addGuest2() {
                                                if (i2 >= 1 & i2 < 10) {
                                                    i2++;
                                                    document.getElementById("guest2").value = i2;
                                                }
                                            }
                                            function removeGuest2() {
                                                if (i2 > 1 & i2 <= 10) {
                                                    i2--;
                                                    document.getElementById("guest2").value = i2;
                                                }
                                            }
                                        </script>
                                        <a href="${SITE_URL}/Booking/?id=" class="btn btn-primary btn-lg">Booking</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />