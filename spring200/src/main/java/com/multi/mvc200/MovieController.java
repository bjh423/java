package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public void movie(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo", vo);
	}

	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("포도");
		list.add("배");
		list.add("사과");
		model.addAttribute("list", list);
	}

	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("여행지1");
		list.add("여행지2");
		list.add("여행지3");
		list.add("여행지4");
		model.addAttribute("list", list);
	}
}
