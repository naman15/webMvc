<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebApp</title>
</head>
<body>
	<h1>My first Servlet by ${name}</h1>
	<form action="/login.do" method="post">
		Enter your Name <input type="text" name="name"/>
		<br>
		Enter your password <input type="password" name="Password"/>
		<input type="submit"/>
	</form>
</body>
</html>