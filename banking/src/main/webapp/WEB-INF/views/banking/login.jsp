<%@page import="com.varxyz.banking.domain.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>login</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/normalize.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/initial.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/initial.min.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/default.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/default/header.css'/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value ='/resources/css/login/style.css'/>"/>
</head>
<body>
  <div id="wrap">
    <header id="header">
      <div class="inner">
        <!-- 로고 -->
        <h1 id="top-logo">
          <a href="/banking/banking/main">Banko</a>
        </h1>
        <!-- 메인메뉴 -->
        <nav id="top-nav">
          <ul class="center_menu">
            <li><a href="/banking/banking/login">계좌개설</a></li>
            <li><a href="/banking/banking/login">내계좌조회</a></li>
            <li><a href="/banking/banking/login">이체하기</a></li>
            <li><a href="/banking/banking/login">로그인</a></li>
          </ul>
        </nav>
      </div>
    </header>
    <div id="login_wrap">
      <div class="title">
        <h1>로그인하기</h1>
      </div>
 <form action="login" method="post">
	      <table class="table_a">
	        <tr>
	          <td>
	            <input type="text" class="middle" placeholder="이메일(ID)" name="email">
	          </td>
	        </tr>
	        <tr>
	          <td>
	            <input type="password" class="middle" placeholder="비밀번호" name="passwd">
	          </td>
	        </tr>
	      </table>
        <div class="button-group">
          <button class="gbtn normal" type="submit">완료</button>
          <button class="gbtn normal" type="reset">취소</button>
        </div>
        <div class="join">
          <p>아직 회원이 아니신가요?&nbsp;&nbsp;</p>
          <a href="/banking/banking/add_customer"><strong>회원가입</strong></a>
        </div>
      </form>
    </div>
  </div>
</body>
</html>





<!-- 	<h3>로그인</h3>
	<form action="login" method="post">
		<label>이메일(ID) : </label><input type="text" name="email"/><br>
		<label>비밀번호 : </label><input type="password" name="passwd"><br>
		<input type="submit" value="로그인"/>
	</form>
	<a href="/banking/banking/add_customer">회원가입</a>
	<a href="/banking/banking/find_customer">회원찾기</a>
	<button></button> -->