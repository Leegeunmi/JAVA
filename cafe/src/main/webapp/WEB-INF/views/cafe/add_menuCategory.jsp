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
<h3>메뉴카테고리</h3>
<form:form method ="post" modelAttribute="menuCategory">
	<label>메뉴</label>
	<form:button type="submit" value="Brewing">Brewing</form:button>
	<form:button type="submit" value="HandDrip">Hand drip</form:button>
	<form:select path="categoryName">
		<form:options items="${menuCategoryProviderList }"/>
	</form:select><br>
	
	<input type="submit" value="선택"/>
</form:form>
</body>
</html>