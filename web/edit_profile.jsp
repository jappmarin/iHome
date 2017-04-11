<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
        <div class="container mt-5">
            <div class="row justify-content-center">
                <div class="col-sm-8">
                    <div class="card">
                        <h3 class="card-header">Edit Profile</h3>
                        <div class="card-block">
                            <div class="row">
                                <div class="col-sm-5">
                                    <img src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22200%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20200%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15b150638a9%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15b150638a9%22%3E%3Crect%20width%3D%22200%22%20height%3D%22200%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2275.5%22%20y%3D%22104.5%22%3E200x200%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" alt="..." class="rounded img-thumbnail mx-auto d-block">
                                    <br>
                                    <label class="custom-file mx-auto d-block">
                                        <input type="file" id="file" class="custom-file-input form-control-sm">
                                        <span class="custom-file-control"></span>
                                    </label>
                                    <br>
                                </div>
                                <div class="col">
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td class="align-middle">First name:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="First name" value="Teerawut">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Last name:</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Last name" value="Kitbunjerdjarud">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Identify Number:</td>
                                                <td>
                                                    <div class="col-sm-12">
                                                        <p class="form-control-static">1122121212121</p>
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Date of Birth</td>
                                                <td>
                                                    <input type="date" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="" value="11/08/1996">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Gender</td>
                                                <td>
                                                    <select class="custom-select mb-2 mr-sm-2 mb-sm-0" id="inlineFormCustomSelect">
                                                        <option value="1" selected="">Male</option>
                                                        <option value="2">Female</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Home Address</td>
                                                <td><textarea class="form-control" id="exampleTextarea" rows="3">Test อิอิ</textarea></td>
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Email</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Email address" value="example@example.com">
                                            </tr>
                                            <tr>
                                                <td class="align-middle">Phone Number</td>
                                                <td>
                                                    <input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="inlineFormInput" placeholder="Phone number" value="0892344567">
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <div class="row">
                                        <div class="col">
                                            <a href="#" class="btn btn-primary">Update Profile</a>
                                            <a href="#" class="btn btn-secondary">Cancel</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />