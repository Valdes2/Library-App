<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="spring" uri ="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Internetshop_v3</title>
    <style><%@include file="/WEB-INF/styles/w3.css"%></style>
</head>
<body class="w3-text-light-gray">
<div class="w3-container w3-teal">
    <table class="w3-table w3-text-light-gray">
        <th class="w3-left-align w3-cell-middle"><h1>Index</h1></th>
        <th class="w3-right-align">
            <form class="w3-margin-top" action="${pageContext.request.contextPath}/logout">
                <input class="w3-btn w3-dark-gray" type="submit" value="TODO:logout" />
            </form>
        </th>
    </table>
</div>
<div class="w3-bar w3-light-gray">
    <a href="${pageContext.request.contextPath}/book/all" class="w3-bar-item w3-button ">All books</a>
    <a href="${pageContext.request.contextPath}/book/addBook" class="w3-bar-item w3-button ">Add book</a>
    <a href="${pageContext.request.contextPath}/rent/rentedBooks" class="w3-bar-item w3-button ">Rented books</a>
</div>
</body>
</html>
