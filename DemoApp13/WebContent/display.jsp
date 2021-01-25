<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- v26 -27 -->
 <!-- Need to download mysql connector and add it to WebContent->WEB-INF->lib directory -->   
 <!-- To use SQL tags we have to import SQL library like we imported core in DemoApp12.
-->   

 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<body>

<!-- This is to connect to data base. var "db" is the datasource -->
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/" user="root" password="Dingo@12"/>
	
	<!-- sql:query is use to perform sql queries. datasource needs to be mentioned. var "rs" stores the database -->
	<sql:query var="rs" dataSource="${db}">Select * from School.Students</sql:query>
	
	
	<!-- Selecting rs.rows as stud(rows of database as variable "stud") and printing the values. -->
	<c:forEach items="${rs.rows}" var="stud">
		<c:out value="${stud.RollNumber}   :   ${stud.Name} : ${stud.Marks}  "></c:out>
		<br>
	</c:forEach>
	
</body>
</html>