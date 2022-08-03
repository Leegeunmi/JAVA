<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>" /> --%>
</head>
<body>
<h3>상품등록하기</h3>
	<form action="add_menuItem" method="post">
		<label>상품이름</label><input type="text" name="itemName" required="required"><br>
		<label>상품금액</label><input type="text" name="itemPrice" required="required" placeholder="숫자입력"><br>
		<label>상품수량</label><input type="text" name="itemStock" required="required" placeholder="숫자입력"><br>
<!-- 		<label>상품이미지</label><input type="text" name="itemImg" required="required"><br> -->
		<input type="submit" value="등록"/>
	</form>
</body>
</html>