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
<link rel="stylesheet" href="<c:url value='/resources/css/menu/add_menuItem.css'/>">
<%-- <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>" /> --%>
</head>
<body>
    <div id="super_wrap">      
      <div id="wrap">
        <div id="login_wrap">
          <div class="title">
            <h1>Add Menu</h1>
          </div>
          <form:form method="post" modelAttribute="menuItem">
            <table class="table_a">
              <tr>
                <td>
                  <form:input class="big" path="itemName" placeholder="등록 메뉴명" required="required"/>
                </td>
              </tr>
              <tr>
                <td>
                  <input type="number" class="big" name="itemPrice" placeholder="등록 메뉴가격 (숫자입력)" required="required"/>
                </td>
              </tr>
              <tr>
                <td>
                  <input type="number" class="big" name="itemStock" placeholder="등록 메뉴수량 (숫자입력)" required="required"/>
                </td>
              </tr>
            </table>
            <div class="button_group">
              <button class="gbtn" type="submit">등록</button>
              <button class="gbtn" type="button" onclick='location.href="<c:url value='main'/>"'>취소</button>
            </div>
          </form:form>
        </div>
      </div>
    </div>
</body>
</html>
