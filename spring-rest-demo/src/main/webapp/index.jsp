<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring rest demo</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
	<hr>
	<a href="${pageContext.request.contextPath}/api/students">student api</a>
</body>
</html>