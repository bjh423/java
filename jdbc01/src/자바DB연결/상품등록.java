package 자바DB연결;

import java.util.Scanner;

import 화면DB연결.ProductVO;

public class 상품등록 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("id/name/content순으로 입력하세요.");
		
		String id = sc.next();
		String name = sc.next();
		String content = sc.next();
		
		ProductVO bag = new ProductVO();
		
		bag.setId(id);
		bag.setName(name);
		bag.setContent(content);
		
		ProductDAO dao = new ProductDAO();
		dao.insert(bag);
	}

}