<%@page import="java.util.ArrayList"%>
<%@page import="model.Homestay"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
        <div class="container mt-5">   
            <div class="row justify-content-center">
                <div class="col-sm-3">
                    <div class="card mt-2">
                        <div class="card-block">
                            <form action="Search" method="POST">
                                <h5 class="card-title">Search results for:</h5>
                                <p class="card-text">
                                <div class="form-group row">
                                    <div class="col-sm-12">
                                        <input class="form-control" type="search" value="eg. Bangkok, Chaingmai" id="example-search-input">
                                    </div>
                                </div>
                                </p>
                                <hr>
                                <h6 class="card-title">ภูมิภาค</h6>
                                <p class="card-text">
                                    <label class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input">
                                        <span class="custom-control-indicator"></span>
                                        <span class="custom-control-description">ภาคเหนือ</span>
                                    </label>
                                </p>
                                <p class="card-text">
                                    <label class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input">
                                        <span class="custom-control-indicator"></span>
                                        <span class="custom-control-description">ภาคกลาง</span>
                                    </label>
                                </p>
                                <p class="card-text">
                                    <label class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input">
                                        <span class="custom-control-indicator"></span>
                                        <span class="custom-control-description">ภาคตะวันออก</span>
                                    </label>
                                </p>
                                <p class="card-text">
                                    <label class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input">
                                        <span class="custom-control-indicator"></span>
                                        <span class="custom-control-description">ภาคตะวันออกเฉียงเหนือ</span>
                                    </label>
                                </p>
                                <p class="card-text">
                                    <label class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input">
                                        <span class="custom-control-indicator"></span>
                                        <span class="custom-control-description">ภาคตะวันตก</span>
                                    </label>
                                </p>
                                <p class="card-text">
                                    <label class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input">
                                        <span class="custom-control-indicator"></span>
                                        <span class="custom-control-description">ภาคใต้</span>
                                    </label>
                                </p>
                                <hr>
                                <h6 class="card-title">Price</h6>
                                <p class="card-text">
                                <div class="form-group row mx-auto align-items-center">
                                    Lowest Price
                                    <div class="col-sm-6">
                                        <input class="form-control" type="number" value="400" id="lowestPriceIn">
                                    </div>
                                </div>
                                <div class="form-group row mx-auto align-items-center">
                                    Highest Price
                                    <div class="col-sm-6">
                                        <input class="form-control" type="number" value="2000" id="highestPriceIn">
                                    </div>
                                </div>
                                </p>
                                <hr>
                                <h6 class="card-title">Date</h6>
                                <p class="card-text">
                                <div class="form-group row mx-auto align-items-center">
                                    Check in
                                    <div class="col-sm-12">
                                        <input class="form-control" type="date" value="" id="checkinIn">
                                    </div>
                                </div>
                                <div class="form-group row mx-auto align-items-center">
                                    Check out
                                    <div class="col-sm-12">
                                        <input class="form-control" type="date" value="" id="checkoutIn">
                                    </div>
                                </div>
                                </p>
                                <hr>
                                
                                <button type="submit" class="btn btn-primary btn-block">Search</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-sm-9">
                    <div class="row">
                    <% ArrayList<Homestay> allHome = (ArrayList<Homestay>) request.getAttribute("allHome");
                        if (allHome != null) {
                            for (Homestay home : allHome) {%>
                                <div class="col-sm-6">
                                    <div class="card text-center mt-2">
                                        <img class="card-img-top" src="${SITE_URL}/asset/img/logo.png">
                                        <div class="card-block">
                                            <h4 class="card-title"><%=home.getHs_name()%></h4>
                                            <p class="card-text"><%=home.getHs_desc()%></p>
                                        </div>
                                        <div class="card-footer">
                                            <a class="btn btn-primary" href="${SITE_URL}/ViewHomestay/?id=<%=home.getHs_id()%>">See more</a>
                                        </div>
                                    </div>
                                </div>
                    <%      }
                        }%>
                    </div>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />
