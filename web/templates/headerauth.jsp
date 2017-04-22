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
        <link rel="stylesheet" href="${SITE_URL}/asset/css/bootstrap.min.css">
        <link rel="stylesheet" href="${SITE_URL}/asset/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">
        <script src="${SITE_URL}/asset/js/jquery-3.2.1.min.js"></script>
        <script src="${SITE_URL}/asset/js/bootstrap.min.js"></script>
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
                           <% if (session.getAttribute("type").equals("GUEST") || session.getAttribute("type").equals("HOST")) { %>
                           ${SITE_URL}/ViewProfile
                           <% } else if (session.getAttribute("type").equals("ADMIN")) {%>
                           ${SITE_URL}/PublishHomestay
                           <% } %>
                           ">
                            <% if (session.getAttribute("type").equals("ADMIN")) { %>
                            Control Panel
                            <% } else { %>
                            Profile
                            <% }%>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Logout">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>