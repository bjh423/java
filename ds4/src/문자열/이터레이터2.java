package 문자열;

import java.util.*;

public class 이터레이터2 {

	public static void main(String[] args) {
		HashSet<Integer> bag = new HashSet<Integer>();
		bag.add(1000);
		bag.add(2000);
		bag.add(3000);
		bag.add(2000);
		bag.add(4000);
		bag.add(3000);
		bag.add(3000);
		System.out.println(bag);

		Iterator<Integer> it = bag.iterator();
		for (int i = 0; i < bag.size(); i++) {
			System.out.println(it.next());
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Object[] list = bag.toArray();
		for (Object x : list) {
			System.out.println(x);
		}
		
		
	}

}