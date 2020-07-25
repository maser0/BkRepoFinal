<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-27
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona główna</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<h1><spring:message code="app.title"/></h1>




<table>
    <tr>
        <th>Trener </th>
    </tr>
         <tr>
            <td>
                <a href="/admin/trainer">Stwórz trenera</a>
            </td>
            <td>
                <a href="/admin/trainer/list">Wszyscy trenerzy</a>
            </td>
        </tr>

</table>
<br>
<table>
    <tr>
        <th>Student </th>
    </tr>
    <tr>
        <td>
            <a href="/admin/student">Stwórz studenta</a>
        </td>
        <td>
            <a href="/admin/student/list">Wszyscy studenci</a>
        </td>
    </tr>
<br>
</table>
<br>
<table>
    <tr>
        <th>Grupa </th>
    </tr>
    <tr>
        <td>
            <a href="/admin/group">Stwórz grupe</a>
        </td>
        <td>
            <a href="/group/list">Wszystkie grupy</a>
        </td>
    </tr>

</table>
<br>

<div>
    <span>
        <a href="/createUser">Stwórz użytkownika</a>
    </span>
</div>
<br>


<div class="buttons">
    <span>
        <a href="/login">Zaloguj</a>
    </span>
    <br>
    <br>
    <span>
        <a href="/about">Wyloguj</a>
    </span>
</div>
<br>
<footer><spring:message code="app.footer"/>

</footer>
<div><img src="<c:url value="/resources/images/logo.jpg" />" class="images"/> </div>
</body>

</html>
