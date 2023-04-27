package com.multi.mongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoController {

	@Autowired
	MemoDAO dao;
	
	@RequestMapping("list.memo")
	public void list(Model model) {
		//dao의 list() 호출 후 결과 받아오기, 이후 model속성으로 지적해서 views로 전송
		List<MemoVO> list = dao.list();
		model.addAttribute("list",list);
	}
}
