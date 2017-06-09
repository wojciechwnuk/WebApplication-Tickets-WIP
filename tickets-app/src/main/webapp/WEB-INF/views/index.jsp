<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <title>Tickets-sklep</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1> ${greeting} </h1>
            <p> ${tagline} </p>
        </div>
    </div>
    <div class="container">
        <h2>Choose event</h2>
        <p>and select checbox: </p>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Event</th>
                <th>Date</th>
                <th>Price</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>The Example Koncert</td>
                <td>21.06.2017</td>
                <td>12.99$</td>
                <td class="labeled">
                    <label>
                        <input type="checkbox"/>
                    </label>
                </td>
            </tr>

            <tr>
                <td>The Example Koncert 2</td>
                <td>22.06.2017</td>
                <td>13.99$</td>
                <td class="labeled">
                    <label>
                        <input type="checkbox"/>
                    </label>
                </td>
            </tr>

            <tr>
                <td>The Example Koncert 3</td>
                <td>22.06.2017</td>
                <td>14.99$</td>
                <td class="labeled">
                    <label>
                        <input type="checkbox"/>
                    </label>
                </td>
            </tr>

            </tbody>
        </table>
    </div>
</section>

</body>
</html>