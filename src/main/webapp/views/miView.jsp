<%--
  Created by IntelliJ IDEA.
  User: pjbo8
  Date: 04/10/2024
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejemplo Servlets</title>
</head>
<body>
    <h1>Formulario de ejemplo</h1>

    <form action="<%= request.getContextPath() %>/myServlet2" method="GET">
        <label for="nombre">Introduce tu nombre:</label>
        <input type="text" id="nombre" name="nombreForm" required>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
