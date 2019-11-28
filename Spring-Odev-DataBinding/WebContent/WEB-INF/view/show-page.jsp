<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Show Page</title>
</head>
<body>
	<!-- 
	<h3>Search Results</h3>
	Employee ID	: ${employee.empID} <br>
	First Name	: ${employee.empFirstName} <br>
	Last Name	: ${employee.empLastName} <br>
	Salary		: ${employee.empSalary}
	<br><br>
	 -->
	<f:form action="update" modelAttribute="employee">
		Employee ID	:	<f:input path="empID" readonly="true"/> <br><br>
		First Name	:	<f:input path="empFirstName"/> <br><br>
		Last Name	:	<f:input path="empLastName"/> <br><br>
		Salary		:	<f:input path="empSalary"/> <br><br>
		<input type="submit" value="Save">
	</f:form>
	<br>
	<a href="http://localhost:8081/Spring-Odev-DataBinding">Return Search Page</a>
	<br>
	<h4>${updateMassage}</h4>
	<br>
</body>
</html>