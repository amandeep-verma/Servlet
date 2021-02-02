<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- v24-25 -->
 <!-- Need to download JSTL 1.2 and add it to build path and WebContent->WEB-INF->lib directory -->   
 <!-- In JSTl we use custom library. We have to import the library-->   
 <!-- prefix needs to be prefixed each time using the JSTL tag.-->
 <!-- Using different tags with c -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<body>


	<!--Expression Language (EL)- We use similar structure in JSTL for output-->
	${label} <br>
	
	<c:out value="${label}" /> <br>
	<c:out value="Hello World" />
	
	<!-- import tag can be used to import a webpage -->
	<%-- <c:import url="https://www.google.com/"></c:import> --%>
	
	<br>
	${student.name}
	
	<br>
	${group}
	
	<br>
	
	<!-- for each loop style -->
	<c:forEach items="${group}" var ="s">
		${s.name}, ${s.rollnumber}<br>
		
	</c:forEach>
	
</body>
</html>