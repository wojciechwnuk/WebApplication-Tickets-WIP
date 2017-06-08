<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>library</title>
</head>
<body>
<div>
    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>

    <form:form method="post" action="perform_login">
        <table>
            <tr>
                <td>User</td>
                <td>
                    <input type='text' name='username' value=''>
                </td>
            </tr>
            <tr>
                <td>Password</td>
                <td>
                    <input type='password' name='password'/>
                </td>
            </tr>
            <tr>
                <td colspan='2'><input name="submit" type="submit" value="Log in"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>