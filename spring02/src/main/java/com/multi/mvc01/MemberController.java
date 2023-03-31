package com.multi.mvc01;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session) {
		session.setAttribute("id", bag.getId());
		
		return "redirect:main.jsp";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.setAttribute("id",null);
		
		return "redirect:main.jsp";
	}


}
