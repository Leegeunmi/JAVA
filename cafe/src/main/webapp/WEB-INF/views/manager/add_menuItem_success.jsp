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
<link rel="stylesheet" href="<c:url value='/resources/css/menu/add_menuItem_success.css'/>">
<%-- <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>" /> --%>
</head>
<body>
    <div id="super_wrap">
      <div id="wrap">
        <div id="inner_wrap">
          <div class="title">
            <h1>Success!</h1>
          </div>
            <div class="add_menu_txt">
              <p>등록 메뉴명<br><strong>${menuItem.itemName}</strong></p>
              <p>등록 메뉴가격<br><strong>${menuItem.itemPrice}</strong></p>
              <p>등록 메뉴수량<br><strong>${menuItem.itemStock}</strong></p>
            </div>
            <div class="button_group">
              <button class="gbtn" type="button" onclick='location.href="<c:url value='add_menuItem'/>"'>추가등록</button>
              <button class="gbtn" type="button" onclick='location.href="<c:url value='main'/>"'>완료</button>
            </div>
        </div>
      </div>
    </div>
</body>
</html>