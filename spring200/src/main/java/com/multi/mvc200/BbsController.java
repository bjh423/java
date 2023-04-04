package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록!
public class BbsController {

	@Autowired
	BbsDAO dao;

	@Autowired
	ReplyDAO dao2;

	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag, BbsDAO dao) {
		System.out.println("insert요청됨.");
		System.out.println(bag);

		// dao에게 insert요청!!
		dao.insert(bag);
	}

	@RequestMapping("update2.multi")
	public void update(BbsVO bag, BbsDAO dao) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}

	@RequestMapping("delete2.multi")
	public void delete(int no, BbsDAO dao) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}

	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		// 검색결과가 있는지 프린트!
		System.out.println(bag);
		ArrayList<ReplyVO>list =  dao2.list(no);
		model.addAttribute("bag", bag);
		model.addAttribute("list", list);
	}

	@RequestMapping("list2")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); // 사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); // 사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list8")
	public void list8(int bbsno, Model model) {
		BbsVO one = dao.one(bbsno);
		System.out.println(one); // 사이즈를 찍어보세요.
		model.addAttribute("one", one);
	}
	
	@RequestMapping("list9")
	public void list9(Model model) {
		ArrayList<MemberVO> list = dao.listM();
		System.out.println(list); // 사이즈를 찍어보세요.
		model.addAttribute("bag", list);
	}
	
	@RequestMapping("bbsupdate")
	public void bbsUpdate(BbsVO bag) {
		System.out.println("update 요청됨");
		dao.update(bag);
	}
	
	@RequestMapping("bbsdelete")
	public String bbsDelete(int no) {
		System.out.println("delete 요청됨");
		dao.delete(no);
		return "redirect:/ajax_test.jsp";
	}


}
