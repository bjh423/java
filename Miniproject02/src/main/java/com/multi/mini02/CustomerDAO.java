package com.multi.mini02;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	CustomerVO bag = new CustomerVO();

	public int insert(CustomerVO bag) { //회원가입
		int result = my.insert("customer.create", bag);
		return result;
	}

	public int delete(String id) {
		int result = my.delete("customer.del", id);
		return result;
	}

	public int update(CustomerVO bag) {
		int result = my.update("customer.up", bag);
		return result;
	}

	public CustomerVO one(String id) {
		bag = my.selectOne("customer.one", id);
		return bag;
	}

	public String login(CustomerVO bag) {
		CustomerVO bag2 = my.selectOne("customer.login", bag.getId());
		return bag2.getPw();
	}

	public List<CustomerVO> list() {
		List<CustomerVO> list = my.selectList("customer.all");
		System.out.println(list.size());
		return list;
	}
	
}
