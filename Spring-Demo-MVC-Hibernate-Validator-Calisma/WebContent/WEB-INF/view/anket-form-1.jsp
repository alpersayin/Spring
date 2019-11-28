<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<title>FORM PAGE-1</title>
</head>
<body>
	<f:form action="page1" modelAttribute="anket">
		<h3>Personal Information</h3>
		First Name	:	<f:input path="firstName"/> <br><br>
		Last Name	:	<f:input path="lastName"/> <br><br>
		Gender		:	<br>
			Female		<f:radiobutton path="gender" value="F"/>
			Male		<f:radiobutton path="gender" value="M"/>
		<br><br> 			
		Age			:	<f:input path="age"/> 
		<br><br>
		<input type="submit" value="Submit">
	</f:form>
	<br>
	<a href="./page2">Next</a>
</body>
</html>