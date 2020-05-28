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
    <title>Lista Groupów</title>
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
                <a href="/presence/${group.id}">Sprawdź obecność</a>
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
</html>
