package com.varxyz.jv301.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Multiplication extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String pageTitle = "구구단 출력";
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>"+ pageTitle + "</title></head>");
		out.println("<body><table><tr>");
		for (int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				out.println("<td>"+j+"x"+ i +"=" + j*i+"&emsp;</td>");
				if(j == 9) {
					out.println("</tr>");
				}
			}
		}
		out.println("</table></body>");
		out.println("</html>");
		
		out.close();
	}
}
