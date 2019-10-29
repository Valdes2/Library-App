<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="spring" uri ="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
    <style><%@include file="/WEB-INF/styles/w3.css"%></style>
</head>
<body>
    <div class="w3-container w3-teal" >
        <table class="w3-table w3-text-light-gray">
            <th class="w3-left-align w3-cell-middle"><h1>Registration</h1></th>
        </table>
    </div>
    <div class="w3-container">
        <form class="w3-container" action="${pageContext.request.contextPath}/user/registration" method="post">
            <label class="w3-text-teal">First name
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${firstName}" name="firstName"><br/>
            </label>

            <label class="w3-text-teal">Last name
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${lastName}" name="lastName"><br/>
            </label>

            <label class="w3-text-teal">email
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${email}" name="email"><br/>
            </label>

            <label class="w3-text-teal">Login
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${login}" name="login"><br/>
            </label>

            <label class="w3-text-teal">Password
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${password}" name="password"><br/>
            </label>

            <label class="w3-text-teal">Confirm password
                <input class="w3-input w3-border w3-light-grey" style="width:30%" value="${confirmPassword}" name="confirmPassword"><br/>
            </label>

            <button class="w3-btn w3-blue-grey" type="submit">Enter</button>
        </form>
    </div>
</body>
</html>
