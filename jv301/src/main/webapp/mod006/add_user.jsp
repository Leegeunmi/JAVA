<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public void jspInit() {
		
	}
%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
		div { display: block; }
	</style>
	<form action="add_user.do" method="post">
	<div>아이디 : <input type="text" name="userId"/></div>
	<div>비밀번호 : <input type="password" name="passwd"/></div>
	<div>이름 : <input type="text" name="userName"/></div>
	<div>주민번호 : <input type="text" name="ssn"/></div>
	<div>주소 : <input type="text" name="addr1"/></div>
	<div>이메일 : <input type="text" name="email1"/>@
	<select name="email2">
	<option value="">선택</option>
    <option value="google.co.kr">google.co.kr</option>
    <option value="naver.com">naver.com</option>
    <option value="daum.net">daum.net</option>
	</select></div>
	<div><input type="submit" value="회원가입"/></div>
	</form>
</body>
</html>