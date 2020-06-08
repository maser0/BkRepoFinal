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
    <title>Obecność</title>
</head>
<body>
<form:form method="post" modelAttribute="classes" >
    <form:hidden path="id"/>


    <table>
        <tr>
            <th>Data zajęć</th>
            <th> Nazwa grupy</th>
        </tr>
            <%--        <c:forEach items="${group.classesList}" var="class">--%>
        <tr>
                <%--                <td>${class.time}</td>--%>
<%--            <td>Data zajęć <form:input path="time"/></td>--%>
            <td>Data zajęć <input type="datetime-local" name="time" value="${classes.time}" pattern="yyyy-mm-dd"/></td>
            <td>${group.dayOfWeek}  ${group.hour}</td>


        </tr>
            <%--        </c:forEach>--%>
    </table>
    <input type="submit">

</form:form>
</body>
<div>
    <a href="/">Strona główna</a>
</div>
</html>
