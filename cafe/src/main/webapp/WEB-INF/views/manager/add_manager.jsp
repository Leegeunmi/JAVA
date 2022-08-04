<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>관리자등록</h3>
	<form action="add_manager" method="post">
		<label>지점명</label><input type="text" name="branchName" required="required"><br>
		<label>성명</label><input type="text" name="managerName" required="required"><br>
		<label>휴대전화</label><input type="text" name="phone" required="required"><br>
		<label>비밀번호</label><input type="password" name="passwd" required="required"><br>
		<input type="submit" value="등록"/>
	</form>
</body>
</html>