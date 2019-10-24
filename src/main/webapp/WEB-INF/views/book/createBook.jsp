<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="spring" uri ="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Add book</title>
    <style><%@include file="/WEB-INF/styles/w3.css"%></style>
</head>
<body>
    <div class="w3-container w3-teal" >
        <table class="w3-table w3-text-light-gray">
            <th class="w3-left-align w3-cell-middle"><h1>Add book</h1></th>
            <th class="w3-right-align">
                <form class="w3-margin-top" action="${pageContext.request.contextPath}/book/all">
                    <input class="w3-btn w3-dark-gray" type="submit" value="all" />
                </form>
            </th>
        </table>
    </div>
    <jsp:include page="../header.jsp" />
    <div class="w3-container">
        <form class="w3-container" action="${pageContext.request.contextPath}/book/addBook" method="post">
            <label class="w3-text-teal">Book title
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${title}" name="title"><br/>
            </label>
            <label class="w3-text-teal">Book year
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${year}" name="year"><br/>
            </label>
            <label class="w3-text-teal">Book price
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${price}" name="price" type="number" min="0" ><br/>
            </label>

            <button class="w3-btn w3-blue-grey" type="submit">Create</button>
        </form>
    </div>
</body>
</html>
