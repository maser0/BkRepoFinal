<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-27
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Obecnosc</title>
</head>
<body>
<form:form method="post" modelAttribute="presence">


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
        <td>obecny  <form:radiobutton path="absence" value="true"/>     </td>
    </tr>
        </c:forEach>
</table>

    <input type="submit">
</form:form>
</body>
<%--</html>--%>
