<%@page import="com.Amandeep.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body bgcolor="cyan">

	in show JSP
	<%
		Alien a1= (Alien)request.getAttribute("alien");
		out.println(a1);
	%>
</body>
</html>