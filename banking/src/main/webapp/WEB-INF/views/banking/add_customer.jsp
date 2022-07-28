<%@page import="com.varxyz.banking.domain.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
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
          <a href="/banking/banking/index">Banko</a>
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
        <h1>회원가입하기</h1>
      </div>
		<form action="add_customer" method="post">
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
	        <tr>
	          <td>
	            <input type="text" class="middle" placeholder="이름" name="name">
	          </td>
	        </tr>
	        <tr>
	          <td>
	            <input type="text" class="middle" placeholder="주민번호" name="ssn">
	          </td>
	        </tr>
	        <tr>
	          <td>
	            <input type="text" class="middle" placeholder="전화번호" name="phone">
	          </td>
	        </tr>
	      </table>
        <div class="button-group">
          <button class="gbtn normal" type="submit">완료</button>
          <button class="gbtn normal" type="reset">취소</button>
        </div>
        <div class="join">
          <p>회원이신가요?&nbsp;&nbsp;</p>
          <a href="/banking/banking/login"><strong>로그인</strong></a>
        </div>
      </form>
    </div>
  </div>
</body>
</html>




<!-- 	<h3>회원가입</h3>
	<form action="add_customer" method="post">
		<label>이메일(ID)</label><input type="text" name="email"><br>
		<label>비밀번호</label><input type="password" name="passwd"><br>
		<label>이름</label><input type="text" name="name"><br>
		<label>주민번호</label><input type="text" name="ssn"><br>
		<label>연락처</label><input type="text" name="phone"><br>
		<input type="submit" value="회원가입"/>
	</form> -->