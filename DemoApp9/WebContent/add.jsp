<!-- V16-19 -->
<!-- Tomcat is called servlet container. 
JSP code gets converted to servlet code when we run it.
How?
The name of the file gets changed to class name. add.jsp turns to classname for servlet program
Anything inside < % % > (Scriplet Tag) will get pasted into service method.
Anthing(method or variable) inside < %! %> (Declaration tag) will get pasted in class outside of service method.
Things inside < %@page import= "package name" %> (Directive tag) will be used to import packages.
Things inside < %=k %> (Expression tag) will taken as out.println(k); ,  out.println(a) equivalent to < !=a ! >
Remember in html file we have to chenge action inside the form tag to jsp.
-->

<!-- DIRECTIVE TAG -->
<%@page import="java.util.Scanner, java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='red'>

		<!-- DECLARATION TAG -->
		<%!
			int coef = 3;
			Scanner sc = new Scanner(System.in);
			ArrayList a = new ArrayList();
		%>
		
		
		<!-- SCRIPLET TAG! Anything inside angular bracket with percentage tag is treated as java code -->
		<% 
		/* We dont have to use extends from HTTPServlet, or HttpServletRequest req, HttpServletResponse resp for JSP
		As all these methods are imports are present by itself for jsp 
		*/
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i + j;
		
		//We dont have to make object of PrintWriter, that is already in jsp. -->
		out.println("Output: "+k);
		%>
		<br>
		
		<!-- EXPRESSION TAG -->
		My fav number is <%=coef %>

</body>
</html>