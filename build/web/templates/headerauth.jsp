<%@page import="model.Customer"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}" scope="request"/>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Vacation Rentals, Homes, Experiences & Places - iHome</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <link rel="stylesheet" href="asset/css/style.css">
        
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCkYO_MOXEHgK1KVdnFE3t_JS8LswqIh7E&callback=initMap"></script>
    </head>
    <body>
        <nav class="navbar navbar-toggleable-md navbar-light">
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbars" aria-controls="navbars" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="${SITE_URL}/index.jsp">
                <img src="${SITE_URL}/asset/img/logo.png" width="30" height="30" class="logo d-inline-block align-top">iHome
            </a>
            <div class="collapse navbar-collapse" id="navbars">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="
                           <% if (session.getAttribute("customer_type").equals("Guest")) { %>
                           profile.jsp
                           <% } else if (session.getAttribute("customer_type").equals("Host")) {%>
                           profile_host.jsp
                           <% } else if (session.getAttribute("customer_type").equals("Admin")) {%>
                           cp.jsp
                           <% } %>
                           ">
                           <% if (session.getAttribute("customer_type").equals("Admin")) { %>
                           Control Panel
                           <% } else { %>
                           Profile
                           <% } %>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Logout">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>