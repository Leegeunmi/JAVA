<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.*"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- JSTL을 쓰기위해서 필요 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<jsp:include page="/incl/banner.jsp">
		<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod007 : 자바빈즈\", \"UTF-8\") %>" />
	</jsp:include>
</div>
<div id="content-wrapper">
	<c:if test="${not empty errorMsgs}">
		<h3>다음과 같은 에러가 발생했습니다.</h3>
		<ul>
			<c:forEach var ="errorMsg" items="${errorMsgs }">
				<li>${errorMsg}</li>
			</c:forEach>
			<c:when test=""> <!-- if else와 비슷한 개념 -->
				<c:choose></c:choose> 
				<c:otherwise></c:otherwise>
			</c:when>
		</ul>
	</c:if>
</div>
<div id="footer">
	<%@ include file="/incl/footer.jsp"%>
</div>
</body>
</html>