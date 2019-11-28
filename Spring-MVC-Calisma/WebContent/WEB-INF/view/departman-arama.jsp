<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<title>Department Search</title>
</head>
<body>
	<f:form action="search" modelAttribute="department">
		Department	: <f:input path="depID"/> <br><br>
		<input type="submit" value="Search">
	</f:form>
	
	<br><br><br>
	
	<h2>Department</h2>
	ID 			: ${department.depID} <br>
	Name   		: ${department_name} <br>

</body>
</html>