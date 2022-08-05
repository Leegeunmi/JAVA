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
<link rel="stylesheet" href="<c:url value='/resources/css/menu/select_menuCategory.css'/>">
</head>
	<body>
    <div id="super_wrap">
      <div id="wrap">
        <div id="inner_wrap">
          <div class="page_logo">
          	<img src="<c:url value='/resources/img/whiteName.png'/>" alt="whiteName">
          </div>
          <div id="category_wrap">
            <ul class="category">
              <li><a type="button" onclick='location.href="<c:url value='select_menuItem'/>"'>Coffee</a></li>
              <li><a href="#">Hand drip</a></li>
              <li><a href="#">Tea</a></li>
              <li><a href="#">Drink</a></li>
              <li><a href="#">Cake</a></li>
            </ul>
            <div class="select_txt">
              <p>메뉴를 선택해주세요.</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>