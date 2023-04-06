package com.multi.mvc00;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired // @autowired + 전역변수로 써야 싱글톤 불러오기 가능
	MemberDao dao;

	@RequestMapping("insert")
	public void insert(MemberVO bag/* , MemberDao dao */) { // 여기에 쓰면 싱글톤x
		// 메소드 파라메터로 변수를 선언하면 컨트롤로 내의 메서드에서는
		// bag을 만들어서
		// 클라이언트로부터 전달된 데이터를 받아서
		// bag에 넣어줌
		System.out.println("insert 요청됨");
		System.out.println(bag);
		System.out.println(dao);

		// MemberDao dao = new MemberDao(); 자동
		dao.insert(bag);

	}

	@RequestMapping("update")
	public void update(MemberVO bag/* , MemberDao dao */) {
		System.out.println("update 요청됨");
		System.out.println(bag);

		dao.update(bag);
	}

	@RequestMapping("delete")
	public void delete(MemberVO bag/* , MemberDao dao */) {
		System.out.println("delete 요청됨");

		dao.delete(bag);
	}

	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		// views/one.jsp에서 사용 가능 하도록 model을 통해 설정
		model.addAttribute("bag", bag);
	}

	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session) {
		System.out.println("login 요청됨");

		int result = dao.login(bag); // 1,0

		if (result == 1) {
			// 로그인 성공시 세션설정
			session.setAttribute("id", bag.getId());
			return "ok";// views아래 파일이름.jsp를 호출
		} else {
			// views가 아니라 webapp아래 member.jsp로 가고 싶은 경우 redirect:
			return "redirect:member.jsp";
		}
	}

	@RequestMapping("list")
	public void list(Model model) {
		System.out.println("list요청됨.");
		ArrayList<MemberVO> list = dao.list();
		model.addAttribute("list", list);

	}

}
