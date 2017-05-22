<%@page import="model.Room"%>
<%@page import="controller.Review"%>
<%@page import="model.Comment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Homestay"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% Homestay homestay = (Homestay) request.getAttribute("homestay");%>
<div class="container my-2">
    <div class="row justify-content-center">
        <div class="col-sm-12">
            <div class="card">
                <h3 class="card-header"><%=homestay.getHs_name()%></h3>
                <div class="card-block">
                    <div class="row justify-content-center">
                        <div class="col-sm-6">
                            <img class="d-block" style="height: 100%; width: 100%;" src="${SITE_URL}/asset/img/homestay/<%=homestay.getHs_pic()%>" alt="">
                        </div>
                        <div class="col-sm-6">
                            <div class="card">
                                <div class="card-block">
                                    <h4 class="card-title">รายละเอียดบ้านพัก</h4>
                                    <p> คะแนนเฉลี่ย : <%=request.getAttribute("score")%> คะแนน</p>
                                    <p> ติดต่อ : <%=homestay.getContact().substring(0, 3)%>-<%=homestay.getContact().substring(3, 6)%>-<%=homestay.getContact().substring(6, 10)%>
                                    <p class="card-text"><%=homestay.getHs_desc()%></p>
                                    <p class="card-text">สถานที่ใกล้เคียง</p>
                                    <%for (String near : homestay.getNear_homestay()) {%>
                                    <p class="card-text">- <%=near%> <br> </p> 
                                    <%}%>
                                </div>
                            </div>
                        </div>
                    </div>
                    <% if (request.getAttribute("allRoom") != null) { %>
                    <% ArrayList<Room> allRoom = (ArrayList<Room>) request.getAttribute("allRoom");
                        for (model.Room room : allRoom) {%>
                    <div class="row justify-content-center my-2">
                        <div class="col-sm-12">
                            <div class="card">
                                <h3 class="card-header">ห้อง <%=room.getRoom_name()%> ของ <%=homestay.getHs_name()%></h3>
                                <div class="card-block">
                                    <div class="row justify-content-center">
                                        <div class="col-sm-12">
                                            <div class="card">
                                                <div class="card-block">
                                                    <h4 class="card-title">รายละเอียดห้องพัก</h4>
                                                    <%for (String fac : room.getFacilities()) {%>
                                                    <p class="card-text">- <%=fac%> <br> </p> 
                                                        <%}%>
                                                    <h4 class="card-title">ราคาต่อคืน</h4>
                                                    <p class="card-text"><%=room.getRoom_price()%></p>
                                                    <h4 class="card-title">จำนวนผู้เข้าพักสูงสุด</h4>
                                                    <p class="card-text"><%=room.getRoom_limit()%> คน</p>
                                                    <a href="${SITE_URL}/Booking/?id=<%=room.getRoom_id()%>" class="btn btn-primary btn-lg">Booking</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <% }
                        }%>
                </div>
            </div>
        </div>
    </div>

    <div class="row justify-content-center my-2">
        <div class="col-sm-12">
            <div class="card">
                <h3 class="card-header">Comment</h3>
                <div class="card-block">
                    <ul class="list-unstyled">
                        <% if (request.getAttribute("allComment") != null) { %>
                        <% ArrayList<Comment> allComment = (ArrayList<Comment>) request.getAttribute("allComment");
                            for (model.Comment comment : allComment) {%>
                        <li class="media">
                            <div class="media-body">
                                <h5 class="mt-0 mb-1"><%=comment.getFirstname()%> <%=comment.getLastname()%></h5>
                                <p><%=comment.getText()%></p>
                            </div>
                        </li>
                        <hr>
                        <% }
                            }%>
                        <li class="media">
                            <div class="media-body">
                                <% if (session.getAttribute("customer") != null) {%>
                                <form action="${SITE_URL}/Review/?id=<%=homestay.getHs_id()%>" method="POST">
                                    <fieldset class="form-group">
                                        <legend>ให้คะแนนโฮมสเตย์</legend>
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input type="radio" class="form-check-input" name="score" id="score1" value="1">
                                                1 คะแนน
                                            </label>
                                        </div>
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input type="radio" class="form-check-input" name="score" id="score2" value="2">
                                                2 คะแนน
                                            </label>
                                        </div>
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input type="radio" class="form-check-input" name="score" id="score3" value="3">
                                                3 คะแนน
                                            </label>
                                        </div>
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input type="radio" class="form-check-input" name="score" id="score4" value="4">
                                                4 คะแนน
                                            </label>
                                        </div>
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input type="radio" class="form-check-input" name="score" id="score5" value="5">
                                                5 คะแนน
                                            </label>
                                        </div>
                                    </fieldset>
                                    <textarea name="comment" rows="3" style="width: 100%; margin-top: 10px; margin-bottom: 10px;"></textarea>
                                    <button type="submit" class="btn btn-success btn-lg">Comment</button>
                                </form>
                                <% }%>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />