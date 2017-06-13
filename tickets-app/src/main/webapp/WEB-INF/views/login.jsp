<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="<c:url value="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"/>">
    <title>Produkty</title>
</head>

<body background="../../resources/backgrounds/backgroundcreme.jpg">


<c:url var="securityCheck" value="/j_spring_security_check"/>
<c:url var="directToRegistration" value="/account/registration"/>
<div class="container">

    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Log in</h3>
                </div>
                <div class="panel-body">
                    <c:if test="${not empty error}">
                        <div class="alert alert-danger">Login error<br/>
                        </div>
                    </c:if>
                    <form:form action="${securityCheck}" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="Login" name='j_username' type="text">
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" name='j_password' type="password"
                                       value="">
                            </div>
                            <input class="btn btn-lg btn-success btn-block" type="submit" value="Log in">
                        </fieldset>

                        <h3 class="panel-title">Have no account?</h3>
                        <a href="${directToRegistration}" class="btn btn-danger btn-mini pull-right">Register!</a>
                    </form:form>


                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

