<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Personel Kayit Formu</title>
<style>.error{color:red}</style>
</head>
<body>
	
 
	<f:form action="save" modelAttribute="abone">
		Name	: 	<f:input path="name"/> 
		<br><br>
		Gender 	: 	<f:radiobutton path="gender" value="F"/>
					<f:radiobutton path="gender" value="M"/>
		<br><br>
		Interests 	: <br>
			Sport  	: <f:checkbox path="interests" value="sport"/>
			Cinema	: <f:checkbox path="interests" value="cinema"/>
			Music	: <f:checkbox path="interests" value="music"/>
		<br><br>	
		City of Birth	:	<f:select path="birthCity">
								<f:options items="${abone.birthCities}"/>
							</f:select>
		<br><br>	
		Date of Birth	:	<f:input path="birthDate"/> 						
	<input type="submit" value="Save">					
	</f:form>

	
</body>
</html>