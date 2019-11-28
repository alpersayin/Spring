<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>asdasdsdaasdasd</h2>
	<hr>
	<a href="./showAnotherPage">Diğer Sayfa</a>
	<hr>
	<f:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Çıkış">
	</f:form>
	
</body>
</html>