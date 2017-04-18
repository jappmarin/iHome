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
                                    <label for="homestayname">ชื่อโฮมสเตย์</label>
                                    <input type="text" class="form-control" name="homestayname" id="homestayNameIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="describeInDiv">
                                    <label for="describe">รายละเอียดโฮมสเตย์</label>
                                    <textarea class="form-control" id="describeIn" rows="2"></textarea>
                                </div>
                                <div class="form-group has-feedback" id="priceInDiv">
                                    <label for="price">ราคาต่อคืน</label>
                                    <input type="text" class="form-control" name="price" id="priceIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="guestInDiv">
                                    <label for="guest">จำนวนผู้เข้าพัก</label>
                                    <input type="text" class="form-control" name="guest" id="guestIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="addressInDiv">
                                    <label for="addresse">ที่อยู่</label>
                                    <textarea class="form-control" id="addressIn" rows="2"></textarea>
                                </div>
                                <div class="form-group has-feedback" id="districtInDiv">
                                    <label for="district">อำเภอ</label>
                                    <input type="text" class="form-control" name="district" id="districtIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="provinceInDiv">
                                    <label for="province">จังหวัด</label>
                                    <input type="text" class="form-control" name="province" id="provinceIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="zipInDiv">
                                    <label for="zip">รหัสไปรษณีย์</label>
                                    <input type="text" class="form-control" name="zip" id="zipIn" placeholder="" required>
                                </div>
                                <fieldset class="form-group">
                                    <div class="form-group">
                                        <label>ภูมิภาค</label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="optionsRadios" id="northIn" value="North" checked>
                                            ภาคเหนือ
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="optionsRadios" id="nothEastIn" value="NorthEast">
                                            ภาคตะวันออกเฉียงเหนือ
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="optionsRadios" id="westIn" value="West">
                                            ภาคตะวันตก
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="optionsRadios" id="centralIn" value="Central">
                                            ภาคกลาง
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="optionsRadios" id="eastIn" value="East">
                                            ภาคตะวันออก
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="optionsRadios" id="southIn" value="South">
                                            ภาคใต้
                                        </label>
                                    </div>
                                </fieldset>
                                <label for="guest">อัพโหลดรูปภาพ</label>
                                <div class="form-group has-feedback">
                                    <label class="custom-file">
                                        <input type="file" id="file" class="custom-file-input">
                                        <span class="custom-file-control"></span>
                                    </label>
                                    <small id="fileHelp" class="form-text text-muted">Upload .jpg, .png extensions only.</small>
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
                                    <button class="btn btn-secondary btn-block" id="addHomestayButton">Cancel</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />