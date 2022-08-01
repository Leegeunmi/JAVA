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
<h3>계좌</h3>
<form:form method="post" modelAttribute="account">
	<label>accountType</label><br>
	<form:radiobutton path="accountType" value="S" label="savingAccount"/>
	<form:radiobutton path="accountType" value="C" label="checkingAccount"/><br>
	
	<label>계좌번호</label><br>
	<form:input path="accountNum"/><br>
	
	<input type="submit" value="계좌생성"/>
</form:form>
</body>
</html>