<!-- V20-21  -->
<!-- 
Exception handling in JSP. We have to explicitly mention the error page name in directive tag.
-->
<!-- DIRECTIVE TAG -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="Errors.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

		<% 
		int k =9/0;
		%>

</body>
</html>