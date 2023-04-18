package 컬렉션2;

import java.util.HashMap;

public class 문자열내개수동일 {

	public static void main(String[] args) {
		boolean answer = false;
		String s= "PyPPPyppypyPYYPypyp";
		String s2 = s.toLowerCase();
		String[] s3 = s2.split("");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String x : s3) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		System.out.println(map);
		if (map.get("p")==map.get("y")) {
			answer = true;
		}else {
			answer = false;
		}
	}

}
