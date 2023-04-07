package com.multi.mvc500;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDao dao;
	
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
		System.out.println("게시판 insert 처리");
		System.out.println(bag);
		
		dao.insert(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(String no) {
		System.out.println("게시판 delete 처리");
		System.out.println(no);
		
		dao.delete(Integer.parseInt(no));
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {
		System.out.println("게시판 update 처리");
		System.out.println(bag);
		
		dao.update(bag);
	}
	
	@RequestMapping("one2.multi")
	public void one(String no,Model model) {
		System.out.println("게시판 one 처리");
		System.out.println("검색할 게시글 번호 : " + no);
		
		dao.one(Integer.parseInt(no));
	}
	
//	@RequestMapping("list2.multi")
//	public void list(Model model) {
//		System.out.println("게시판 list 처리");
//		ArrayList<BbsVO> list = dao.list();
//		model.addAttribute("list",list);
//	}

}
