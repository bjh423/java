package com.multi.mvc00;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

	@RequestMapping("food")
	public String food(FoodVO f) {
		String like = f.getLike();
		String dislike = f.getDislike();

		if (like.equals("라면")) {
			return "like";
		} else if (dislike.equals("커피")) {
			return "dislike";
		} else {
			return "redirect:food.jsp";
		}

	}
}