<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-27
  Time: 08:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stwórz Studenta</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>

<form:form method="post" modelAttribute="student" action="/admin/student">
    <form:hidden path="id"/>
<div>
    <label>
        Imię <form:input path="name"/>
        <form:errors path="name"/>
    </label>
</div>
<div>
    <label>
        Nazwisko <form:input path="surname"/>
        <form:errors path="surname"/>
    </label>
</div>
<div>
    <label>
        Numer kontaktowy <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>
    </label>
</div>



<input type="submit">
</form:form>
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
