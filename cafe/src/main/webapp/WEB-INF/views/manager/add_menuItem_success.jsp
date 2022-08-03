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
	<h3>등록완료</h3>
	<label>상품이름</label> : ${menuItem.itemName }<br>
	<label>상품금액</label> : ${menuItem.itemPrice }<br>
	<label>상품수량</label> : ${menuItem.itemStock }<br>
<%-- 	<label>상품이미지</label> : ${menuItem.itemImg }<br> --%>
	<button type="button" onclick='location.href="<c:url value='main'/>"'>종료</button>
	<button type="button" onclick='location.href="<c:url value='manager/add_menuItem'/>"'>상품추가등록</button>
</body>
</html>