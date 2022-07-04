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
	<h3>다음과 같은 에러가 발생했습니다.</h3>
	<ul>
	<%	
		@SuppressWarnings("unchecked")
		List<String> errorMsgs = (List<String>)request.getAttribute("errorMsgs");
		for(String errorMsg : errorMsgs){	
	%>
			<li><%=errorMsg%></li> 
	<%
		}
	%>
	${errorMsgs} <!-- 위 for문 내용을 EL(다음코드)로 쓸 수 있다. -->
	</ul>
</div>
</body>
</html>