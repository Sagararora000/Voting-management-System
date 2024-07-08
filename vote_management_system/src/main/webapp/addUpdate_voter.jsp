<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int id = Integer.parseInt(request.getParameter("user_id"));
	String name = request.getParameter("user_name");
	int age = Integer.parseInt(request.getParameter("user_age"));

%>
	<form action="addUpdate_voter" method="post">
		Voter id:<input type="number" name="voter_id" value=<%=id %>><br>
		voter Name:<input type="text" name="voter_name" value=<%=name %>><br>
		Voter address:<input type="text" name="voter_address" ><br>
		Voter age:<input type="number" name="voter_age" value=<%=age %>><br>
		Voter gender:<input type="text" name="voter_gender" ><br>
		Father Name:<input type="text" name="voter_father" ><br>
		Mother Name:<input type="text" name="voter_mother" ><br>
		
		<input type="submit" value="add/Update">
	</form>
</body>
</html>