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
<link rel="stylesheet" href="<c:url value='/resources/css/main/main_order.css'/>">
</head>
<body>
    <div id="super_wrap">
    <form:form action="order_main" method="get">
      <div id="wrap">
        <div id="inner_wrap">
          <div class="main_img">
            <img src="<c:url value='/resources/img/largePortName1.png'/>">
          </div>
          <div class="button_group">
            <button class="gbtn" type="button" onclick='location.href="<c:url value='select_menuCategory'/>"'>주문하기</button>
          </div>
        </div>
      </div>
      </form:form>
    </div>
</body>
</html>