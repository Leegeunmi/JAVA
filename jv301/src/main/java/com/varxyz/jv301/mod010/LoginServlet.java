package com.varxyz.jv301.mod010;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/mod010/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	public void init() {
		userService = new UserService();
	} //service() : 브라우저의 요청(doGet(),doPost())을 처리하도록 하는 메서드
	
	
	//doGet/doPost는 매개객체로 HttpServletRequest라는 요청 객체와 HttpServletResponse라는 응답 객체를 받는다.
	//doGet: get방식에서 호출되는 메서드, URL에 정보가 포함되어 보안에 약함. 기본 호출 메서드.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);//두 객체는 해당주소에 대해 요청하고 응답하라
		//RequestDispatcher객체는 다른 페이지로 이동하는 forward()또는 include()메소드를 가지고 있는 객체
		//이 객체는 new연산자 생성아니고 메소드로 생성한다. ->getRequestDispatcher()
	}
	
	//로그인 처리
	//doPost: post방식에서 호출되는 메서드, URL에 정보가 포함되지 않아 보안에 강하며, 헤더에 정보를 실음.
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId"); //(login.jsp에서)사용자가 입력한 userId를 확인
		String passwd = request.getParameter("passwd");
		
		//요청 파라메타 검증
		if(!userService.isValidUser(userId, passwd)) {//입력한 아이디와 비밀번호가 유효하면? 안하면?
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		
		//getSession(true): HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 session생성
		HttpSession session = request.getSession(true);
		session.setAttribute("userId",userId);
		response.sendRedirect("mypage");//MypageServlet
		//redirect: 웹서버가 웹브라우저에게 다른 페이지로 이동하라고 응답하는 기능
		//sendRedirect(): 서버가 이동경로를 결정한다.
	}
}
