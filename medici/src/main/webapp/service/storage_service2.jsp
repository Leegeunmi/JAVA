<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <title>스토리지</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
  <link rel="stylesheet" href="../design/css_default/normalize.css">
  <link rel="stylesheet" href="../design/css_default/default.css">
  <link rel="stylesheet" href="../design/css_default/header.css">
  <link rel="stylesheet" href="../design/css_for_storage/style.css">
</head>

<body>
  <div id="wrap">
    <header id="header">
      <div class="inner">
        <!-- 로고 -->
        <h1 id="top-logo">
          <a href="index.html">ARANG</a>
        </h1>
        <!-- 메인메뉴 -->
        <nav id="top-nav">
          <ul class="center_menu">
            <li><a href="./artists/all.html">Artists</a></li>
            <li><a href="./gallerys/gallerys.html">Gallerys</a></li>
            <li><a href="./exhibitions/exhibitions.html">Exhibitions</a></li>
            <li><a href="./storage/storage.html">Storage</a></li>
            <li><a href="./notice/notice.html">Notice</a></li>
          </ul>
          <ul class="side_menu">
            <li><a href="./find/find.html"><img src="../design/img/icon/find.png" alt="find"></a></li>
            <li><a href="./mypage/mypage.html"><img src="../design/img/icon/mypage.png" alt="mypage"></a></li>
            <li><a href="./like/like.html"><img src="../design/img/icon/like.png" alt="like"></a></li>
            <li><a href="./cart/cart.html"><img src="../design/img/icon/cart.png" alt="cart"></a></li>
          </ul>
        </nav>
      </div>
    </header>
    <div id="storage_service_wrap">
      <div class="title">
        <h1>작품 보관 서비스 신청</h1>
      </div>
      <form>
        <table class="table_a">
          <tr>
            <td>
              <input type="text" class="middle" placeholder="작품코드">
            </td>
          </tr>
          <tr>
            <td>
              <select>
                <option value="">원하는 보관소 지역</option>
                <option value="">서울/경기</option>
                <option value="">대전</option>
                <option value="">광주</option>
                <option value="">대구</option>
                <option value="">부산</option>
                <option value="">울산</option>
                <option value="">강원</option>
                <option value="">충청</option>
                <option value="">경상</option>
                <option value="">전라</option>
                <option value="">제주</option>
              </select>
            </td>
          </tr>
          <tr>
            <td class="date_td">
              <p>보관시작</p>
              <p>보관종료</p>
              <input type="date">
              <input type="date">
            </td>
          </tr>
          <tr>
            <td>
              <select>
                  <option value="">배송서비스</option>
                  <option value="">No</option>
                  <option value="">Yes</option>
              </select>
            </td>
          </tr>
        </table>
        <div class="button-group">
          <button class="gbtn normal">신청</button>
          <button class="gbtn normal gray">취소</button>
        </div>
      </form>
    </div>
  </div>
</body>

</html>