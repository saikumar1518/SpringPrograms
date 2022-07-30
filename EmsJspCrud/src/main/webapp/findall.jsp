<%@page import="com.createiq.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		List<Employee> employees = (List<Employee>) request
				.getAttribute("empAll");
	%>
	<center>
		<h1>All Employees</h1>
		<hr>
		<hr>
		<table border="1px">
			<tr>
				<th>ID</th>
				<th>FIRSTNAME</th>
				<th>LASTNAME</th>
				<th>SALARY</th>
				<th>DOJ</th>
			</tr>
			<%
				for (Employee employee : employees) {
			%>
			<tr>
				<td>
					<%
						out.println(employee.getId());
					%>
				</td>
				<td>
					<%
						out.println(employee.getFirstName());
					%>
				</td>
				<td>
					<%
						out.println(employee.getLastName());
					%>
				</td>
				<td>
					<%
						out.println(employee.getSalary());
					%>
				</td>
				<td>
					<%
						out.println(employee.getDoj());
					%>
				</td>
			</tr>
			<%
				}
			%>
		</table>
		<hr>
		<hr>
		<table border="1px">
			<tr>
				<th>ID</th>
				<th>FIRSTNAME</th>
				<th>LASTNAME</th>
				<th>SALARY</th>
				
				<th>DOJ</th>
			</tr>
			<%
				for (Employee employee : employees) {
			%>
			<tr>
				<td><%=employee.getId()%></td>
				<td><%=employee.getFirstName()%></td>
				<td><%=employee.getLastName()%></td>
				<td><%=employee.getSalary()%></td>
				<td><%=employee.getDoj()%></td>
			</tr>
			<%
				}
			%>
		</table>

		<hr>
		<hr>
	</center>
</body>
</html>