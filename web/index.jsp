<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if (session.getAttribute("customer") != null) {  %><jsp:include page="templates/headerauth.jsp" /><% } else { %><jsp:include page="templates/header.jsp" /><% }%>
<div class="container">
    <div class="row hidden-sm-down">
        <div class="col-2">
            <img src="https://www.ownerdirect.com/images/1069509-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
        <div class="col-4">
            <img src="https://www.ownerdirect.com/images/1069512-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
        <div class="col-2">
            <img src="https://www.ownerdirect.com/images/1069501-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
        <div class="col-4">
            <img src="https://www.ownerdirect.com/images/1069506-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-2 hidden-sm-down">
            <img src="https://www.ownerdirect.com/images/1069503-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
            <img src="https://www.ownerdirect.com/images/1104979-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
        <div class="col-sm-8 mt-1" >
            <div class="card" style="height: 100%">
                <div class="card-block">
                    <div class="row justify-content-center mt-5 mb-4">
                        <div class="col-sm-12 col-md-12">
                            <h2 class="text-center">Where would you like to stay?</h2>
                        </div>
                    </div>
                    <form action="Search" method="GET">
                        <div class="row justify-content-center">
                            <div class="col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" class="form-control" id="search" name="search" placeholder="eg. Samut Prakan, Bangkok, Chaingmai">

                                </div>
                            </div>
                        </div>
                        <div class="row justify-content-center mt-2 mb-4">
                            <div class="col-sm-2 col-md-2 text-center">
                                <a class="btn btn-primary btn-lg" href="${SITE_URL}/Search">Search</a>
                            </div>
                        </div>
                    </form>  
                </div>
            </div>
        </div>
        <div class="col-2 hidden-sm-down">
            <img src="https://www.ownerdirect.com/images/1069158-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
            <img src="https://www.ownerdirect.com/images/1069499-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
    </div>
    <div class="row hidden-sm-down">
        <div class="col-4">
            <img src="https://www.ownerdirect.com/images/1069514-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
        <div class="col-2">
            <img src="https://www.ownerdirect.com/images/1069507-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
        <div class="col-4">
            <img src="https://www.ownerdirect.com/images/1069498-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
        <div class="col-2">
            <img src="https://www.ownerdirect.com/images/1069547-full.jpg" alt="..." class="w-100 rounded-0 mt-2 mb-2">
        </div>
    </div>
</div>
<jsp:include page="templates/footer.jsp" />