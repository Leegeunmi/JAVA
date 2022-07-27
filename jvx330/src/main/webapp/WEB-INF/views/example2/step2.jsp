<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join_2</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>회원가입</h3>
	<h4>회원정보입력</h4>
	<form action="login" method="post">
		<label>E-mail</label><input type="text" name="email"/><br>
		<label>Password</label><input type="password" name="password"/><br>
		<input type="submit" value="회원가입"/>
	</form>
	
</body>
</html>