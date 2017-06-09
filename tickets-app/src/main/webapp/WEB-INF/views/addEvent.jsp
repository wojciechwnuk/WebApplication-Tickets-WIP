<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/addEvent.css" />" rel="stylesheet"></head>
<body>
<div class="container-fluid">
    <form action="" method="" class="register-form">
        <div class="row">
            <div class="col-md-4 col-sm-4 col-lg-4">
                <label >Name of event</label>
                <label>
                    <input name="name" class="form-control" type="text">
                </label>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 col-sm-4 col-lg-4">
                <label >Price</label>
                <label>
                    <input name="price" class="form-control" type="text">
                </label>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 col-sm-4 col-lg-4">
                <label >Date</label>
                <label>
                    <input name="date" class="form-control" type="text">
                </label>
            </div>
        </div>


            <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
                <button class="btn btn-default logbutton">Add event</button>
            </div>
    </form>
</div>
</body>
</html>
