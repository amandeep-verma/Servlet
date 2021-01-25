<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- v28 -->

 <!-- To use function tags we have to import functions like we imported core in DemoApp12 -->   

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 
<!DOCTYPE html>
<html>
<body>
	
	<!-- Setting the String to variable str -->
	<c:set var="str" value="The concepts of JSTL"/>
	
	<!-- Printing the String and its length (Using function length) -->
 	String : ${str}<br>
	Length : ${fn:length(str)} <br> 
	
	
	
	<!-- Splitting the string on space character and printing them back -->
	<c:forEach items="${fn:split(str,' ')}" var="s">
		${s} <br>
	</c:forEach>
	
	index of "of": ${fn:indexOf(str,"of")} <br>
	
	<!-- Using if condition -->
	<c:if test="${fn:contains(str,'concepts')}">
		string contains "concepts"
	</c:if>
	
	
</body>
</html>