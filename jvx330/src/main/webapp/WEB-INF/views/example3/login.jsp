<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>로그인</h3>
	<form action="login" method="post">
		<label>E-mail(ID)</label><input type="text" name="userId"/><br>
		<label>Password</label><input type="password" name="passwd"/><br>
		<input type="submit" value="로그인"/>
	</form>
</body>
</html>