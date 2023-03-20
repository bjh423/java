package multi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/welcome2" })
public class Hi extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()메서드 호출, 내용 실행");
		String id = request.getParameter("id");
		System.out.println("받은 id데이터 : " + id);

		String pw = request.getParameter("pw");
		System.out.println("받은 pw데이터 : " + pw);
	}

}