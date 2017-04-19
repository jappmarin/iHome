<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-sm-12 col-md-8" id="homestay">
            <div class="card">
                <h3 class="card-header">My Room</h3>
                <div class="card-block">
                    <form action="AddRoom" method="get">
                        <div class="form-group has-feedback" id="homestayNameInDiv">
                            <label for="homestayname">ชื่อห้อง</label>
                            <input type="text" class="form-control" name="room_name" id="roomNameIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="priceInDiv">
                            <label for="price">ราคาต่อคืน</label>
                            <input type="text" class="form-control" name="room_price" id="priceIn" placeholder="" required>
                        </div>
                        <div class="form-group has-feedback" id="guestInDiv">
                            <label for="guest">จำนวนผู้เข้าพักสูงสุด</label>
                            <input type="text" class="form-control" name="room_limit" id="limitIn" placeholder="" required>
                        </div>
                        <label for="facilities"> สิ่งอำนวยความสะดวก </label>
                        <div class="row">
                            <div class="col">
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="1" > โทรทัศน์
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="23" > โทรศัพท์บ้าน
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="26" > ชุดโซฟา
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="6" > ตู้เสื้อผ้า
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="27" > โต๊ะเครื่องแป้ง
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="20" > เตารีด
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="8" > โคมไฟ
                                    </label>
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="9" > พัดลมตั้งโต๊ะ
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="10" > พัดลมเพดาน
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="11" > เครื่องปรับอากาศ
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="13" > กาต้มน้ำร้อน
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="14" > ไดร์เป่าผม
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="15" > อินเทอร์เน็ต
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="16" > คอมพิวเตอร์
                                    </label>
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="19" > ฝักบัว
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="18" > เครื่องทำน้ำอุ่น
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="22" > เตาอบไมโครเวฟ
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="2" > ตู้เย็น
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="25" > ครัว
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="21" > ที่จอดรถ
                                    </label>
                                </div>
                                <div class="form-check">
                                    <label class="form-check-label">
                                        <input type="checkbox" class="form-check-input" name="facilities" id="tvIn" value="24" > จักรยาน
                                    </label>
                                </div>
                            </div>
                        </div>
                        <label for="facilities"> ประเภทเตียง :    </label>
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" name="facilities" id="inlineCheckbox1" value="28"> เตียงเดี่ยว
                            </label>
                        </div>
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" name="facilities" id="inlineCheckbox2" value="29"> เตียงคู่
                            </label>
                        </div>
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" name="facilities" id="inlineCheckbox3" value="30"> เตียง 2 ชั้น
                            </label>
                        </div>
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" name="facilities" id="inlineCheckbox3" value="31" > ฝูกนอน
                            </label>
                        </div>
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" name="facilities" id="inlineCheckbox3" value="32"> เต็นท์
                            </label>
                        </div>
                        <div class="form-check form-check-inline">
                            <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" name="facilities" id="inlineCheckbox3" value=""> อื่นๆ
                            </label>
                        </div>
                        
                        <div class="col text-center">
                            <label for="guest">อัพโหลดรูปภาพ</label>
                            <div class="form-group has-feedback">
                                <label class="custom-file">
                                    <input type="file" id="file" class="custom-file-input">
                                    <span class="custom-file-control"></span>
                                </label>
                                <small id="fileHelp" class="form-text text-muted">Upload .jpg, .png extensions only.</small>
                            </div>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary btn-block" id="addHomestayButton">Add Room</button>
                            <button class="btn btn-secondary btn-block" id="addHomestayButton">Cancel</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />