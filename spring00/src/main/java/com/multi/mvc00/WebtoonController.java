package com.multi.mvc00;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebtoonController {

	@Autowired
	WebtoonDao dao;

	@RequestMapping("insert4")
	public void insert(WebtoonVO bag) {
		System.out.println("insert 실행됨");
		dao.insert(bag);
	}

	@RequestMapping("delete4")
	public void delete(String id) {
		System.out.println("delete 실행됨");
		dao.delete(id);
	}

	@RequestMapping("update4")
	public void update(WebtoonVO bag) {
		System.out.println("update 실행됨");
		dao.update(bag);
	}

	@RequestMapping("one4")
	public void one(int id,Model model) {
		System.out.println("one 실행됨");
		WebtoonVO bag = dao.one(id);
		model.addAttribute("bag",bag);
	}

	@RequestMapping("list4")
	public void list(Model model) {
		System.out.println("list 실행됨");
		ArrayList<WebtoonVO> bag = dao.list();
		model.addAttribute("bag", bag);
	}

}
