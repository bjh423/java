package com.multi.mvc00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired //@autowired + 전역변수로 써야 싱글톤 불러오기 가능
	MemberDao dao;
	
	@RequestMapping("insert")
	public void insert(MemberVO bag/*, MemberDao dao*/) { //여기에 쓰면 싱글톤x
		//메소드 파라메터로 변수를 선언하면 컨트롤로 내의 메서드에서는
		//bag을 만들어서
		//클라이언트로부터 전달된 데이터를 받아서
		//bag에 넣어줌
		System.out.println("insert 요청됨");
		System.out.println(bag);
		System.out.println(dao);
		
		//MemberDao dao = new MemberDao(); 자동
		dao.insert(bag);
		
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag/*, MemberDao dao*/) {
		System.out.println("update 요청됨");
		System.out.println(bag);

		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(MemberVO bag/*, MemberDao dao*/) {
		System.out.println("delete 요청됨");
		
		dao.delete(bag);
	}
	
	@RequestMapping("one")
	public void one(String id/*, MemberDao dao*/) {
		System.out.println("one 요청됨");
		
		dao.one(id);
	}
	
	@RequestMapping("list")
	public void list() {}

}
