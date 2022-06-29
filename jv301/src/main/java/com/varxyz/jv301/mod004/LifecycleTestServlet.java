package com.varxyz.jv301.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifecycleTestServlet extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("int() method called");
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		System.out.println("service() method called");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>Servlet Lifecycle Test</h3>");
		out.println("</body></html>");
		out.close();
	}
	
	@Override
	public void destroy() {
		System.out.println("destory() method called.");
	}
}
