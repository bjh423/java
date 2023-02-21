package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {

		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add("남");

		System.out.println(me);
		System.out.println((int) me.get(0) + 2000);
		System.out.println((double) me.get(1) + 10);
		
		boolean x = (boolean) me.get(2);
		if (x == true) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		String gen = (String) me.get(3);
		if (gen.equals("남")) {
			System.out.println("주민번호 1,3");
		} else {
			System.out.println("주민번호 2,4");
		}
	}

}
