<%@page import="com.varxyz.banking.domain.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <title>index</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/normalize.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/initial.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/initial.min.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/default.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/header.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/add_account/style.css'/>"/>
</head>

<body>
  <div id="wrap">
    <header id="header">
      <div class="inner">
        <!-- 로고 -->
        <h1 id="top-logo">
          <a href="/banking/banking/index">Banko</a>
        </h1>
        <!-- 메인메뉴 -->
        <nav id="top-nav">
          <ul class="center_menu">
            <li><a href="/banking/banking/add_account">계좌개설</a></li>
            <li><a href="/banking/banking/find_account">계좌조회</a></li>
            <li><a href="/banking/banking/transfer">이체하기</a></li>
            <li><a href="/banking/banking/main">로그아웃</a></li>
<!--             <li><a href="/banking/banking/find_customer">회원조회</a></li> -->
          </ul>
        </nav>
      </div>
    </header>
    <div id="storage_service_wrap">
      <div class="title">
        <h1>계좌개설하기</h1>
      </div>
      <form action="add_account" method="post">
        <table class="table_a">
          <tr>
            <td>
              <select>
                <option value="" disabled selected>계좌선택</option>
                <option value="C">예금</option>
                <option value="S">저축</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>
              <input type="text" class="big" placeholder="금액" name="balance">
            </td>
          </tr>
        </table>
        <div class="button-group">
          <button class="gbtn normal" type="submit">완료</button>
          <button class="gbtn normal" type="reset">취소</button>
        </div>
      </form>
    </div>
  </div>
</body>

</html>





<%-- 	<h3>신규계좌신청</h3>
	<form action="add_account" method="post">
		<label>이메일(ID) : </label>${email}님<br>
		<label>계좌종류 </label>
		<select name="accountType">
          <option value="" disabled selected>계좌선택</option>
          <option value="C">예금계좌</option>
          <option value="S">저축계좌</option>
        </select><br>
		<label>금액 : </label><input type="number" name="balance"><br>
		<p/>
		<input type="submit" value="계좌생성"/>
	</form> --%>