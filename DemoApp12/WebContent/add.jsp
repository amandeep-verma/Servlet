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
<!-- Here we can see this will cause a run time exception, which we are handling in Errors.jsp -->
		<% 
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		// custom exception
		if (j==5)
			throw new ArithmeticException("Not what we expected");
		// if j==0 exception
		int k =i/j;
		%>

		Division leads to <%=k %>
</body>
</html>