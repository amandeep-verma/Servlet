<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Checking if session has attribute username, if not sending it back to login.jsp -->
	<%
	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	<!-- Using JSTL -->
	Welcome ${username}
	<br>

	<a href="videos.jsp"> Videos here here</a>

	<br>

	<a href="aboutus.jsp"> Something about us</a>

<!-- Clicking on logout calls the logout servlet and sends user to loginpage -->
	<form action="Logout">
		<input type="submit" value="logout">
	</form>

</body>
</html>