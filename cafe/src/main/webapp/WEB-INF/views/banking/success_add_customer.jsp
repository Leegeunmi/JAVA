<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login_success</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>회원가입 성공!</h3>
	<label>아이디</label>&nbsp;${customerCommand.userId }<br>
	<label>비밀번호</label>&nbsp;${customerCommand.passwd }<br>
	<label>이름</label>&nbsp;${customerCommand.name }<br>
	<label>주민번호</label>&nbsp;${customerCommand.ssn }<br>
	<label>전화번호</label>&nbsp;${customerCommand.phone }<br>
</body>
</html>