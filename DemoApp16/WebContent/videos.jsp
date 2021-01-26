<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	/* To prevent caching of webpages */
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
	
	response.setHeader("Pragma", "no-cache"); // HTTP 1.0
	
	response.setHeader("Expires","0"); // Proxies
	
	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	<h1>Below you can access the videos</h1>
	
<!-- Youtube video link embedded -->
	<iframe width="560" height="315" src="https://www.youtube.com/embed/Eqi-hYX50MI" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

</body>
</html>