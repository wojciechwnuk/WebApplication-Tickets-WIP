<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Event</title>
</head>
<body background="../../resources/backgrounds/backgroundcreme.jpg">
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Purchase your ticket now!</h1>
        </div>
    </div>
</section>
<section class="container">
    <div class="row">
        <div class="col-md-5">
            <img src="<c:url value="/resources/images/${event.id}.png"></c:url>" alt="image" style="width:100%"/>
        </div>
        <div class="col-md-5">
            <h3>${event.name}</h3>
            <p>
                <strong>Event ID: </strong><span class="label label-warning">${event.id}</span>
            </p>
            <p>
                <strong>Event date: </strong>: ${event.date}
            </p>
            <p>
                <strong>Available tickets: </strong>: ${event.availableTickets}
            </p>

            <h4>Price: ${event.price}$</h4>
            <p>
                <a href="<spring:url value="/"/>" class="btn btndefault">
                    <span class="glyphicon-hand-left glyphicon"></span> Back
                </a>
                <a href=" <spring:url value="/order/event?id=${event.id}" />" class="btn btn-warning btn-large">
                    <span class="glyphicon-shopping-cart glyphicon"></span>
                    Order now!
                </a>
            </p>
        </div>
    </div>
</section>
</body>
</html>