<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-27
  Time: 08:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Potwierdź usunięcie</title>
</head>
<body>
Jesteś pewien, że chesz usunąć: ${student.name} ${student.surname} ?
<a href="/admin/student/delete/${student.id}">Delete</a>
<a href="/admin/student/studentList">Cancel</a>
</body>
<div>
    <a href="/">Strona główna</a>
</div>
</html>
