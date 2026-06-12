<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Employees</title>
</head>

<body>

<h2>Employee List</h2>

<table border="1" cellpadding="10">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Salary</th>
</tr>

<c:forEach items="${employees}" var="emp">

<tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.salary}</td>
</tr>

</c:forEach>

</table>

</body>
</html>