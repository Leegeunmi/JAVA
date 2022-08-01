<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 1) -->
</head>
<body>
<h3>회원가입</h3>
<form:form method="post" modelAttribute="customer"> <!-- 안써주면 그냥 commend이다. 현재는 customer commend이다. 되도록 써주자 -->
	<label>e-mail</label>
	<form:input path="email1"/>@<!-- 8)email1 email2추가 및 변경 -->
	<form:select path="email2">
		<option value="unknown">선택</option>
		<form:options itemValue="emailHost"
					  itemLabel="emailCode"
					  items="${emailProviderList }"/> <!-- 옵션에 찍어라 -->
	</form:select><br>
	
	<label>비밀번호</label>
	<form:password path="passwd"/><br>
	
	<label>이름</label>
	<form:input path="name"/><br>
	
	<label>주민번호</label>
	<form:input path="ssn"/><br>
	
	<label>연락처</label>
	<form:select path="phone1"><!-- 12) -->
		<option value="unknown">선택</option>
		<form:options items="${phoneProviderList }"/> <!-- 옵션에 찍어라 -->
	</form:select>-
	<form:input path="phone2"/>-<form:input path="phone3"/><br>
	
	<input type="submit" value="가입하기"/>	
</form:form>
</body>
</html>

<!-- 14) Account는 e-mail form스타일로, radio버튼으로 -->
<!-- CustomerCommand.customer.name (?) -->
<!-- 게시글은 목록때는 모든 정보를 가지고 오지 않고 눌렀을때 그 아이디에 해당하는 게시글정보(글,첨부,댓글 등)를 가지고 오게하기 -->
