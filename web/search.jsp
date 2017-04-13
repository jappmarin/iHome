<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.isNew()) {  %><jsp:include page="templates/header.jsp" /><% } else { %><jsp:include page="templates/headerauth.jsp" /><% }%>
        <div class="container mt-5">   
            <div class="row">
                <div class="col-sm-3">
                    <div class="card">
                        <div class="card-block">
                            <h5 class="card-title">Search within results</h5>
                            <hr>
                            <h6 class="card-title">Search results for:</h6>
                            <p class="card-text">
                            <div class="form-group row">
                                <div class="col-12">
                                    <input class="form-control" type="search" value="eg. Bangkok, Chaingmai" id="example-search-input">
                                </div>
                            </div>
                            </p>
                            <hr>
                            <h6 class="card-title">Accommodation type</h6>
                            <p class="card-text">
                                <label class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Resort</span>
                                </label>
                            </p>
                            <p class="card-text">
                                <label class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Hotel</span>
                                </label>
                            </p>
                            <p class="card-text">
                                <label class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Guest House / Bed & Breakfast</span>
                                </label>
                            </p>
                            <hr>
                            <h6 class="card-title">Accommodation type</h6>
                            <p class="card-text">
                            <div class="form-group row mx-auto align-items-center">
                                Lowest Price
                                <div class="col-6">
                                    <input class="form-control" type="number" value="400" id="example-number-input">
                                </div>
                            </div>
                            <div class="form-group row mx-auto align-items-center">
                                Highest Price
                                <div class="col-6">
                                    <input class="form-control" type="number" value="2000" id="example-number-input">
                                </div>
                            </div>
                            </p>
                            <hr>
                            <h6 class="card-title">Facilities</h6>
                            <p class="card-text">
                                <label class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Swimming Pool</span>
                                </label>
                            </p>
                            <p class="card-text">
                                <label class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Internet</span>
                                </label>
                            </p>
                            <p class="card-text">
                                <label class="custom-control custom-checkbox">
                                    <input type="checkbox" class="custom-control-input">
                                    <span class="custom-control-indicator"></span>
                                    <span class="custom-control-description">Gym/Fitness</span>
                                </label>
                            </p>
                            <button type="submit" class="btn btn-primary btn-block">Search</button>
                        </div>
                    </div>
                </div>
                <div class="col-9">
                    <div class="card-deck">
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/236/236936/236936_14050218100019292572.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 1</h4>
                                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/119/1199/1199_16093010480047158993.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 2</h4>
                                <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/109/1094465/1094465_16010514010038880241.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 3</h4>
                                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
                    </div>
                    <div class="card-deck mt-3">
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/774/774294/774294_15071611540032427146.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 4</h4>
                                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/448/44889/44889_15030710020025890183.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 5</h4>
                                <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/285/285508/285508_16052510510042698002.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 6</h4>
                                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
                    </div>
                    <div class="card-deck mt-3">
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/845/84514/84514_15081710300034393543.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 7</h4>
                                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/489/48928/48928_17011716190050362291.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 8</h4>
                                <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
                        <div class="card">
                            <img class="card-img-top w-100" src="https://pix6.agoda.net/hotelImages/449/44909/44909_14010914590018034736.jpg?s=500x500&ar=1x1&p=true" alt="Card image cap">
                            <div class="card-block">
                                <h4 class="card-title">Example 9</h4>
                                <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
                            </div>
                            <div class="card-footer">
                                <a class="btn btn-primary" href="detail.jsp" role="button">See detail</a>
                            </div>
                        </div>
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
