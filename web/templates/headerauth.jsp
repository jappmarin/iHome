<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Vacation Rentals, Homes, Experiences & Places - iHome</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <link rel="stylesheet" href="asset/css/style.css">
    </head>
    <body>
        <nav class="navbar navbar-toggleable-md navbar-light">
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbars" aria-controls="navbars" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="index.jsp">
                <img src="asset/img/logo.png" width="30" height="30" class="logo d-inline-block align-top">iHome
            </a>
            <div class="collapse navbar-collapse" id="navbars">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="
                           <% if (session.getAttribute("customer_type").equals("Guest")) { %>
                           profile.jsp?=${sessionScope.username}
                           <% } else if (session.getAttribute("customer_type").equals("Host")) { %>
                           profile_host.jsp?=${sessionScope.username}
                           <% }%>"
                           >Profile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Logout">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>