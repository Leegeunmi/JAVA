<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add_account</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<!-- <body>
  <div id="wrap">
    <div id="join_wrap">
    <div class="title">
      <h1>신규 계좌 만들기</h1>
    </div>
    <form action="add_account" method="post">
      <table class="table_a">
        <tr>
          <td>
            <input type="text" class="middle" placeholder="아이디" name="userId">
          </td>
        </tr>
        <tr>
          <td>
            <input type="text" class="middle" placeholder="계좌종류" name="accType">
          </td>
        </tr>
      </table>
      <div class="button-group">
        <button class="gbtn normal">완료</button>
      </div>
    </form>
  </div>
  </div>
</body> -->
<body>
	<h3>신규계좌신청</h3>
	<form action="add_account" method="post">
		<label>회원ID : </label>${userId }<br>
		<label>계좌종류 </label>
		<select name="accountType">
          <option value="" disabled selected>계좌선택</option>
          <option value="C">예금계좌</option>
          <option value="S">저축계좌</option>
        </select><br>
		<label>금액 : </label><input type="number" name="balance"><br>
		<p/>
		<input type="submit" value="계좌생성"/>
	</form>
</body>
</html>



<%-- <body>
	<h3>신규계좌신청</h3>
	<form action="add_account" method="post">
		<label>회원ID : </label>${userId }<br>
		<label>계좌종류 </label>
		<select name="accountType">
          <option value="" disabled selected>계좌선택</option>
          <option value="C">예금계좌</option>
          <option value="S">저축계좌</option>
        </select><br>
		<label>금액 : </label><input type="number" name="balance"><br>
		<p/>
		<input type="submit" value="계좌생성"/>
	</form>
</body> --%>