<%--@page import="controller.Comment"--%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Homestay"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% Homestay homestay = (Homestay) request.getAttribute("homestay");%>
        <div class="container mt-5">
            <div class="card">
                <h3 class="card-header"><%=homestay.getHs_name()%></h3>
                <div class="card-block">
                    <div class="row justify-content-center">
                        <div class="col-sm-6">
                            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                                <div class="carousel-inner" role="listbox">
                                    <div class="carousel-item active">
                                        <img class="d-block" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg" alt="First slide">
                                    </div>
                                    <div class="carousel-item">
                                        <img class="d-block" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983992-full.jpg" alt="Second slide">
                                    </div>
                                    <div class="carousel-item">
                                        <img class="d-block" src="https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983990-full.jpg" alt="Third slide">
                                    </div>
                                </div>
                                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="card">
                                <div class="card-block">
                                    <h4 class="card-title">Homestay Detail</h4>
                                    <p class="card-text"><%=homestay.getHs_desc()%></p>
                                    <h4 class="card-title">Price</h4>
                                    <p class="card-text"><%=homestay.getHs_price()%> / Night</p>
                                    <a href="${SITE_URL}/Booking/?id=<%=homestay.getHs_id()%>" class="btn btn-primary btn-lg">Booking</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row mt-4 mb-4">
                        <div class="col-sm-12">
                            <div id="accordion" role="tablist" aria-multiselectable="true">
                                <div class="card">
                                    <div class="card-header" role="tab" id="heading1">
                                        <h5 class="mb-0">
                                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse1" aria-expanded="false" aria-controls="collapse1">
                                                Parking
                                            </a>
                                        </h5>
                                    </div>
                                    <div id="collapse1" class="collapse" role="tabpanel" aria-labelledby="heading1">
                                        <div class="card-block">
                                            <ul>
                                                <li>4 Outdoor/Open parking stalls with unlimited clearance</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header" role="tab" id="heading2">
                                        <h5 class="mb-0">
                                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse2" aria-expanded="false" aria-controls="collapse2">
                                                Heating & Air Conditioning
                                            </a>
                                        </h5>
                                    </div>
                                    <div id="collapse2" class="collapse" role="tabpanel" aria-labelledby="heading2">
                                        <div class="card-block">
                                            <ul>
                                                <li>Central Air Heating</li>
                                                <li>Air Conditioning: 1 Portable Unit</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header" role="tab" id="heading3">
                                        <h5 class="mb-0">
                                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse3" aria-expanded="false" aria-controls="collapse3">
                                                Bedroom
                                            </a>
                                        </h5>
                                    </div>
                                    <div id="collapse3" class="collapse" role="tabpanel" aria-labelledby="heading3">
                                        <div class="card-block">
                                            <ul>
                                                <li>Queen Bed</li>
                                                <li>Closet</li>
                                                <li>Alarm Clock</li>
                                                <li>Vanity</li>
                                                <li>Ceiling Fan</li>
                                                <li>Table Lamp</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header" role="tab" id="heading4">
                                        <h5 class="mb-0">
                                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse4" aria-expanded="false" aria-controls="collapse4">
                                                Bathroom
                                            </a>
                                        </h5>
                                    </div>
                                    <div id="collapse4" class="collapse" role="tabpanel" aria-labelledby="heading4">
                                        <div class="card-block">
                                            <ul>
                                                <li>Bathtub</li>
                                                <li>Regular Stall Shower</li>
                                                <li>Sink</li>
                                                <li>Toilet</li>
                                                <li>owels (matching)</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header" role="tab" id="heading5">
                                        <h5 class="mb-0">
                                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse5" aria-expanded="false" aria-controls="collapse5">
                                                Kitchen
                                            </a>
                                        </h5>
                                    </div>
                                    <div id="collapse5" class="collapse" role="tabpanel" aria-labelledby="heading5">
                                        <div class="card-block">
                                            <ul>
                                                <li>Large Fridge with Freezer (including ice maker)</li>
                                                <li>Coffee Maker</li>
                                                <li>Dishwasher</li>
                                                <li>Kettle</li>
                                                <li>Microwave</li>
                                                <li>Range Oven</li>
                                                <li>Toaster</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header" role="tab" id="heading6">
                                        <h5 class="mb-0">
                                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse6" aria-expanded="false" aria-controls="collapse6">
                                                Outdoor
                                            </a>
                                        </h5>
                                    </div>
                                    <div id="collapse6" class="collapse" role="tabpanel" aria-labelledby="heading6">
                                        <div class="card-block">
                                            <ul>
                                                <li>Propane BBQ private to this property.</li>
                                                <li>Patio Table</li>
                                                <li>2 Chaise Lounges</li>
                                                <li>Wrap Around Deck</li>
                                                <li>Dock</li>
                                                <li>Grass/Lawn</li>
                                                <li>Picnic Table</li>
                                                <li>Sun Umbrella</li>
                                                <li>Swing Set</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-header" role="tab" id="heading7">
                                        <h5 class="mb-0">
                                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse7" aria-expanded="false" aria-controls="collapse7">
                                                Other
                                            </a>
                                        </h5>
                                    </div>
                                    <div id="collapse7" class="collapse" role="tabpanel" aria-labelledby="heading7">
                                        <div class="card-block">
                                            <ul>
                                                <li>The internet connection is provided.</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="card mt-3 mb-3">
                <h3 class="card-header">Comment</h3>
                <div class="card-block">
                    <ul class="list-unstyled">
                        <%-- if (request.getAttribute("allComment") != null) { --%>
                        <%-- ArrayList<Comment> allComment = (ArrayList<Comment>) request.getAttribute("allComment");
                        for (model.Comment comment: allComment) {--%>
                        <li class="media">
                            <div class="media-body">
                                <h5 class="mt-0 mb-1"><%--=comment.getFirstname()%> <%=comment.getLastname()--%></h5>
                                <p><%--=comment.getText()--%></p>
                            </div>
                        </li>
                        <hr>
                        <%-- }
} --%>
                        <li class="media">
                            <div class="media-body">
                                <form action="${SITE_URL}/Review/?&id=<%=homestay.getHs_id()%>" method="POST">
                                    <textarea name="comment" rows="3" style="width: 100%; margin-top: 10px; margin-bottom: 10px;"></textarea>
                                    <button type="submit" class="btn btn-success btn-lg">Comment</button>
                                </form>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
<jsp:include page="templates/footer.jsp" />