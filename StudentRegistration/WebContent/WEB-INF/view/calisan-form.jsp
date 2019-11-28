<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calışan Kayıt Formu</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>Çalışan Kayıt Sistemi</h1>
		</div>
	</div>
	
	<h3>Çalışan Kayıt</h3>
	<f:form action="saveCalisan" modelAttribute="calisan" method="POST">
		<f:hidden path="id"/>
		<table class="standart-table">
		<tr>
			<td><label>İsim</label></td>
		 	<td><f:input path="firstName"/></td>
		</tr>
		<tr>
			<td><label>Soyisim</label></td>
		 	<td><f:input path="lastName"/></td>
		</tr>
		<tr>
			<td><label>Şehir</label></td>
		 	<td><f:input path="city"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Kaydet" class="save-button"></td>
		</tr>
		</table>
	</f:form>
	
	<div id="content">
		<button onclick="window.location.href='${pageContext.request.contextPath}/calisan/list'"
				class="back-button">Back to List</button>
	</div>

</body>
</html>