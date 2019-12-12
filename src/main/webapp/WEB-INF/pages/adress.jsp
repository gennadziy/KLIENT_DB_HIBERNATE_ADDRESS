<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MEDION
  Date: 2019-12-12
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>street</th>
        <th>number</th>

    </tr>
    <c:forEach var="adress" items="${adresses}">
        <tr>
            <td>${adress.id}</td>
            <td>${adress.street}</td>
            <td>${adress.number}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
