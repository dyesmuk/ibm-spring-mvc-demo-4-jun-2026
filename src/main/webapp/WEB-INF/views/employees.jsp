<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<html>
<head>
<title>Employees</title>
</head>

<body>

	<h2>Employee List</h2>

	<table>
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

	<hr />

	<h3>Add Employee</h3>
	<form action="${pageContext.request.contextPath}/employees/add"
		method="post">
		ID: <input type="number" name="id" required /> <br />
		<br /> Name: <input type="text" name="name" required /> <br />
		<br /> Salary: <input type="number" name="salary" required /> <br />
		<br /> <input type="submit" value="Add Employee" />
	</form>

	<c:if test="${not empty message}">
		<p>${message}</p>
	</c:if>

	<hr />

	<h3>Find Employee by ID</h3>
	<form action="${pageContext.request.contextPath}/employees/find"
		method="get">
		ID: <input type="number" name="id" required /> <input type="submit"
			value="Find" />
	</form>

	<c:if test="${not empty foundEmployee}">
		<p>Found: ID=${foundEmployee.id}, Name=${foundEmployee.name},
			Salary=${foundEmployee.salary}</p>
	</c:if>
	<c:if test="${not empty notFound}">
		<p>${notFound}</p>
	</c:if>

</body>
</html>
