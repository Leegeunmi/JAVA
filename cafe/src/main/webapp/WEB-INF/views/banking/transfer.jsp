<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>transfer</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
  <div id="wrap">
    <div id="join_wrap">
    <div class="title">
      <h1>이체하기</h1>
    </div>
    <form action="add_account" method="post">
      <table class="table_a">
        <tr>
          <td>
            <input type="text" class="middle" placeholder="이체금액" name="transferAmount">
          </td>
        </tr>
        <tr>
          <td>
            <input type="text" class="middle" placeholder="출금 계좌번호" name="withdrawAccount">
          </td>
        </tr>
        <tr>
          <td>
            <input type="text" class="middle" placeholder="입금 계좌번호" name="DepositAccount">
          </td>
        </tr>
      </table>
      <div class="button-group">
        <button class="gbtn normal">이체</button>
      </div>
    </form>
  </div>
  </div>
</body>

</html>