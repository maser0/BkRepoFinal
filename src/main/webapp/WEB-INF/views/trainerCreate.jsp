<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-26
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stwórz Trenera</title>
</head>
<body>

<form:form method="post" modelAttribute="trainer" action="/trainer">
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

</body>
</html>
