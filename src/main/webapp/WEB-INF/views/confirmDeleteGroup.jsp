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
Jesteś pewien, że chesz usunąć grupę: ${group.date} ?
<a href="/group/delete/${group.id}">Delete</a>
<a href="/group/groupList">Cancel</a>
</body>
</html>
