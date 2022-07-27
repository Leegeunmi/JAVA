<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>회원가입 성공</h3>
	<label>아이디 : </label>${customerCommand.userId}<br>
	<label>비밀번호 : </label>${customerCommand.passwd}<br>
	<label>이름 : </label>${customerCommand.name}<br>
	<label>주민번호 : </label>${customerCommand.ssn}<br>
	<label>연락처 : </label>${customerCommand.phone}<br>
	<p/>
	<a href="/banking/banking/add_account">계좌생성하러가기</a>
</body>
</html>