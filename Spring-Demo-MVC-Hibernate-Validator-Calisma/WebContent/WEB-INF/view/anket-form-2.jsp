<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<title>FORM PAGE-2</title>
</head>
<body>
	<f:form action="page2" modelAttribute="anket">
		<h3>Education</h3>
		School Name	:	<f:input path="schoolName"/> 
		<br><br>
		Graduate	:	<f:select path="graduateType">
							<f:options items="${anket.graduateTypes}"/>
						</f:select>
		<br><br>					
		Graduate Year : <f:input path="graduateYear"/>
		<br><br>	
		<input type="submit" value="Submit">
	</f:form>
	<br>
	<a href="./page3">Next</a>
	<br>
	<a href="./page1">Back</a>
	<br>
	<a href="./submit">Results</a>
</body>
</html>