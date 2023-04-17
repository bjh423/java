package 문자열;

import java.util.*;

public class 해쉬셋 {

	public static void main(String[] args) {
		String x = "asgbaadfadg";
		
		HashSet<String> set = new HashSet<String>();
		String[] xx = x.split("");
		System.out.println(Arrays.toString(xx));
		
		for (String i : xx) {
			set.add(i);
		}
		
		System.out.println(set);
		
		Object[] set2 = set.toArray(); //set2 : 항목 목록
		List<String> list = Arrays.asList(xx); //collections를 이용하기 위해 list화
		
		String answer = "";
		for (Object q : set2) {
			if (Collections.frequency(list, q) == 1) {
				answer += q;
			}
		}
		
		
		System.out.println(answer);
		
	}
}