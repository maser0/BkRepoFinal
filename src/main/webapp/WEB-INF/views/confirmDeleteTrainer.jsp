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
</head>
<body>
Jesteś pewien, że chesz usunąć: ${trainer.name} ${trainer.surname} ?
<a href="/admin/trainer/delete/${trainer.id}">Delete</a>
<a href="/admin/trainer/trainerList">Cancel</a>
</body>
</html>
