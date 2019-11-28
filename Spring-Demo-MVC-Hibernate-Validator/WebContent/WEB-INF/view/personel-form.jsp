<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Personel Kayit Formu</title>
<style>.error{color:red}</style>
</head>
<body>

	<f:form action="save" modelAttribute="sahis">
		First Name	 : <f:input path="firstName"/> <br><br>
		Last Name(*) : <f:input path="lastName"/> 
		<f:errors path="lastName" cssClass="error"/><br><br>
		Salary  	 : <f:input path="salary"/> 
		<f:errors path="salary" cssClass="error"/> <br><br>
		Age		  	 : <f:input path="age"/> 
		<f:errors path="age" cssClass="error"/> <br><br>
		Post Box  	 : <f:input path="postBox"/> 
		<f:errors path="postBox" cssClass="error"/> <br><br>
		Rest Day	 : <f:input path="restDay"/> 
		<f:errors path="restDay" cssClass="error"/> <br><br>
		<input type="submit" value="Save">
	</f:form>
	
</body>
</html>