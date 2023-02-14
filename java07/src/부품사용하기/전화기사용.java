package 부품사용하기;

import 부품만들기.전화기;

public class 전화기사용 {
	public static void name(String[] args) {
		전화기 p1 = new 전화기();
		p1.price = 1000;
		p1.shape = "folder";
		p1.인터넷하다();
		System.out.println("p1의 가격 + " + p1.price);
		System.out.println("p1의 모양 + " + p1.shape);

		전화기 p2 = new 전화기();
		p1.price = 2000;
		p1.shape = "square";
		p1.카톡하다();
		System.out.println("p2의 가격 + " + p1.price);
		System.out.println("p2의 모양 + " + p1.shape);

		전화기 p3 = new 전화기();
	}
}
