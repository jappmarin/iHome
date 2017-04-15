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
                                        <input class="form-control" type="number" value="400" id="example-number-input">
                                    </div>
                                </div>
                                <div class="form-group row mx-auto align-items-center">
                                    Highest Price
                                    <div class="col-sm-6">
                                        <input class="form-control" type="number" value="2000" id="example-number-input">
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
                                <div class="col-sm-4">
                                    <div class="card text-center mt-2">
                                        <img class="card-img-top" src="">
                                        <div class="card-block">
                                            <h4 class="card-title"><%=home.getHs_name()%></h4>
                                            <p class="card-text"><%=home.getHs_desc()%></p>
                                            <p class="card-text">Price : <%=home.getHs_price()%></p>
                                        </div>
                                        <div class="card-footer">
                                            <a class="btn btn-primary" href="${SITE_URL}/View/?id=<%=home.getHs_id()%>">See more</a>
                                        </div>
                                    </div>
                                </div>
                    <%      }
                        }%>
                    </div>
                </div>
            </div>
            <div class="row justify-content-center mt-3">
                <nav aria-label="Page navigation example">
                    <ul class="pagination">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                                <span class="sr-only">Previous</span>
                            </a>
                        </li>
                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                                <span class="sr-only">Next</span>
                            </a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />
