<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>    
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
	<p>Kullanıcı : <s:authentication property="principal.username"/></p>
	<p>Rolleri	 : <s:authentication property="principal.authorities"/></p>
	<s:authorize access="hasRole('ADMIN')">
	<hr>
	<a href="${pageContext.request.contextPath}/managers">Yöneticiler</a>
	</s:authorize>
	<s:authorize access="hasRole('HR')">
	<hr>
	<a href="${pageContext.request.contextPath}/hr">İK</a>
	</s:authorize>
	<hr>
	<f:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Çıkış">
	</f:form>
</body>
</html>