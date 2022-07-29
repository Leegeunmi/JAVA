<%@page import="com.varxyz.banking.domain.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <title>main</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/normalize.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/initial.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/initial.min.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/default.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/header.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/main/style.css'/>"/>
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
            <li><a href="/banking/banking/login">계좌개설</a></li>
            <li><a href="/banking/banking/login">계좌조회</a></li>
            <li><a href="/banking/banking/login">이체하기</a></li>
            <li><a href="/banking/banking/login">로그인</a></li>
<!--             <li><a href="/banking/banking/find_customer">회원조회</a></li> -->
          </ul>
        </nav>
      </div>
    </header>
    <p>반가워요!</p>
  </div>
</body>

</html>


























<%-- <html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>main</h3>
	<a href="/banking/banking/add_customer">회원가입</a>
	<a href="/banking/banking/find_customer">회원찾기</a>
	<button></button>
</body>
</html> --%>