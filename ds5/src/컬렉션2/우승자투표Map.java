package 컬렉션2;

import java.util.HashMap;

public class 우승자투표Map {

	public static void main(String[] args) {
		String[] all = {"a","b","c","c","b","c"};
		String[] find = {"a","b","c"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String x : find) {
			map.put(x, 0);
		}
		
		for (String x : all) {
			map.put(x, map.get(x)+1);
		}
		
		System.out.println(map);

		int max = 0;
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
			if (map.get(key)>max) {
				max=map.get(key);
				System.out.println("현재까지 우승자 : " + key);
			}
		}
		
	}

}
