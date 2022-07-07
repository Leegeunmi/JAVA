package com.varxyz.jv301.mod010;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/mod010/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//getSession(false): HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 session생성 하지않고 null반환
		HttpSession session = request.getSession(false);
		session.invalidate();//세션 무효화
		response.sendRedirect("login"); //mypage에 하이퍼링크 <a href=""></a>
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);//post로 들어오면 에러가 날 수 있으니 doGet으로 가게 함?
	}
}
