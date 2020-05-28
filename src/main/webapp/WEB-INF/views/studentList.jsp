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
    <title>Lista Studentów</title>
</head>
<body>
<table>
    <tr>
        <th>Imię </th>
        <th> Nazwisko </th>
        <th> Numer kontaktowy </th>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <td>${student.phoneNumber}</td>
            <td>
                <a href="/admin/student/${student.id}">Edytuj</a>
            </td>
            <td>
                <a href="/admin/student/confirmDelete/${student.id}">Usuń</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
