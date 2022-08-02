<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get_account</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>내 계좌조회</h3>
	<form action="get_account" method="post">
		<label>아이디</label><input type="text" name="userId"/><br>
		<input type="submit" value="조회"/>
	</form>
</body>
</html>