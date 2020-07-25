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
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<table>
    <tr>
        <th>Imię </th>
        <th> Nazwisko </th>
        <th> Numer kontaktowy </th>
    </tr>
    <c:forEach items="${classes}" var="class">
        <tr>
            <td>${class.time}</td>
            <td>${class.presences}</td>
<%--             <td>--%>
<%--                <a href="/admin/student/${student.id}">Edytuj</a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="/admin/student/confirmDelete/${student.id}">Usuń</a>--%>
            </td>
        </tr>
    </c:forEach>
</table>
<div>
    <a href="/">Strona główna</a>
</div>
</body>
</html>
