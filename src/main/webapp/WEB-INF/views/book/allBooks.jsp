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
            <th class="w3-left-align w3-cell-middle"><h1>Library</h1></th>
        </table>
    </div>

    <jsp:include page="../header.jsp" />

    <div class="w3-container">
        <table class="w3-table w3-border w3-card-2 w3-bordered ">
            <tr>
                <th>Title</th>
                <th>Year</th>
                <th>Price</th>
                <th>Authors</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="book" items="${allBooks}">
                <tr>
                    <td><c:out value="${book.title}" /></td>
                    <td><c:out value="${book.year}" /></td>
                    <td><c:out value="${book.price}" /></td>
                    <td>Author</td>
                    <td>
                        <a class="w3-btn w3-light-gray" href="${pageContext.request.contextPath}/book/${book.id}">Info</a>
                    </td>
                    <td>
                        <a class="w3-btn w3-light-gray" href="${pageContext.request.contextPath}/rent/rentBook?book_id=${book.id}">Rent</a>
                    </td>
                    <td>
                        <a class="w3-btn w3-light-gray" href="${pageContext.request.contextPath}/rent/returnBook?book_id=${book.id}">Return</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
