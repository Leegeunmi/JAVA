package com.varxyz.jv301.mod010;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/mod010/mypage")
public class MypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserService userService;
	
	public void init() {
		userService = new UserService(); //userService에서 UserDao()를 생성? 
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		String userId = (String)session.getAttribute("userId");//세선이 있든없든 세션을 만들고 어디선가 setAttribute해야한다.
		if(userId == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);//id에 값이 없으면 login.jsp로
			return;
		}		
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ":" + cookie.getValue());//브라우저에서 아이디 비번을 치고 들어가면 콘솔에 JSESSIONID:E2DB15B0A79D799D8FAC28D9F3D3C38D 찍힌다.
			if(cookie.getName().equals("lastAccessTime")) {
				request.setAttribute("lastAccessTime", //jsp에 값을 찍어서 최근 방문을 알 수 있게한다.
						URLEncoder.encode(cookie.getValue(), "UTF-8"));
			}
		}
		response.addCookie(lastAccessTime());
		
		request.getRequestDispatcher("mypage.jsp").forward(request, response);
	}
	
	private Cookie lastAccessTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String dateStr = format.format(new Date());//util date로 받기 / 쿠키는 문자열만 되니까 Date를 String으로
		
		Cookie cookie = null;
		try {//인코딩을 해야하므로 try catch필요
			cookie = new Cookie("lastAccessTime",
					URLEncoder.encode(dateStr, "UTF-8"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		cookie.setMaxAge(60 * 60 * 24 * 30);
		cookie.setPath("/");//쿠키를 어디에서 들어 왔을 때 가지고 올것인가 --> /밑으로는 들어온다.(사이트전체에 쿠키를 심겠다.)
		
		return cookie;
	}
}

