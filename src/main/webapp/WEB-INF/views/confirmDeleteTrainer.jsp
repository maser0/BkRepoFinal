<%--
  Created by IntelliJ IDEA.
  User: Witek
  Date: 2020-05-26
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Potwierdź usunięcie</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
Jesteś pewien, że chesz usunąć: ${trainer.name} ${trainer.surname} ?
<a href="/admin/trainer/delete/${trainer.id}">Delete</a>
<a href="/admin/trainer/trainerList">Cancel</a>
</body>
<div>
    <a href="/">Strona główna</a>
</div>
</html>
