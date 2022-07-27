<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add_customer</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
  <div id="wrap">
    <div id="join_wrap">
    <div class="title">
      <h1>회원가입하기</h1>
    </div>
    <form action="add_customer" method="post">
      <table class="table_a">
        <tr>
          <td>
            <input type="text" class="middle" placeholder="아이디" name="userId">
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
        <button class="gbtn normal">회원가입</button>
      </div>
    </form>
  </div>
  </div>
</body>

</html>