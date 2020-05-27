<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-26
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista Trenerów</title>
</head>
<body>
<table>
    <tr>
        <th>Imię </th>
        <th> Nazwisko </th>
    </tr>
    <c:forEach items="${trainers}" var="trainer">
        <tr>
            <td>${trainer.name}</td>
            <td>${trainer.surname}</td>
            <td>
                <a href="/trainer/${trainer.id}">Edytuj</a>
            </td>
            <td>
                <a href="/trainer/confirmDelete/${trainer.id}">Usuń</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
