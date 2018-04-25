<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebApp</title>
</head>
<body>
	<h1><b>Employee Details</b></h1>
	<c:forEach var="employee" items="${employeeList}">
		<c:out value="${employee}"></c:out>
	</c:forEach>
</body>
</html>