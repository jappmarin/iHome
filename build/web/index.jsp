<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="templates/header.jsp" />
<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-sm-12">
            <div class="card">
                <div class="card-block">
                    <div class="row justify-content-center mt-5 mb-4">
                        <div class="col-sm-12">
                            <h2 class="text-center">Where would you like to stay?</h2>
                        </div>
                    </div>
                    <div class="row justify-content-center">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <input type="text" class="form-control" id="search" aria-describedby="search" placeholder="eg. Samut Prakan, Bangkok, Chaingmai">
                            </div>
                        </div>
                    </div>
                    <div class="row justify-content-center mt-2 mb-4">
                        <div class="col-sm-2">
                            <a class="btn btn-primary btn-lg" href="search.html">Search</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="templates/modal.jsp" />
<jsp:include page="templates/footer.jsp" />