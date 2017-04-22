<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
        <div class="container">
            <div class="row justify-content-center my-2">
                <div class="col-sm-8" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Homestay</h3>
                        <div class="card-block">
                            <p>ชื่อโฮมสเตย์ : ${sessionScope.hs_name}</p>
                            <p>รายละเอียดโฮมสเตย์ : </p>
                            <a href="edit_homestay.jsp" class="btn btn-primary btn-block mt-3">Edit Homestay</a>
                            <div class="row justify-content-center my-2">
                                <div class="col-sm-12" id="profile">
                                    <div class="card">
                                        <h3 class="card-header">My Room</h3>
                                        <div class="card-block">
                                            <p>ชื่อห้อง : ${sessionScope.hs_name}</p>
                                            <p>ราคาห้อง : </p>
                                            <p>จำนวนผู้เข้าพักสูงสุด : </p>
                                            <a href="edit_room.jsp" class="btn btn-primary btn-block mt-3">Edit Room</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="row justify-content-center my-2">
                                <div class="col-sm-12" id="profile">
                                    <div class="card">
                                        <h3 class="card-header">My Room</h3>
                                        <div class="card-block">
                                            <p>ชื่อห้อง : ${sessionScope.hs_name}</p>
                                            <p>ราคาห้อง : </p>
                                            <p>จำนวนผู้เข้าพักสูงสุด : </p>
                                            <a href="edit_room.jsp" class="btn btn-primary btn-block mt-3">Edit Room</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <a href="add_room.jsp" class="btn btn-info btn-block mt-3">Add Room</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row justify-content-center my-2">
                <div class="col-sm-8">
                    <a href="add_homestay.jsp" class="btn btn-success btn-block mt-3">Add Homestay</a>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />