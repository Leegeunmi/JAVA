<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.tab{
	margin-left:30px;
}
</style>
</head>
<body>
<c:forEach var="textLine" items="${textLines}">
	${textLine}<br>
</c:forEach>
</body>
</html>
<!-- 여기서 실행 해 보려면 <form></form>사용 -->