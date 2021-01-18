<!-- V20-21  -->
<!-- 
Using header file, directive tag(language, content type, import)
Also Taglib can be used to define tags(new tags or customized one), we don't have a example on this page

Implicit Objects in JSP
Pagecontext is an object which is an object of page context
-->

<!-- DIRECTIVE TAG -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Scanner, java.util.ArrayList"%>
    
    <!--  Header file  -->
    <%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body bgcolor='green'>

		<% 
			int k = 99;
			out.println("Output: "+k);
			
			// The attribute name is assigned to Amandeep. You can get the value using getAttribute().
			// By default the scope of the pageContext is same page.
			pageContext.setAttribute("name", "Amandeep");
			
			out.println(pageContext.getAttribute("name"));
			
			// To specify the scope manually to the session
			pageContext.setAttribute("phone", "Samsung", PageContext.SESSION_SCOPE);
		%>

</body>
</html>