<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<title>Personel Kayit</title>
</head>
<body>
	<h2>Kayıt Başarılı</h2>
	Personel 	: ${sahis.firstName} ${sahis.lastName} <br>
	Salary   	: ${sahis.salary} <br>
	Post Box   	: ${sahis.postBox} <br>
	Age   		: ${sahis.age} <br>
	Rest Day	: ${sahis.restDay} <br>
</body>
</html>