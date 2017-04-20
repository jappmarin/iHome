<%--@page import="controller.Comment"--%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Homestay"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% Homestay homestay = (Homestay) request.getAttribute("homestay");%>
<div class="container my-2">
    <div class="row justify-content-center">
        <div class="card">
            <h3 class="card-header"><%=homestay.getHs_name()%></h3>
            <div class="card-block">
                <div class="row justify-content-center">
                    <div class="col-sm-6">
                        <img class="d-block" style="height: 100%; width: 100%;" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg" alt="">
                    </div>
                    <div class="col-sm-6">
                        <div class="card">
                            <div class="card-block">
                                <h4 class="card-title">Homestay Detail</h4>
                                <p class="card-text"><%=homestay.getHs_desc()%></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row justify-content-center my-2">
        <div class="card">
            <h3 class="card-header">ห้อง A ของ <%=homestay.getHs_name()%></h3>
            <div class="card-block">
                <div class="row justify-content-center">
                    <div class="col-sm-6">
                        <img class="d-block" style="height: 100%; width: 100%;" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg" alt="">
                    </div>
                    <div class="col-sm-6">
                        <div class="card">
                            <div class="card-block">
                                <h4 class="card-title">รายละเอียดห้องพัก</h4>
                                <p class="card-text"><%=homestay.getHs_desc()%></p>
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
            <h3 class="card-header">ห้อง B ของ <%=homestay.getHs_name()%></h3>
            <div class="card-block">
                <div class="row justify-content-center">
                    <div class="col-sm-6">
                        <img class="d-block" style="height: 100%; width: 100%;" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg" alt="">
                    </div>
                    <div class="col-sm-6">
                        <div class="card">
                            <div class="card-block">
                                <h4 class="card-title">รายละเอียดห้องพัก</h4>
                                <p class="card-text"><%=homestay.getHs_desc()%></p>
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
        <div class="card mt-3 mb-3">
            <h3 class="card-header">Comment</h3>
            <div class="card-block">
                <ul class="list-unstyled">
                    <%-- if (request.getAttribute("allComment") != null) { --%>
                    <%-- ArrayList<Comment> allComment = (ArrayList<Comment>) request.getAttribute("allComment");
                    for (model.Comment comment: allComment) {--%>
                    <li class="media">
                        <div class="media-body">
                            <h5 class="mt-0 mb-1"><%--=comment.getFirstname()%> <%=comment.getLastname()--%></h5>
                            <p><%--=comment.getText()--%></p>
                        </div>
                    </li>
                    <hr>
                    <%-- }
    } --%>
                    <li class="media">
                        <div class="media-body">
                            <form action="${SITE_URL}/Review/?&id=<%=homestay.getHs_id()%>" method="POST">
                                <textarea name="comment" rows="3" style="width: 100%; margin-top: 10px; margin-bottom: 10px;"></textarea>
                                <button type="submit" class="btn btn-success btn-lg">Comment</button>
                            </form>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
<jsp:include page="templates/footer.jsp" />