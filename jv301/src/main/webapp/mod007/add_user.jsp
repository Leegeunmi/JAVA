<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
		<jsp:param name="subtitle" value=" mod007 : Java Beans and include" />
		</jsp:include>
	</div>
	<div id="content-wrapper">
	<form action="add_user.do" method="post">
		<h3>회원가입</h3>
		<div>아이디<br><input type="text" name="userId"/></div>
		<div>비밀번호<br><input type="password" name="passwd"/></div>
		<div>이름<br><input type="text" name="userName"/></div>
		<div>주민번호<br><input type="text" name="ssn"/></div>
		<div>주소<br><input type="text" name="addr1"/></div>
		<div>이메일<br><input type="text" name="email1"/>@
			<select name="email2">
			<option value="">선택</option>
    		<option value="google.co.kr">google.co.kr</option>
    		<option value="naver.com">naver.com</option>
    		<option value="daum.net">daum.net</option>
		</select></div>
		<br>
		<div><input type="submit" value="회원가입"/></div>
	</form>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp"%>
	</div>
</div>
</body>
</html>

<!-- http://localhost:8080/jv301/mod007/add_user.jsp -->