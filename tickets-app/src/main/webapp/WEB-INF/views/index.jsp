<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <title>Tickets-sklep</title>
</head>
<body background="../../resources/bckgrnd.jpg">
<section>
    <div class="jumbotron">
        <div class="container">
            <h1> ${greeting} </h1>
            <p> ${tagline} </p>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h2>Choose event</h2>
                        <p>and click "BUY!" </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="container">
    <div class="row">
        <c:forEach items="${events}" var="event">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${event.name}</h3>
                        <p>Date: ${event.date}</p>
                        <p>Price: ${event.price} $</p>
                        <p>Event ID: ${event.id} </p>


                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
<section class="container">
    <div class="=row">
        <input class="btn btn-lg btn-success btn-block" type="submit" value="BUY!">
    </div>

</section>


</body>
</html>