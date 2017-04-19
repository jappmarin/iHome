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
                                    <p class="card-text"> / Night</p>
                                    <a href="${SITE_URL}/Booking/?id=<%=homestay.getHs_id()%>" class="btn btn-primary btn-lg">Booking</a>
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