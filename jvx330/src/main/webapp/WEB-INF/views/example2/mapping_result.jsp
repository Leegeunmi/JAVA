<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>요청 매핑어노테이션을 이용한 경로매핑</h3>
	<p>Route mapping using request mapping annotation</p>
	<h4>Result: ${result }</h4>
	<form action="" method="post">
		<input type="submit" value="확인">
	</form>
</body>
</html>