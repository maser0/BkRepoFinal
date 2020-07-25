<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-06-09
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Obecności Studenta</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<table>
    <tr>
        <th>Imię </th>
        <th> Nazwisko </th>
        <th> Numer kontaktowy </th>
    </tr>
    <c:forEach items="${presenceList}" var="presence">
        <tr>
            <td>${presence.absence}</td>

        </tr>
    </c:forEach>
</table>
<div>
    <a href="/">Strona główna</a>
</div>
<br>
<br>
<footer>
    <form action="<c:url value="/logout"/>" method="post">
        <input class="fa fa-id-badge" type="submit" value="Wyloguj">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</footer>
</body>
</html>