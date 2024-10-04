<%--
  Created by IntelliJ IDEA.
  User: pjbo8
  Date: 04/10/2024
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Página de bienvenida</title>
</head>
<body>
    <h1>Bienvenid@ <%= request.getAttribute("nombreForm") %></h1>
</body>
</html>
