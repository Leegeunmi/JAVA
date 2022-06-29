package com.varxyz.jv301.mod003;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletConfigTestServlet extends HttpServlet {
	private static final String DFUALT_SEASONS = "Spring, Summer, Fall, Winter";
	private String[] seasons;

//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		String season_list = config.getInitParameter("season-list");
//		if (season_list == null) {
//			season_list = DFUALT_SEASONS;
//		}
//		seasons = season_list.split(", ");
//	}
//	
	@Override //위에 내용 수정
	public void init() throws ServletException {
		String season_list = getInitParameter("season-list");//getInitParamer는 자기에게는 정의되어 있지 않다면? 나에겐 없지만 부모에게 있다. 부모꺼도 내꺼. 부모는 HttpServlet.
		if (season_list == null) {
			season_list = DFUALT_SEASONS;
		}
		seasons = season_list.split(", ");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>ServletConfig Test</h3>");
		out.println("<ul>");
		for (String season : seasons) {
			out.println("<li>" + season + "</li>");
		}
		out.println("</ul>");
		out.println("</body></html>");
		out.close();
	}
}
