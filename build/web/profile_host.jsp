<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-sm-4" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Profile</h3>
                        <div class="card-block">
                            <p>Username : iamteerawut</p>
                            <p>Name : Teerawut Kitbunjerdjarud</p>
                            <p>Email : t.kitbunjerdjarud@gmail.com</p>
                            <p>Phone Number : 094-546-4678</p>
                            <button type="submit" class="btn btn-primary btn-block">Edit Profile</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-8" id="profile">
                    <div class="card">
                        <h3 class="card-header">My Homestay</h3>
                        <div class="card-block">
                            <p>Homestay Name : Example A</p>
                            <p>Price : 200 Bath / Night / Person</p>
                            <p>Guest : 5 Person</p>
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