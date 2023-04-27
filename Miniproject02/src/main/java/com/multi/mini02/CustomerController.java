package com.multi.mini02;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@Autowired
	CustomerDAO dao;

	@RequestMapping("insert")
	public void insert(CustomerVO bag, Model model) {
		System.out.println("insert 요청됨");
		dao.insert(bag);
		model.addAttribute("bag", bag);
	}

	@RequestMapping("update")
	public String update(CustomerVO bag, String pw1) {
		System.out.println("update 요청됨");
		if (bag.getPw().equals(pw1)) {
			dao.update(bag);
			return "updateOK";
		} else {
			return "updateFail";
		}
	}

	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete 요청됨");
		dao.delete(id);
	}

	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		CustomerVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}

	@RequestMapping("login")
	public String login(String id, String pw, HttpSession session) {
		System.out.println("login 요청됨");

		CustomerVO bag = dao.one(id);
		String pw2 = bag.getPw();
		System.out.println(pw2);

		if (pw.equals(pw2)) {
			// 로그인 성공시 세션설정
			session.setAttribute("id", bag.getId());
			return "redirect:Customer.jsp";
		} else {
			session.setAttribute("pwcheck", "0");
			return "redirect:Customer.jsp";
		}
	}

	@RequestMapping("list")
	public void list(Model model) {
		List<CustomerVO> list = dao.list();
		System.out.println("list요청됨.");
		model.addAttribute("list", list);

	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("id");
		session.setAttribute("pwcheck", "1");
		return "redirect:Customer.jsp";
	}

}
