<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>회원가입</h3>
	<form action="add_customer" method="post">
		<label>E-mail(ID)</label><input type="text" name="email"/><br>
		<label>Password</label><input type="password" name="passwd"/><br>
		<label>Name</label><input type="text" name="name"/><br>
		<label>Ssn</label><input type="text" name="ssn"/><br>
		<label>Phone</label><input type="text" name="phone"/><br>
		<input type="submit" value="JOIN"/>
	</form>
</body>
</html>