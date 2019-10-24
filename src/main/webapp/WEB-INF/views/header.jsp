<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>header</title>
    <style><%@include file="/WEB-INF/styles/w3.css"%></style>
</head>
<body>
    <div class="w3-bar w3-light-gray">
        <a href="${pageContext.request.contextPath}/book/all" class="w3-bar-item w3-button ">All books</a>
        <a href="${pageContext.request.contextPath}/book/addBook" class="w3-bar-item w3-button ">Add book</a>
        <a href="${pageContext.request.contextPath}/rent/rentedBooks" class="w3-bar-item w3-button ">Rented books</a>
        <form action="${pageContext.request.contextPath}/book/find" method="get">
            <input type="text" name="title" class="w3-bar-item w3-input" placeholder="Find by title...">
            <button class="w3-bar-item w3-button w3-dark-gray" type="submit">Find</button>
        </form>
    </div>
</body>
</html>
