<%@page import="java.util.ArrayList"%>
<%@page import="model.Homestay"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
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
                                <th class="text-center">Homestay License</th>
                                <th class="text-center">Status</th>
                                <th class="text-center">Control</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% ArrayList<Homestay> checkHome = (ArrayList<Homestay>) request.getAttribute("checkHome");
                                if (checkHome != null) {
                                    for (Homestay home : checkHome) {
                                        request.setAttribute("homestay_id", home.getHs_id());%>
                            <tr>
                                <th scope="row" class="text-center"><%=home.getHs_id()%></th>
                                <td><%=home.getHs_name()%></td>
                                <td><%=home.getHs_license()%></td>
                                <td><button type="button" class="btn btn-success">Success</button></td>
                                <td>
                                    <div class="form-check">
                                        <label class="form-check-label">
                                            <input type="checkbox" class="form-check-input">
                                        </label>
                                    </div>
                                </td>
                            </tr>
                            <%      }
                                }%>
                        </tbody>
                    </table>
                    <button type="submit" class="btn btn-primary btn-block" id="signUpButton">Save change</button>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />