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
<link rel="stylesheet" href="<c:url value='/resources/css/login/login_success.css'/>">
</head>
<body>
	<div id="super_wrap">		
    <div id="wrap">
      <div id="inner_wrap">
        <div class="title">
          <h1>Welcome Govason!</h1>
        </div>
        <form>
          <div class="button_group">
          	<button class="gbtn" type="button" onclick='location.href="<c:url value='add_menuItem'/>"'>메뉴등록</button>
          	<button class="gbtn" type="button" onclick='location.href="<c:url value='main'/>"'>취소</button>
          </div>
        </form>
      </div>
    </div>
	</div>
</body>
</html>



