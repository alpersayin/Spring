<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h1>Student Registration System</h1>		
		</div>
	</div>
	
	<br>
	
	<div id="buttons-bar">	
		<table border=1px width=100%>
			<tr>
				<td><button onclick="window.location.href='addStudentForm'" 
					class="add-button" >Add Student</button></td>
			<f:form action="searchStudent" method="GET">
				<td align="right">Search by Name or Surname</td>
				<td width=80px><input type="text" name="searchName"/></td>
				<td width=80px><input type="submit" value="Search" class="search-button"/></td>
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
				<th>Student No</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var= "stdnt" items="${students}">
				<c:url var="updateLink" value="/student/updateStudentForm">
					<c:param name="studentId" value="${stdnt.id}" />
				</c:url>
				
				<c:url var="deleteLink" value="/student/deleteStudent">
					<c:param name="studentId" value="${stdnt.id}" />
				</c:url>
				<tr>
					<td>${stdnt.firstName}</td>
					<td>${stdnt.lastName}</td>
					<td>${stdnt.studentNo}</td>
					<td width="80px">
						<button onclick="window.location.href='${updateLink}'" class="update-button">Update</button>
					</td>
					<td width="80px">
						<button onclick="if (confirm('Siliyoruz, emin misin?')) window.location.href='${deleteLink}'" class="delete-button">Delete</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>