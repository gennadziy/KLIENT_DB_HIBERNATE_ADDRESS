<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty klient.name}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty klient.name}">
        <title>Edit</title>
    </c:if>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>

</head>
<body>
<c:if test="${empty klient.name}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty klient.name}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty klient.name}">
        <input type="hidden" name="id" value="${klient.id}">
    </c:if>
    <label for="name">Name</label>
    <input type="text" name="name" id="name" value="${klient.name}">
    <label for="year">Year</label>
    <input type="text" name="year" id="year" value="${klient.year}">
    <label for="plec">plec</label>
    <input type="text" name="plec" id="plec" value="${klient.plec}">
    <label for="blocked">blocked</label>
    <input type="text" name="blocked" id="blocked" value="${klient.blocked}">
    <c:if  test="${empty klient.name}">
        <input type="submit" value="Add new klient">
    </c:if>
    <c:if test="${!empty klient.name}">
        <input type="submit" value="Edit klient">
    </c:if>
</form>
</body>
</html>