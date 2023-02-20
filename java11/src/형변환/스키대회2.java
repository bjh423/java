package 형변환;

import java.util.ArrayList;

public class 스키대회2 {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add("박스키");
		x.add("송스키");
		x.add("김스키");
		x.add("정스키");
		System.out.println(x);
		x.remove(1);
		System.out.println(x);
		for (int i = 0; i < x.size(); i++) {
			System.out.println((i+1) +"등 : " + x.get(i));	
		}
		System.out.println(x.contains("김연아"));
		System.out.println(x.size());
		
		ArrayList x2 = new ArrayList();
		x2.add("이스키");
		x2.add("박스키");
		x2.add("양스키");
		x2.addAll(x);
		System.out.println(x);
		
		System.out.println(x2);
		System.out.println(x2.isEmpty());
		x2.clear();
		System.out.println(x2.isEmpty());
		System.out.println(x2);
		
	}
}
