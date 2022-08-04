<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
<link rel="stylesheet" href="<c:url value='/resources/css/normalize.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/default.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/login/login.css'/>">
</head>
<body>
	<form action="login" method="post">
	
    <div id="wrap">
      <div id="login_wrap">
        <div class="title">
          <h1>Login</h1>
        </div>
        <form>
          <table class="table_a">
            <tr>
              <td>
                <input type="text" class="big" placeholder="휴대전화번호" required="required">
              </td>
            </tr>
            <tr>
              <td>
                <input type="password" class="big" placeholder="비밀번호" required="required">
              </td>
            </tr>
          </table>
          <div class="button_group">
            <button class="gbtn" type="submit">로그인</button>
            <button class="gbtn" type="reset">취소</button>
          </div>
          <div class="join">
            <p>관리자등록이 필요하신가요?&nbsp;&nbsp;</p>
            <a href="join"><strong>관리자등록</strong></a>
          </div>
        </form>
      </div>
    </div>
	</form>
</body>
</html>