<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container mt-5">
            <div class="row">
                <div class="col-5">
                    <div class="card">
                        <h3 class="card-header">Booking Number - #00001</h3>
                        <div class="card-block">
                            <h5 class="card-title">Booking Number : <small class="text-muted">00001</small></h5>
                            <h5 class="card-title">Pincode : <small class="text-muted">1234</small></h5>
                            <h5 class="card-title">Name : <small class="text-muted">Teerawut Kitbunjerdjarud</small></h5>
                            <h5 class="card-title">Phone Number : <small class="text-muted">055-555-555</small></h5>
                            <h5 class="card-title">Email : <small class="text-muted">example@example.com</small></h5>
                        </div>
                    </div>
                </div>
                <div class="col-7">
                    <div class="card">
                        <h3 class="card-header">Booking Detail</h3>
                        <div class="card-block">
                            <h5 class="card-title">Homestay Name : <small class="text-muted">Example 1</small></h5>
                            <h5 class="card-title">Booking Detail : <small class="text-muted">2 nights, 1 Room, 2 People</small></h5>
                            <h5 class="card-title">Checkin : <small class="text-muted">31/03/2017</small></h5>
                            <h5 class="card-title">Checkout : <small class="text-muted">02/04/2017</small></h5>
                            <h5 class="card-title">Room Price : <small class="text-muted">3000 THB</small></h5>
                            <h5 class="card-title">Contact : <small class="text-muted">012-345-678</small></h5>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row mt-4">
                <div class="col-12">
                    <div id="map" style="height:400px"></div>
                    <script>
                        function initMap() {
                            var uluru = {lat: 13.730994, lng: 100.781260};
                            var map = new google.maps.Map(document.getElementById('map'), {
                                zoom: 17,
                                center: uluru
                            });
                            var marker = new google.maps.Marker({
                                position: uluru,
                                map: map
                            });
                        }
                    </script>
                </div>
            </div>
            <div class="row justify-content-center mt-5">
                <div class="col-1">
                    <button type="button" class="btn btn-primary btn-lg">Print</button>
                </div>
            </div>
        </div>
<jsp:include page="templates/modal.jsp" />
<jsp:include page="templates/footer.jsp" />