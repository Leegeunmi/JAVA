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
${teaProviderList }<br>
${menuItems.teaName }
<form:form method ="post" modelAttribute="menuItems">
	<input type="submit" value="결제하기"/>
</form:form>
</body>
</html>