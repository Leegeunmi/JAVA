package com.varxyz.jv301.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod004/hello.do")
public class FormBasedHelloServlet extends HttpServlet {
	private static final long seialVersionUID = 1L;
	private static final String DEFAULT_NAME = "World";
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("userName");
		if(name == null || name.length() == 0) {
			name = DEFAULT_NAME;
		}
	
	
	String pagetitle = "Hello World";
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<head><title>" + pagetitle + "</title></head>");
	out.println("<body>");
	out.println("<h3>안녕하세요"+ name +"</h3>");
	
	out.println("</body></html>");
	out.close();
	}
}
