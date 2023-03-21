package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/monday.do")
public class Monday extends HttpServlet {
	String temp = "";
	
	public void init(ServletConfig config) throws ServletException {
		temp = config.getInitParameter("temp");
		System.out.println(temp);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("오늘은 월요일 날씨는 " + temp);
		out.close();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
/*
 * jsp와 서블릿 관계 : jsp가 서블릿으로 변환되어 처리
 * jsp가 서블릿으로 변환되는 순간은? : jsp 최초 호출시 
 * jsp에서 서블릿으로 변환되어 실행되는 단계 그림 : jsp -> 서블릿(java) -> class -> 서비스
 * 서블릿의 생명주기 : init -> service() -> doget/dopost -> destroy
 * 서블릿 등록 방법 2가지 : @, xml에 직접 등록
 * 서블릿 등록하는 xml파일 이름/파일위치 : web.xml , /web-inf/web.xml
 * 어노테이션이란? : @, 표시
 * 서블릿을 만든다는 의미 중 스레드 설명 : 동시처리
 * 서블릿을 만든다는 의미 중 싱글톤 설명 : 객체를 하나만 만들어서 사용
 * 서블릿을 만든다는 의미 중 tcp 전송 설명 : 승인된 전송
 * http통신이 가능한 자바 프로그램/기술 : 서블릿
 * 
 * */

