<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-27
  Time: 08:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
        Studenci <form:select  items="${students}" path="students" multiple="true"/>
    </label>
</div>





<input type="submit">
</form:form>
</html>
