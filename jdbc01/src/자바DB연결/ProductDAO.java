package 자바DB연결;

import 화면DB연결.ProductVO;

public class ProductDAO {
	public void insert(ProductVO bag) {
		System.out.println("아이디 : " + bag.getId());
		System.out.println("이름 : " + bag.getName());
		System.out.println("내용 : " + bag.getContent());
	}

}
