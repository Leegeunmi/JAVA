<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%! 
	private static final String DEFAULT_NAME = "geunmi";
	public void jspInit(){
		
	}
%>
<!-- html이 doGet메소드 안에 있기때문에 밖에있는 변수가 필요할 때 JSP에서는 이렇게 가지고온다. -->
<!-- doGet은 서비스메서드이다. 서비스메서드를 오버라이딩 하는 것이 JSP인데 JSP는 오버라이딩 안된다 했으니
JSP자신이 서비스 메서드이다. 서비스메서드는 그 자체가 서비스메서드이다. -->

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- JSP 주석 방법 --%>
<%
	String name = request.getParameter("userName");//jsp에서는 servlet에서 자주 쓰이는 것을 내장객체로, 변수로 담아둔다. (out도 내장객체)
	if(name == null || name.length() == 0) {
		name = DEFAULT_NAME;
	}
%>
<h3>Hello, <%=name %></h3> <!-- out.println() -->
</body>
</html>

<!-- JSP는 html안에서 java코드를 쓸 수 있도록 한다. -->
<!-- 디자이너가 JSP를 할때 java코드를 없애야하는데 기능이 없어지지는 않고 코드를 없애고 태그를 남긴다. -->
<!-- JSP에서는 프리젠테이션  Servlet은 비지니스로직  분담 =>  Model2 아키텍쳐
spring으로 가면 Servlet이 사라진다. java만 남는다. => java bins모델 - getter setter -->

<!-- http://localhost:8080/jv301/mod005/hello.jsp?userName=shasha -->