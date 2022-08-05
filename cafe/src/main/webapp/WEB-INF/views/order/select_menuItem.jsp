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
<link rel="stylesheet" href="<c:url value='/resources/css/menu/select_menuItem.css'/>">
</head>
  <body>
    <div id="super_wrap">
      <div class="left_right">
      	<img src="<c:url value='/resources/img/goLeft_bold.png'/>" alt="goLeft_bold">
      	<img src="<c:url value='/resources/img/goRight_bold.png'/>" alt="goRight_bold">
      </div>
      <div id="wrap">
        <div id="inner_wrap">
          <div class="title">
            <h1>Menu</h1>
            <p>고바슨에서는 고유의 맛을 위해 레귤러 사이즈만 제공합니다.</p>
          </div>
          <form>
            <table class="table_b">
              <tr>
                <td>
                  <img src="<c:url value='/resources/img/1.png'/>" alt="menu1">
                </td>
                <td>
                  <img src="<c:url value='/resources/img/2.png'/>" alt="menu2">
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>드비죵 콜드브루</strong></p>
                  <p>Dubuisson Cold Brew</p>
                  <p>5,000원</p>
                </td>
                <td>
                  <p><strong>쇼콜라 티라미수 라떼</strong></p>
                  <p>Chocolat Tiramisu Latte</p>
                  <p>5,000원</p>
                </td>
              </tr>
              <tr>
                <td>
                  <img src="<c:url value='/resources/img/3.png'/>" alt="menu3">
                </td>
                <td>
                  <img src="<c:url value='/resources/img/4.png'/>" alt="menu4">
                </td>
              </tr>
              <tr>
                <td>
                  <p><strong>비앤나 커피</strong></p>
                  <p>Vienna Coffe</p>
                  <p>5,000원</p>
                </td>
                <td>
                  <p><strong>아이스크림 라떼</strong></p>
                  <p>Ice Cream Latte</p>
                  <p>5,000원</p>
                </td>
              </tr>
            </table>
            <div class="button_group">
              <button class="gbtn" type="button" onclick='location.href="<c:url value='cart'/>"'>카트</button>
              <button class="gbtn" type="button" onclick='location.href="<c:url value='order_main'/>"'>취소</button>
            </div>
            </form>
          </div>
        </div>
    </div>
  </body>
</html>