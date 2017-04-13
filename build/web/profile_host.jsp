<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.isNew()) {  %><jsp:include page="templates/header.jsp" /><% } else { %><jsp:include page="templates/headerauth.jsp" /><% }%>
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-4" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Profile</h3>
                        <div class="card-block">
                            <p>Username : ${sessionScope.username}</p>
                            <p>Name : ${sessionScope.firstname} ${sessionScope.lastname}</p>
                            <p>Email : ${sessionScope.email}</p>
                            <p>Phone Number : ${sessionScope.phone}</p>
                            <button type="submit" class="btn btn-primary btn-block">Edit Profile</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-8" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Homestay</h3>
                        <div class="card-block">
                            <p>Homestay Name : ${sessionScope.hs_name}</p>
                            <p>Price : ${sessionScope.hs_price} Bath / Night</p>
                            <p>Guest : ${sessionScope.hs_guest} Person</p>
                            <div id="map" style="height:200px"></div>
                            <script>
                                function initMap() {
                                    var location = {lat: 13.730994, lng: 100.781260};
                                    var map = new google.maps.Map(document.getElementById('map'), {
                                        zoom: 17,
                                        center: location
                                    });
                                    var marker = new google.maps.Marker({
                                        position: location,
                                        map: map,
                                        title: 'IT KMITL'
                                    });
                                }
                            </script>
                            <a href="edit_homestay.jsp" class="btn btn-primary btn-block mt-3">Edit Homestay</a>
                            <a href="add_homestay.jsp" class="btn btn-success btn-block mt-3">Add Homestay</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />