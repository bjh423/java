package com.multi.mvc00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@Autowired
	BookDao dao;
	
	@RequestMapping("insert3.multi")
	public void insert(BookDTO bag) {
		System.out.println("insert 요청");
		
		dao.insert(bag);
	}
	
	@RequestMapping("one3.multi")
	public void one(int id, Model model) {
		BookDTO dto = dao.one(id);
		//views까지 처리결과인 dto를 전달해주는 역할
		model.addAttribute("bag", dto);
	}

}
