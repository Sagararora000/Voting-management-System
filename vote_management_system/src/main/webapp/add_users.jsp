<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add_users" method="post">
		id<input type="number" name="user_id"><br>
		name<input type="text" name="user_name"><br>
		age:<input type="number" name="user_age"><br>
		password:<input type="password" name="user_password"><br>
		<input type="submit" value="add">
	</form>
</body>
</html>