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
<h3>메뉴아이템</h3>
	${teaProviderList }<br>
	${menuCategory.categName}
	
	<form:form method ="post" modelAttribute="menuItem">
<%-- 	<label>메뉴</label>
	<form:button type="submit" value="Apple Tea">Apple tea 5,000</form:button>
	<form:button type="submit" value="Mint">Mint tea 5,000</form:button>
	<form:select path="teaName">
		<form:options items="${teaProviderList }"/>
	</form:select><br> --%>
	
	<input type="submit" value="선택"/>
</form:form>
</body>
</html>