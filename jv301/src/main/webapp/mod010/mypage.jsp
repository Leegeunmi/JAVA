<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	a { text-decoration: none; color:inherit; }
</style>
<body>
	<h3>MY PAGE</h3>
	<a href='<c:url value="/mod010/logout"/>'>로그아웃</a>
	<label>Last Access Time : </label> ${lastAccessTime}
</body>
</html>