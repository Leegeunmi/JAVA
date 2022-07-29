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
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/login/mypage.css'/>"/>
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
            <li><a href="/banking/banking/find_customer">회원조회</a></li>
<!--             <li><a href="/banking/banking/find_customer">회원조회</a></li> -->
          </ul>
        </nav>
      </div>
    </header>
    <p>${email }님 환영합니다!</p>
  </div>
</body>

</html>




<%-- <h3>My Page</h3>
${email}님<br>
<a href="/banking/banking/add_account">계좌생성하러가기</a> 
<form action="find_account" method="post">
	<input type="submit" value="내계좌 조회하기"/>
</form>
<a href="/banking/banking/find_account"></a> 
<form action="logout" method="get">
	<input type="submit" value="로그아웃"/>
</form> --%>