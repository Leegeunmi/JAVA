<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String l = (String)request.getAttribute("IDError"); 
	String passwd = (String)request.getAttribute("passwd");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= l %>
</body>
</html>