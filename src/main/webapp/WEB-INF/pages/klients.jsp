<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>KLIENTS</title>
</head>
<body>

<h2>Klients</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>year</th>
        <th>plec</th>
        <th>blocked</th>
        <th>action</th>
    </tr>
    <c:forEach var="klient" items="${klienstList}">
        <tr>
            <td>${klient.id}</td>
            <td>${klient.name}</td>
            <td>${klient.year}</td>
            <td>${klient.plec}</td>
            <td>${klient.blocked}</td>
            <td>
                <a href="/edit/${klient.id}">edit</a>
                <a href="/delete/${klient.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new klient</a>
</body>
</html>