<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>계좌개설되었습니다.</h3>
<label>e-mail</label> : ${customer.email }<br>
<label>계좌타입</label> : ${account.accountType }<br>
<label>계좌번호</label> : ${account.accountNum }<br>
</body>
</html>