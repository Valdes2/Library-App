<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="spring" uri ="http://www.springframework.org/tags" %>

<html>
<head>
    <title>AllBooks</title>
    <style><%@include file="/WEB-INF/styles/w3.css"%></style>
</head>
<body>
<div class="w3-container w3-teal" >
    <table class="w3-table w3-text-light-gray">
        <th class="w3-left-align w3-cell-middle"><h1>Books</h1></th>
        <th class="w3-right-align">
            <form class="w3-margin-top" action="${pageContext.request.contextPath}/index">
                <input class="w3-btn w3-dark-gray" type="submit" value="Index" />
            </form>
        </th>
    </table>
    <form class="w3-margin-top" action="${pageContext.request.contextPath}/book/addBook">
        <input class="w3-btn w3-dark-gray" type="submit" value="addBook" />
    </form>
    <form class="w3-margin-top" action="${pageContext.request.contextPath}/rent/rentedBooks">
        <input class="w3-btn w3-dark-gray" type="submit" value="Rented books" />
    </form>
</div>
<div class="w3-container">
    <form class="w3-container" action="${pageContext.request.contextPath}/book/find" method="get">
        <label class="w3-text-teal">Find by title
            <input class="w3-input w3-border w3-light-grey" style="width:30%" type="text" name="title"><br />
        </label>
        <button class="w3-btn w3-blue-grey" type="submit">Find</button>
    </form>
</div>
<div class="w3-container">
    <table class="w3-table w3-border w3-card-2 w3-bordered ">
        <tr>
            <th>Title</th>
            <th>Year</th>
            <th>Price</th>
            <th>Info</th>
            <th>Authors</th>
            <th>Rent</th>
            <th>Return</th>
        </tr>
        <c:forEach var="book" items="${allBooks}">
            <tr>
                <td><c:out value="${book.title}" /></td>
                <td><c:out value="${book.year}" /></td>
                <td><c:out value="${book.price}" /></td>
                <td>
                    <a class="w3-btn w3-greyscale" href="${pageContext.request.contextPath}/book/${book.id}">Info</a>
                </td>
                <td>Author</td>
                <td>
                    <a class="w3-btn w3-greyscale" href="${pageContext.request.contextPath}/rent/rentBook?book_id=${book.id}">Rent</a>
                </td>
                <td>
                    <a class="w3-btn w3-greyscale" href="${pageContext.request.contextPath}/rent/returnBook?book_id=${book.id}">Return</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
