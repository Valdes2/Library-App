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
        <input class="w3-btn w3-dark-gray" type="submit" value="****" />
      </form>
    </th>
  </table>
</div>
<div class="w3-container w3-centered">

    <form action="${pageContext.request.contextPath}/book/all">
      <input class="w3-button w3-block w3-dark-gray" style="width:30%" type="submit" value="All books" />
    </form>
  </div>
</div>

</body>
</html>
