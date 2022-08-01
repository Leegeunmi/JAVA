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
<h3>${menuCategory.categoryName }</h3>
${menuItems.itemName }
<form:form method ="post" modelAttribute="menuItems">
	<input type="submit" value="선택완료"/>
</form:form>
</body>
</html>