<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Order</title>
</head>

<body background="../../resources/backgrounds/orderBackgorund.png">
<section class="container">
    <div class="row">
        <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
            <div class="thumbnail">
                <h3>Event: ${actualEvent.name}</h3>
                <h3>Price: ${actualEvent.price}</h3>
                <h3>Available tickets: ${actualEvent.availableTickets}</h3>
            </div>
            <div class="thumbnail">
                <form:form modelAttribute="newOrder" class="form-horizontal">
                    How many tickets would you buy?
                    <form:input id="nrOftickets" path="numberOfTickets" type="number"/><br/>
                    <br/>
                    <input class="btn btn-lg btn-success btn-block" type="submit" value="Go to payment">

                </form:form>

                <a href="<spring:url value="/"/>" class="btn btndefault">
                    <span class="glyphicon-hand-left glyphicon"></span> Back
                </a>
            </div>


        </div>
    </div>
</section>

</body>


