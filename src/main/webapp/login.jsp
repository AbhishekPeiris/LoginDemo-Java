<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<style type="text/css">
	body{
	font-family: Tahoma;
	}
</style>
</head>
<body>
	
	<h1>Login Page</h1><br>
	
	<form action="login" method="post">
		
		User Name <input type="text" name="username" placeholder="Enter your username"><br>
		Password&nbsp;&nbsp;&nbsp;<input type="password" name="password" placeholder="Enter your password"><br>
		
		<input type="submit" name="submit" value="Login">
		
	</form>
</body>
</html>