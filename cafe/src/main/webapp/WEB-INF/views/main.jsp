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
<h1>GOVASON</h1>
<a href="/cafe/cutomer/select_menuCategory">카테고리 추가</a>
<form action="select_menuCategory" method="post">
	<input type="submit" value="주문하기" />
</form>
</body>
</html>