<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>Student Registration System</h1>		
		</div>
	</div>
	
	<h3>Student Registration</h3>
	<f:form action="saveStudent" modelAttribute="student" method="POST" >
		<f:hidden path="id"/>
		<table class="standart-table">
			<tr>
				<td><label>First Name</label></td>
				<td><f:input path="firstName"/></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><f:input path="lastName"/></td>
			</tr>
			<tr>
				<td><label>Student No</label></td>
				<td><f:input path="studentNo"/></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><f:input path="address"/></td>
			</tr>
			<tr>
				<td><label>E-Mail</label></td>
				<td><f:input path="email"/></td>
			</tr>
			<tr>
				<td><label>Phone</label></td>
				<td><f:input path="phone"/></td>
			</tr>
			<tr>
				<td><label>TC Identity No</label></td>
				<td><f:input path="tcIdentityNo"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" class="save-button" /></td>
			</tr>
		</table>
	</f:form>

	<div id="content">
		<button onclick="window.location.href='${pageContext.request.contextPath}/student/list'"
				class="back-button">Back to List</button>
	</div>
	
</body>
</html>