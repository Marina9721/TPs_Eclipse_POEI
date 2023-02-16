<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://localhost.fr/tld/extratags" prefix="mytags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login page</title>
	</head>
	<body>
		<mytags:Header name="${mylogin}" />
	
		<h1>Login page</h1>
		
		<mytags:LoginForm action="login" login="${login}" password="${password}" />
		
		<c:if test="${variable > 1000}">
			<h1>Hello</h1>
		</c:if>
		
		<c:forEach var="name" items="${liste}">
			<c:out value="${name}" />
		</c:forEach>
	
	</body>
</html>