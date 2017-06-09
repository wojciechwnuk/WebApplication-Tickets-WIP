<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Registration</title>
</head>



<body>
<div class="container">
    <div class="col-md-4 col-md-offset-4">
        <div class="panel panel-default">
            <div class="panel-heading">
                <form:form modelAttribute="newUser" class="form-horizontal">
                    First name: <br/>
                    <form:input id="imie" path="firstName" type="text"/><br/>
                    Last name: <br/>
                    <form:input id="nazwisko" path="lastName" type="text"/><br/>
                    Address: <br/>
                    <form:input id="adres" path="address" type="text"/><br/>
                    Email: <br/>
                    <form:input id="email" path="email" type="text"/><br/>
                    Password: <br/>
                    <form:input id="hasło" path="password" type="password"/><br/>

                </form:form>
            </div>
            <input class="btn btn-lg btn-success btn-block" type="submit" value="Submit">
        </div>
    </div>
</div>

</body>
</html>