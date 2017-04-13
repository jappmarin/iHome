<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.isNew()) {  %><jsp:include page="templates/header.jsp" /><% } else { %><jsp:include page="templates/headerauth.jsp" /><% }%>
        <div class="container">
            <div class="row justify-content-center mt-5">
                <div class="col-md-9">
                    <div class="card">
                        <h3 class="card-header">Control Panel</h3>
                        <div class="card-block">
                            <table class="table table-bordered text-center" style="background-color: #fff">
                                <thead>
                                    <tr>
                                        <th class="text-center">#</th>
                                        <th class="text-center">Homestay Name</th>
                                        <th class="text-center">Homestay Detail</th>
                                        <th class="text-center">Status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row" class="text-center">1</th>
                                        <td>Example 1</td>
                                        <td></td>
                                        <td><button type="button" class="btn btn-success">Success</button></td>
                                    </tr>
                                    <tr>
                                        <th scope="row" class="text-center">2</th>
                                        <td>Example 2</td>
                                        <td></td>
                                        <td><button type="button" class="btn btn-warning">Warning</button></td>
                                    </tr>
                                    <tr>
                                        <th scope="row" class="text-center">3</th>
                                        <td>Example 3</td>
                                        <td></td>
                                        <td><button type="button" class="btn btn-warning">Warning</button></td>
                                    </tr>
                                    <tr>
                                        <th scope="row" class="text-center">4</th>
                                        <td>Example 4</td>
                                        <td></td>
                                        <td><button type="button" class="btn btn-warning">Warning</button></td>
                                    </tr>
                                </tbody>
                            </table>
                            <button type="submit" class="btn btn-primary btn-block" id="signUpButton">Save change</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />