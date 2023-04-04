package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록!
public class RelpyController {

	@Autowired
	ReplyDAO dao;

	@RequestMapping("insert4")
	public void insert(ReplyVO vo) {
		System.out.println(vo);
		dao.insert(vo);
	}

	@RequestMapping("list6")
	public void list6(int bbsno, Model model) {
		System.out.println(bbsno);
		ArrayList<ReplyVO> list = dao.list(bbsno);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list7")
	public void list6(String memid, Model model) {
		System.out.println(memid);
		ArrayList<MemberVO> list = dao.list2(memid);
		model.addAttribute("list", list);
	}


}
