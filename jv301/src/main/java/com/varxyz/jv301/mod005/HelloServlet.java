package com.varxyz.jv301.mod005;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet2", urlPatterns = {"/mod005/hello.view"})
public class HelloServlet extends HttpServlet{ //servlet -> server + let 작은 서버
	private static final String DEFAULT_NAME = "world";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) //request-요청  response-응답   / 요청정보를 클래스화한다.
			throws ServletException, IOException {
		String pageTitle = "Hello World!!";
		String name = request.getParameter("userName");
		if(name == null || name.length() == 0) {
			name = DEFAULT_NAME;
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>"+ pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3>Welcome to 서블릿 프로그램</h3>");
		out.println("</body></html>");
	}
}
