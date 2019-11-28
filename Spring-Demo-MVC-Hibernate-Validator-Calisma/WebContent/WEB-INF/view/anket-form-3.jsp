<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html>
<html>
<head>
<title>FORM PAGE-3</title>
</head>
<body>
	<f:form action="page3" modelAttribute="anket">
		<h3>Others</h3>
		Driver License	: <br>
			A Sınıfı	<f:checkbox path="driverLicenses" value="A"/>
			B Sınıfı	<f:checkbox path="driverLicenses" value="B"/>
			C Sınıfı	<f:checkbox path="driverLicenses" value="C"/>
			F Sınıfı	<f:checkbox path="driverLicenses" value="F"/>
			G Sınıfı	<f:checkbox path="driverLicenses" value="G"/>
		<br><br>
		Blood Type		:	<f:select path="bloodType">
								<f:options items="${anket.bloodTypes}"/>
							</f:select>
		<br><br>					
		Interests		: <br>
			Reading		<f:checkbox path="interests" value="reading"/>
			Writing		<f:checkbox path="interests" value="writing"/>
			Singing		<f:checkbox path="interests" value="singing"/>
			Swimming	<f:checkbox path="interests" value="swimming"/>
		<br><br>	
		<input type="submit" value="Submit">
	</f:form>
	<br>
	<a href="./page2">Back</a>
	<a href="./result">Results</a>
</body>
</html>