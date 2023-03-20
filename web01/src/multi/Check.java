package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")

public class Check extends HttpServlet {
	
	
	@Override
	public void init() throws ServletException{
		System.out.println("check 서블릿 객체 생성");
	}
	
	@Override
	public void destroy() {
		System.out.println("check 서블릿 소멸");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); //주는 방식
		PrintWriter out = response.getWriter();
		
		String tmp = request.getParameter("today");
		
		switch (tmp) {
		case "맑음":
			out.print("나가자");
			break;
		case "흐림":
			out.print("코딩");
			break;
		case "비옴":
			out.print("쇼핑");
			break;
		default :
			out.print("그냥 있자");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //받는 방식
		response.setContentType("text/html;charset=UTF-8"); //주는 방식
		
		PrintWriter out = response.getWriter();
		String tmp = request.getParameter("pass");
		
		if (tmp.equals("나는왕이다")) {
			out.print("들어오세요");
		}else {
			out.print("들어올수없습니다.<img src='no.png'>");
		}
	}

}
