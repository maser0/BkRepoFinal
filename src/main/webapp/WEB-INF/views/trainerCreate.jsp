<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-26
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stwórz Trenera</title>
</head>
<body>

<form:form method="post" modelAttribute="trainer" action="/admin/trainer">
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



    <input type="submit">
</form:form>
<div>
    <a href="/">Strona główna</a>
</div>
</body>
<br>
<br>
<footer>
    <form action="<c:url value="/logout"/>" method="post">
        <input class="fa fa-id-badge" type="submit" value="Wyloguj">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</footer>
</html>
