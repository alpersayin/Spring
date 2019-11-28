<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Personel Kayit Formu</title>
</head>
<body>

	<f:form action="save" modelAttribute="sahis">
		First Name	: <f:input path="firstName"/> <br><br>
		Last Name	: <f:input path="lastName"/> <br><br>
		Salary  	: <f:input path="salary"/> <br><br>
		<%--
		Department	:	<f:select path="department">
							<f:option value="HR" label="Human Resources"/>
							<f:option value="AC" label="Accounting"/>
							<f:option value="SA" label="Sales"/>
							<f:option value="PR" label="Production"/>
					  	</f:select>
		 --%>
		Department	: 	<f:select path="department">
							<f:options items="${sahis.departments}"/>
						</f:select>					  	
		<br><br>
		Social Security Type  :
			Sendikalı 	<f:radiobutton path="socialSecurityType" value="Sendikalı"/>
			Harranlı 	<f:radiobutton path="socialSecurityType" value="Harranli"/>
		
		<br><br>
		Side Benefits: <br><br>
			Yemek Kartı : <f:checkbox path="sideBenefits" value="yemek kartı"/><br> 
			Sağlık Sigortası : <f:checkbox path="sideBenefits" value="sağlık sigortası"/><br>
			Araba : <f:checkbox path="sideBenefits" value="araba"/><br><br>
		
		<input type="submit" value="Save">
	</f:form>
	
</body>
</html>