<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-29
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Obecność grupy</title>
</head>
<body>
<form:form method="post" modelAttribute="classes">
<%--        <form:hidden path="id"/>--%>
    <%--<form method="post" >--%>


    <table>
        <tr>
            <th>Data zajęć</th>
            <th> Nazwa grupy</th>
            <th> Trenerzy</th>
            <th> Obecności</th>
        </tr>

        <tr>
            <td>${classes.time}</td>
            <td>${classes.group.dayOfWeek}</td>
            <c:forEach items="${trainers}" var="trainer">
                <td>${trainer.fullName}</td>
            </c:forEach>
            <c:forEach items="${classes.presences}" var="presence">

                <td>${presence.student.fullName}</td>
                <td>
                    <input type="hidden" value="${presence.id}" name="id"/>
                    <input type="checkbox" value="${presence.absence}" name="absence"/>
<%--                    <form:input type="checkbox" path="absence"/>--%>
                </td>

            </c:forEach>


        </tr>

    </table>
    <input type="submit">

</form:form>
</body>
<div>
    <a href="/">Strona główna</a>
</div>
</body>
</html>
