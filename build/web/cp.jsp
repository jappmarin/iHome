<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/headerauth.jsp" />
        <div class="container mt-5">
            <div class="row justify-content-center">
                <div class="col-sm-12">
                    <div class="card">
                        <h3 class="card-header">Control Panel</h3>
                        <div class="card-block">
                            <div class="row">
                                <div class="col-sm-12">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>ID_HOMESTAY</th>
                                                <th>HOMESTAY_NAME</th>
                                                <th>HOMESTAY_DETAIL</th>
                                                <th>STATUS</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="row">1</th>
                                                <td>Example 1</td>
                                                <td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal1">
                                                        View Detail
                                                    </button></td>
                                                <td><button type="button" class="btn btn-success">Approve</button></td>
                                            </tr>
                                            <tr>
                                                <th scope="row">2</th>
                                                <td>Example 2</td>
                                                <td>
                                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal2">
                                                        View Detail
                                                    </button>
                                                </td>
                                                <td><button type="button" class="btn btn-success">Approve</button></td>
                                            </tr>
                                            <tr>
                                                <th scope="row">3</th>
                                                <td>Example 3</td>
                                                <td>
                                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal3">
                                                        View Detail
                                                    </button>
                                                </td>
                                                <td><button type="button" class="btn btn-warning">Pending</button>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/modal.jsp" />
<jsp:include page="templates/footer.jsp" />