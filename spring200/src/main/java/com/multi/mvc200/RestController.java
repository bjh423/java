package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping("json1")
	@ResponseBody // 요청시, return되는 데이터를 json화
	public MemberVO json1() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag;
	}

	@RequestMapping("json2")
	@ResponseBody // 요청시, return되는 데이터를 json화
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		MemberVO bag2 = new MemberVO();
		bag2.setId("root2");
		bag2.setPw("12342");
		bag2.setName("hong2");
		bag2.setTel("0112");

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);

		return list;
	}

	@RequestMapping("json3")
	@ResponseBody // 요청시, return되는 데이터를 json화
	public BbsVO json3() {
		BbsVO bag = new BbsVO();
		bag.setNo(100);
		bag.setTitle("title");
		bag.setContent("content");
		bag.setWriter("writer");
		return bag;
	}

	@RequestMapping("json4")
	@ResponseBody // 요청시, return되는 데이터를 json화
	public ArrayList<BbsVO> json4() {
		BbsVO bag = new BbsVO();
		bag.setNo(100);
		bag.setTitle("title");
		bag.setContent("content");
		bag.setWriter("writer");
		BbsVO bag2 = new BbsVO();
		bag2.setNo(101);
		bag2.setTitle("title1");
		bag2.setContent("content1");
		bag2.setWriter("writer1");

		ArrayList<BbsVO> list = new ArrayList<BbsVO>();

		list.add(bag);
		list.add(bag2);

		return list;
	}

	@RequestMapping("jsonResponse3")
	@ResponseBody
	public MemberVO jsonResponse3() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag;
	}

	@RequestMapping("jsonResponse4")
	@ResponseBody
	public MemberVO jsonResponse4() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag;
	}

	@RequestMapping("jsonResponse5")
	@ResponseBody
	public MemberVO jsonResponse5() {
		MemberVO bag = new MemberVO();
		bag.setId("코엑스");
		bag.setPw("37.5116828");
		bag.setName("127.059151");
		return bag;
	}

	@RequestMapping("jsonResponse6")
	@ResponseBody
	public QwerVO jsonResponse6() {
		QwerVO bag = new QwerVO();
		bag.setQ1(20);
		bag.setQ2(30);
		bag.setQ3(50);
		bag.setQ4(100);
		return bag;
	}
}
