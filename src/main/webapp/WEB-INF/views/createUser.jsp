<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-28
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>

<form:form method="post" modelAttribute="user" >
    <form:hidden path="id"/>
    <div>
        <label>
            Nazwa użytkownika <form:input path="username" placeholder="Nazwa Użytkownika"/>
            <form:errors path="username"/>
        </label>
    </div>
    <div>
        <label>
            Hasło <form:input path="password" placeholder="Hasło" type="password"/>
            <form:errors path="password"/>
        </label>
    </div>



    <input type="submit">
</form:form>
<div>
    <a href="/">Strona główna</a>
</div>
</body>
</html>
