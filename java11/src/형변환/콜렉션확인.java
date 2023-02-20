package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 콜렉션확인 {

	public static void main(String[] args) {
		
		//1. 중복 여행지 x = set, 5개 컬렉션으로 만들어서 프린트
		
		HashSet a = new HashSet();
		a.add("침대");
		a.add("이불속");
		a.add("전기장판 위");
		a.add("집");
		a.add("졸리다");
		System.out.println(a);
		
		//2.안방tv 거실쇼파 부엌냉장고 현관신발
		HashMap b = new HashMap();
		b.put("안방", "TV");
		b.put("거실", "쇼파");
		b.put("부엌", "냉장고");
		b.put("현관", "신발");
		System.out.println(b);
		System.out.println(b.get("현관"));
		b.replace("거실", "책상");
		System.out.println(b);
		
		//3.오늘내가할일우선순위목록5개
		ArrayList c = new ArrayList();
		c.add("공부1");
		c.add("공부2");
		c.add("공부3");
		c.add("공부4");
		c.add("공부5");
		System.out.println(c);
		System.out.println(c.get(1) + " " + c.get(4));
		c.set(1, "청소");
		System.out.println(c);


	}

}
