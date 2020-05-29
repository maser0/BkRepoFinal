<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-27
  Time: 08:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista Grup</title>
</head>
<body>
<table>
    <tr>
        <th>Data zajęć </th>
          </tr>
    <c:forEach items="${groups}" var="group">
        <tr>
            <td>${group.dayOfWeek}</td>
            <td>${group.hour}</td>
            <td>
                <a href="/classes/${group.id}">Sprawdź obecność</a>
            </td>
            <td>
                <a href="/admin/group/${group.id}">Edytuj</a>
            </td>
            <td>
                <a href="/admin/group/confirmDelete/${group.id}">Usuń</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
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
</html>
