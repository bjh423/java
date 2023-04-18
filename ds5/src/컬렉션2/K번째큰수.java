package 컬렉션2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = {1,4,5,8,6,7,5,4,2,7};
		int[] numm = Arrays.copyOfRange(num, 0, 5);
		int k = 2; //2번째 큰 수
		
		Arrays.sort(num);
		HashSet<Integer> set = new HashSet<Integer>();
		for (int x : num) {
			set.add(x);
		}
		System.out.println(set.toString());
		Object[] num2 = set.toArray();
		System.out.println(num2[num2.length-k]);
		
		int[][] xx = {{1,2,3},{1,4,3}};
		System.out.println(xx.length);

	}

}
