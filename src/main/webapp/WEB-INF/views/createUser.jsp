<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
</head>
<body>

<form:form method="post" modelAttribute="user" >
    <form:hidden path="id"/>
    <div>
        <label>
            Nazwa użytkownika <form:input path="username"/>
            <form:errors path="username"/>
        </label>
    </div>
    <div>
        <label>
            Hasło <form:input path="password"/>
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
