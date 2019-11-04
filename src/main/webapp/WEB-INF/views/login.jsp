<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="spring" uri ="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Login</title>
    <style><%@include file="/WEB-INF/styles/w3.css"%></style>
</head>
<body>
    <div class="w3-container w3-teal">
        <table class="w3-table w3-text-light-gray">
            <th class="w3-left-align w3-cell-middle"><h1>Login</h1></th>
        </table>
    </div>
    <div class="w3-container">
        <form class="w3-container" action='<spring:url value="/signin"/>' method="post">
            <c:if test="${param.error != null}">
                <p class="w3-text-red">
                    Incorrect login or password!
                </p>
            </c:if>
            <c:if test="${param.logout != null}">
                <p class="w3-text-red">
                    You have been logged out.
                </p>
            </c:if>
            <label class="w3-text-teal">Login
                <input class="w3-input w3-border w3-light-grey" style="width:30%" type="text" name="login"><br />
            </label>
            <label class="w3-text-teal">Password
                <input class="w3-input w3-border w3-light-grey" style="width:30%" type="password" name="pass"><br />
            </label>
            <button class="w3-btn w3-blue-grey" type="submit">Login</button>
        </form>
        <form class="w3-margin-top" action="${pageContext.request.contextPath}/user">
            <input class="w3-btn w3-dark-gray" type="submit" value="Sign up" />
        </form>
    </div>
</body>
</html>
