<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html>
<html>
<head>
<title>Results</title>
</head>
<body>
	First Name	:	${anket.firstName} <br>
	Last Name	:	${anket.lastName} <br>
	Gender		:	${anket.gender} <br>
	Age			:	${anket.age} <br>
	School		: 	${anket.schoolName} <br>
	Graduate Type : ${anket.graduateType} <br>
	Graduate Year : ${anket.graduateYear} <br>
	Licenses	  : <br>
	<c:forEach var="temp" items="${anket.driverLicenses}">
		<c:out value="${temp}"></c:out>
	</c:forEach> <br>
	<a href="./page1">Page 1</a> <br>
	<a href="./page2">Page 2</a> <br>
	<a href="./page3">Page 3</a> <br>
</body>
</html>