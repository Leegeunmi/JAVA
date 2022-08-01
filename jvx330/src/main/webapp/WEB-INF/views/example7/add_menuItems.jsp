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
${menuCategory.categoryName}
<form:form method ="post" modelAttribute="menuItems">
	<label>메뉴</label>
	<form:button type="submit" value="Brewing">Brewing</form:button>
	<form:button type="submit" value="Hand drip">Hand drip</form:button>
	<form:select path="itemName">
		<form:options items="${teaProviderList }"/>
	</form:select><br>
	
	<input type="submit" value="선택"/>
</form:form>
<%-- <form:form method ="post" modelAttribute="menuItems">
	<label>메뉴</label>
	<form:button type="submit" value="apple tea">apple tea</form:button>
	<form:button type="submit" value="mint tea">mint tea</form:button>
	<form:select path="itemName">
		<form:options items="${teaProviderList }"/>
	</form:select><br>
	
	<input type="submit" value="선택"/>
</form:form> --%>
</body>
</html>