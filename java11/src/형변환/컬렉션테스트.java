package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		list.add(0, 'q');
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.set(0, "정길동");
		System.out.println(list);
	}
}
