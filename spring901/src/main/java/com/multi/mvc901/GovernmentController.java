package com.multi.mvc901;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GovernmentController {

	@Autowired // @autowired + 전역변수로 써야 싱글톤 불러오기 가능
	GovernmentDAO dao;

	@RequestMapping("insert")
	public void insert(GovernmentVO bag/* , GovernmentDao dao */) { // 여기에 쓰면 싱글톤x
		// 메소드 파라메터로 변수를 선언하면 컨트롤로 내의 메서드에서는
		// bag을 만들어서
		// 클라이언트로부터 전달된 데이터를 받아서
		// bag에 넣어줌
		System.out.println("insert 요청됨");
		System.out.println(bag);
		System.out.println(dao);

		// GovernmentDao dao = new GovernmentDao(); 자동
		dao.insert(bag);

	}

	@RequestMapping("update")
	public void update(GovernmentVO bag/* , GovernmentDao dao */) {
		System.out.println("update 요청됨");
		System.out.println(bag);

		dao.update(bag);
	}

	@RequestMapping("delete")
	public void delete(String id/* , GovernmentDao dao */) {
		System.out.println("delete 요청됨");

		dao.delete(id);
	}

	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		GovernmentVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}

//	@RequestMapping("login")
//	public String login(GovernmentVO bag, HttpSession session) {
//		System.out.println("login 요청됨");
//
//		int result = dao.login(bag); // 1,0
//
//		if (result == 1) {
//			// 로그인 성공시 세션설정
//			session.setAttribute("id", bag.getId());
//			return "ok";// views아래 파일이름.jsp를 호출
//		} else {
//			// views가 아니라 webapp아래 Government.jsp로 가고 싶은 경우 redirect:
//			return "redirect:Government.jsp";
//		}
//	}

	@RequestMapping("list")
	public void list(Model model) {
		List<GovernmentVO> list = dao.list();
		System.out.println("list요청됨.");
		model.addAttribute("list",list);

	}

}
