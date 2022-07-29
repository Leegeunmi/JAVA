<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/resources/css/assets/dist/css/bootstrap.min.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/css_header/headers.css'/>">
</head>
<header>
<jsp:include page="/resources/css/incl/header.jsp"/>
</header>
<body>
<main>
<div class="p-5 mb-4 bg-light rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">새로운 계좌 신청하기</h1>
        <p class="col-md-8 fs-4">Using a series of utilities, you can create this jumbotron, just like the one in previous versions of Bootstrap. Check out the examples below for how you can remix and restyle it to your liking.</p>
        <form action="add_account" method="post">
        <select name="accType">
        <option value="SavingsAccount">SavingsAccount</option>
        <option value="CheckingAccount">CheckingAccount</option>
        </select>
        <button type="submit" class="btn btn-primary btn-lg" type="button">바로 생성하기</button>
		</form>
      </div>
    </div>

    <div class="row align-items-md-stretch">
      <div class="col-md-6">
        <div class="h-100 p-5 text-bg-dark rounded-3">
          <h2>송금 시스템 이용</h2>
          <p>Swap the background-color utility and add a `.text-*` color utility to mix up the jumbotron look. Then, mix and match with additional component themes and more.</p>
          	<form action="transfer1" method="get">
	          <button type="submit" class="btn btn-outline-light" type="button" onclick='location.href="<c:url value='transfer1'/>"'>바로가기</button>          
			</form>
        </div>
      </div>
      <div class="col-md-6">
        <div class="h-100 p-5 bg-light border rounded-3">
          <h2>나의 계좌 조회</h2>
          <p>Or, keep it light and add a border for some added definition to the boundaries of your content. Be sure to look under the hood at the source HTML here as we've adjusted the alignment and sizing of both column's content for equal-height.</p>
			<form action="find_account" method="post">			
          	<button type="submit" class="btn btn-outline-secondary" type="button">바로가기</button>
			</form>
        </div>
      </div>
    </div>
    
        <div class="row align-items-md-stretch">
      <div class="col-md-6">
        <div class="h-100 p-5 bg-light border rounded-3">
          <h2>모든 계좌 조회</h2>
          <p>Or, keep it light and add a border for some added definition to the boundaries of your content. Be sure to look under the hood at the source HTML here as we've adjusted the alignment and sizing of both column's content for equal-height.</p>
			<form action="find_all_account" method="post">			
          	<button type="submit" class="btn btn-outline-secondary" type="button">바로가기</button>
			</form>
        </div>
      </div>
      <div class="col-md-6">
        <div class="h-100 p-5 text-bg-dark rounded-3">
          <h2>입금 시스템 이용</h2>
          <p>Swap the background-color utility and add a `.text-*` color utility to mix up the jumbotron look. Then, mix and match with additional component themes and more.</p>
          	<form action="deposit" method="get">
	        <button type="submit" class="btn btn-outline-light" type="button" onclick='location.href="<c:url value='transfer1'/>"'>바로가기</button>          
			</form>
        </div>
      </div>
    </div>
</main>

	

<br>
출금
<form action="withdraw" method="get">
	<input type="submit" value="출금"/>
</form>

</body>
</html>