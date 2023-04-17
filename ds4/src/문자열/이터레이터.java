package 문자열;

import java.util.*;

public class 이터레이터 {

	public static void main(String[] args) {
		
		HashSet<String> bag = new HashSet<String>();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("볼펜");
		System.out.println(bag);
		
		Iterator<String> it = bag.iterator();
		System.out.println(it.hasNext()); //유무체크
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		
	}
}