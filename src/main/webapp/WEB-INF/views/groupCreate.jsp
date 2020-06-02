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
    <title>Stwórz Grupę</title>
</head>
<body>

<form:form method="post" modelAttribute="group" action="/admin/group">
    <form:hidden path="id"/>

<div>
    <label>
        Dzień tygodnia <form:input path="dayOfWeek"/>
        <form:errors path="dayOfWeek"/>
    </label>
</div>
<div>
    <label>
        Godzina grupy <form:input path="hour"/>
        <form:errors path="hour"/>
    </label>
</div>
<div>
    <label>
        Studenci
        <form:select  items="${students}" itemValue="id" itemLabel="fullName" path="students" multiple="true">

    </form:select>
    </label>
</div>
    <br>
    <div>
        <label>
            Trenerzy
            <form:select  items="${trainers}" itemValue="id" itemLabel="fullName" path="trainers" multiple="true">

            </form:select>
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
