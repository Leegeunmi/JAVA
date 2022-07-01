package com.varxyz.jv301.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod004/add_user.do")
public class AddUserServlet extends HttpServlet {
	private static final long seialVersionUID = 1L;
	private static final String DEFAULT_ID = "";
	private static final String DEFAULT_PASSWD = "";
	private static final String DEFAULT_PASSWDCHECK = "";
	private static final String DEFAULT_NAME = "";
	private static final String DEFAULT_SSN = "";
	private static final String DEFAULT_EMAIL = "";
	private static final String DEFAULT_CONNERNS = "";
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String passwdCheck = request.getParameter("passwdCheck");
		String name = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		
		if(id == null || id.length() == 0) {
			id = DEFAULT_ID;
		}
		if(passwd == null || passwd.length() == 0) {
			passwd = DEFAULT_PASSWD;
		}
		if(passwdCheck == null || passwdCheck.length() == 0 && passwdCheck != passwd ) {
			passwdCheck = DEFAULT_PASSWD;
		}
		if(name == null || name.length() == 0) {
			name = DEFAULT_NAME;
		}
		if(ssn == null || ssn.length() == 0) {
			ssn = DEFAULT_SSN;
		}
		if(email1 == null || email1.length() == 0) {
			email1 = DEFAULT_EMAIL;
		}
		String[] concerns = request.getParameterValues("concerns");
	
	
	String pagetitle = "Add User";
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<head><title>" + pagetitle + "</title></head>");
	out.println("<body>");
	out.println("<h3>회원가입 완료! \""+ name +"\"님 환영합니다!</h3>");
	out.println("ID : " + id + "<br>");
	out.println("PW : " + passwd + "<br>");
	out.println("NAME : " + name + "<br>");
	out.println("SSN : " + ssn + "<br>");
	out.println("E-MAIL : " + email1 + "@" + email2 + "<br>");
	out.println("CONCERNS : ");
	for (String concern : concerns) {
		out.println(concern);
	}
	out.println("</body></html>");
	out.close();
	}
}