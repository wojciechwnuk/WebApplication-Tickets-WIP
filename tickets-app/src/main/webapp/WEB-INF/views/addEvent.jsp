<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>AddEvent</title>
</head>
<body>

<div class="container">
    <div class="col-md-4 col-md-offset-4">
        <div class="panel panel-default">
            <div class="panel-heading">
                <form:form modelAttribute="newEvent" class="form-horizontal" >
                   Name of event: <br/>
                    <form:input id="nameEvent" path="name" type="text"/><br/>
                   Date of event: <br/>
                    <form:input id="dateEvent" path="date" type="date"/><br/>
                    Price of event: <br/>
                    <form:input id="priceEvent" path="price" type="number"/><br/>


                    <input class="btn btn-lg btn-success btn-block" type="submit" value="Submit">
                </form:form>
            </div>

        </div>
    </div>
</div>

</body>
</html>
