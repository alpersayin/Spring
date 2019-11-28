<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
</head>
<body>
	<h3>Search Employee</h3>
	<f:form action="search" modelAttribute="employee">
		<f:input path="empID"/>
		<input type="submit" value="Search">
	</f:form>
</body>
</html>