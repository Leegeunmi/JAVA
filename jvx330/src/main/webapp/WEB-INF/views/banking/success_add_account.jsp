<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 자동으로 나올 수 있게 하는방법 찾기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success_add_account</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<div id="addAcount_wrap">
      <div class="title">
        <h1>신규 계좌개설 완료</h1>
      </div>
      <form action="success_add_account" method="post">
        <p class="newAccountNum">신규 계좌 : 000-00-0000</P>
        <div class="table_wrap">
	        <table class="table_a b">
	         <tr>
	            <td>
	              <p class="myAccountNum"><strong>내 계좌</strong></p>
	            </td>
	          </tr>
	          <tr>
	            <td>
	              <p>입출금 계좌 : 000-00-0000</p>
	            </td>
	          </tr>
	          <tr>
	            <td>
	              <p>입출금 계좌 : 111-11-1111</p>
	            </td>
	          </tr>
	          <tr>
	            <td>
	              <p>입출금 계좌 : 222-22-2222</p>
	            </td>
	          </tr>
	        </table>
        </div>
        <div class="button-group">
          <button class="gbtn normal">이체하기</button>
        </div>
      </form>
    </div>

</body>

</html>