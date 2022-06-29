package com.varxyz.jv301.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{ //servlet -> server + let 작은 서버
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) //request-요청  response-응답   / 요청정보를 클래스화한다.
			throws ServletException, IOException {
		String pageTitle = "Hello World!!";
		response.setContentType("text/html; charset=UTF-8"); //platform-independent / polymorpysm
		//뭐가 들어와있는지 모른다. interFace기 때문에 톰캣이 알아서 한다. 이런식으로 interface가 증가한다.
		PrintWriter out = response.getWriter(); //printWriter는 writer의 자식 중 하나, 문자 출력시에는 reader와 writer사용
		out.println("<html>");
		out.println("<head><title>"+ pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3>Welcome to 서블릿 프로그램</h3>");
		out.println("</body></html>"); //프리젠테이션 로직
		//많은 개발자들이 JSP를 사용 _ 모든 것을 JSP로 하는것 -model1
		//현재는 medel2아키텍쳐_ 나누어서 함 -->  서블릿- 비지니스로직  JSP- 프리젠테이션로직 담당
		//model2아키텍쳐기반으로 공부필요
		
	}
	
}
