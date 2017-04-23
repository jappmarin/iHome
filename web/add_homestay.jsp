<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
        <div class="container">
            <div class="row justify-content-center my-3">
                <div class="col-sm-12 col-md-8" id="homestay">
                    <div class="card">
                        <h3 class="card-header">My Homestay</h3>
                        <div class="card-block">
                            <form action="AddHomestay" method="GET">
                                <div class="form-group has-feedback" id="homestayNameInDiv">
                                    <label for="homestayname">ชื่อโฮมสเตย์</label>
                                    <input type="text" class="form-control" name="homestay_name" value="" id="homestayNameIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="describeInDiv">
                                    <label for="describe">รายละเอียดโฮมสเตย์</label>
                                    <input type="text" class="form-control" id="describeIn" rows="2" name="homestay_desc" value="">
                                </div>
                                <div class="form-group has-feedback" id="licenseInDiv">
                                    <label for="license">เลขที่ใบอนุญาตของโฮมสเตย์</label>
                                    <input class="form-control" id="licenseIn" name="homestay_license">
                                </div>
                                <div class="form-group has-feedback" id="addressInDiv">
                                    <label for="addresse">ที่อยู่</label>
                                    <input type="text" class="form-control" id="addressIn" rows="2" name="homestay_address" value="">
                                </div>
                                <div class="form-group has-feedback" id="districtInDiv">
                                    <label for="district">อำเภอ</label>
                                    <input type="text" class="form-control" name="homestay_district" value="" id="districtIn" placeholder="" required>
                                </div>
                                <div class="form-group has-feedback" id="provinceInDiv">
                                    <label for="province">จังหวัด</label>
                                    <input type="text" class="form-control" name="homestay_province" id="provinceIn" placeholder="" required>
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
                                            <input type="radio" class="form-check-input" name="homestay_region" id="northIn" value="N" checked>
                                            ภาคเหนือ
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="homestay_region" id="nothEastIn" value="NE">
                                            ภาคตะวันออกเฉียงเหนือ
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="homestay_region" id="westIn" value="W">
                                            ภาคตะวันตก
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="homestay_region" id="centralIn" value="C">
                                            ภาคกลาง
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="homestay_region" id="eastIn" value="E">
                                            ภาคตะวันออก
                                        </label>
                                    </div>
                                    <div class="form-check form-check-inline">
                                        <label class="form-check-label">
                                            <input type="radio" class="form-check-input" name="homestay_region" id="southIn" value="S">
                                            ภาคใต้
                                        </label>
                                    </div>
                                </fieldset>
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