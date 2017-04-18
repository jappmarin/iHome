<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-sm-12 col-md-8" id="homestay">
            <div class="card">
                <h3 class="card-header">My Homestay</h3>
                <div class="card-block">
                    <form action="AddHomestay" method="POST">
                        <div class="form-group has-feedback" id="homestayNameInDiv">
                            <label for="homestayname">Homestay Name</label>
                            <input type="text" class="form-control" name="homestayname" id="homestayNameIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="detailInDiv">
                            <label for="detail">Homestay Detail</label>
                            <textarea class="form-control" name="detail" id="detailIn" rows="3"></textarea>
                        </div>
                        <div class="form-group has-feedback" id="priceInDiv">
                            <label for="price">Price</label>
                            <input type="text" class="form-control" name="price" id="priceIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="guestInDiv">
                            <label for="guest">Guest</label>
                            <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="guestInDiv">
                            <label for="guest">House number (บ้านเลขที่)</label>
                            <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="guestInDiv">
                            <label for="guest">Village number (หมู่ที่)</label>
                            <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="guestInDiv">
                            <label for="guest">District (ตำบล)</label>
                            <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="guestInDiv">
                            <label for="guest">District (อำเภอ)</label>
                            <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="guestInDiv">
                            <label for="guest">Province (จังหวัด)</label>
                            <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="guestInDiv">
                            <label for="guest">Zip Code (รหัสไปรษณีย์)</label>
                            <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                        </div>
                        <label for="upload">Upload Picture</label>
                        <div class="form-group has-feedback" id="uploadDiv">
                            <label class="custom-file">
                                <input type="file" id="file" class="custom-file-input">
                                <span class="custom-file-control"></span>
                            </label>
                            <small class="form-text text-muted">Upload .jpg, .png extensions only.</small>
                        </div>
                        <div class="form-group has-feedback" id="latitudeInDiv">
                            <label for="latitude">Latitude</label>
                            <input type="text" class="form-control" name="latitude" id="latitudeIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="longtitudeInDiv">
                            <label for="longtitude">Longtitude</label>
                            <input type="text" class="form-control" name="longtitude" id="longtitudeIn" placeholder="" required>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary btn-block" id="addHomestayButton">Add Homestay</button>
                            <button class="btn btn-secondary btn-block" id="cancelAddHomestayButton">Cancel</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />