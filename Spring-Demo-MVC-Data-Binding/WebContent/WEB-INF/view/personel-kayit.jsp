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
	Personel 	: ${kisi.firstName} ${kisi.lastName} <br>
	Salary   	: ${kisi.salary} <br>
	Department 	: ${kisi.department} <br>
	Social Security Type  : ${kisi.socialSecurityType}
	Side Benefits :
	<ul>
		<c:forEach var="tmp" items="${kisi.sideBenefits}">
			<li>${tmp}</li>
		</c:forEach>
	</ul>
</body>
</html>