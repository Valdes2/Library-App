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
            <form class="w3-margin-top" action="${pageContext.request.contextPath}/book/all">
                <input class="w3-btn w3-dark-gray" type="submit" value="All books" />
            </form>
        </th>
    </table>
</div>
<div class="w3-container">
    <table class="w3-table w3-border w3-card-2 w3-bordered ">
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Year</th>
            <th>Price</th>
            <th>Authors</th>
        </tr>
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.year}</td>
            <td>${book.price}</td>
            <c:forEach var="author" items="${book.authors}">
                <td>${author.toString()}</td>
            </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>
