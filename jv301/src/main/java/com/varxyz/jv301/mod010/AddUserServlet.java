package com.varxyz.jv301.mod010;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod010/add_user.do")
public class AddUserServlet extends HttpServlet { //controller
	private static final long serialVersionUID = 1L;
	
	private UserService userService = new UserService(null);
	
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
//		1. 폼 파라메터 얻기
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String userName = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		
//		2. 유효성 검증 및 변환
		List<String> errorMsgs = new ArrayList<>();
		if(userId == null || userId.length() == 0) {
			errorMsgs.add("id는 필수입력 정보입니다.");
		}else if(passwd == null || passwd.length() == 0) {
			errorMsgs.add("password는 필수입력 정보입니다.");
		}
		
		RequestDispatcher dispatcher = null;	
		if(errorMsgs.size() > 0) {
			request.setAttribute("IDError", errorMsgs);
			dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		
		User user = new User();
		user.setUserId(userId);
		user.setPasswd(passwd);
		user.setUserName(userName);
		user.setAddr(addr1 + " " + addr2);
		user.setEmail(email1 + "@" + email2);
		
//		3. 비지니스 서비스 호출
		userService.addUser(user);
		
		
//		4. NextPage
		request.setAttribute("userName", userName);
		request.setAttribute("userId", userId);
		request.setAttribute("passwd", passwd);
		dispatcher = request.getRequestDispatcher("success.jsp"); //getRequestDispatcher안에 forward메소드
		dispatcher = request.getRequestDispatcher("error.jsp");
		dispatcher.forward(request, response);
	}
}
