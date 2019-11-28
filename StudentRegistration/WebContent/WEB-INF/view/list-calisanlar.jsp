<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Çalışan Listesi</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h1>Çalışan Kayıt Sistemi</h1>
		</div>
	</div>
	
	<br>
	
	<div id="buttons-bar">
		<table>
			<tr>
				<td><button onclick="window.location.href='addCalisanForm'" 
					class="add-button">Çalışan Ekle</button></td>
			<f:form action="searchCalisan" method="GET">
				<td align="right">İsim veya Soyisime Göre Ara</td>
				<td width=80px><input type="text" name="calisanAra"/></td>
				<td width=80px><input type="submit" value="Ara" class="search-button"></td>
			</f:form>
			</tr>
		</table>
	</div>
	
	<hr width=90% align="left">
	<br>
	
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>City</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="temp" items="${calisanlar}">
				<c:url var="updateLink" value="/calisan/updateCalisanForm">
					<c:param name="calisanId" value="${temp.id}"></c:param>
				</c:url>
				
				<c:url var="deleteLink" value="/calisan/deleteCalisan">
					<c:param name="calisanId" value="${temp.id}"></c:param>
				</c:url>
				<tr>
					<td>${temp.firstName}</td>
					<td>${temp.lastName}</td>
					<td>${temp.city}</td>
					<td width=80px>
						<button onclick="window.location.href='${updateLink}'" class="update-button">Güncelle</button>
					</td>
					<td width=80px>
						<button onclick="if (confirm('Siliniyor, emin misin?')) window.location.href='${deleteLink}'" class="delete-button">Sil</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>