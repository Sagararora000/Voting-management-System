<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="entity_classes.UserModel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Object userObj = request.getAttribute("userDetails");
	List<UserModel> users = (List<UserModel>) userObj;
	%>
	<form action="add_users.jsp">
		<input type="submit" value="Add Users">
	</form>
	
	<table border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>age</th>
			<th>operations</th>
		</tr>
		<%
		for (UserModel user : users) {
		%>
		<tr>
		<%if(!user.getName().equals("admin")) {%>
			<td><%=user.getU_id()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAge()%></td>
			<td>
		<!-- <form action="remove_users?param1=value1&param2=value2" method="GET">
			<input type="submit">
			</form>
		 -->	
		 <% int id =  user.getU_id();
		 	String name = user.getName();
		 	int age = user.getAge();
		 %>
		  <a href="remove_users?user_id=<%= id%>">Delete</a>
			<td><a href="addUpdate_voter.jsp?user_id=<%= id%>&user_name=<%= name%>&user_age=<%=age%>">Add/Update</a></td>
			<td><a href="">View Voter Card</a></td>
		</tr>
		<% } %>
		
		
		
		<%
		}
		%>

	</table>
</body>
</html>