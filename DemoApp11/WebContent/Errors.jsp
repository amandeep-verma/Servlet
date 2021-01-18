<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	
	<!-- exception is an object which only works with error page, otherwise it  will be an error. -->
	<%= exception.getMessage() %> 
</body>
</html>