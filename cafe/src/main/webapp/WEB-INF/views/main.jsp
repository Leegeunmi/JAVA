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
<link rel="stylesheet" href="<c:url value='/resources/css/main/main.css'/>">
</head>
<body>
<form:form action="main" method="post">
    <div id="wrap">
      <div id="inner_wrap">
        <div class="main_img">
          <img src="<c:url value='/resources/img/largePortName1.png'/>" alt="mainImg">
        </div>
        <div class="button_group">
          <button class="gbtn" type="button" onclick='location.href="<c:url value='login'/>"'>관리자 페이지</button>
		  <button class="gbtn" type="button" onclick='location.href="<c:url value='order_main'/>"'>고객 페이지</button>
        </div>
      </div>
    </div>
</form:form>
</body>
</html>