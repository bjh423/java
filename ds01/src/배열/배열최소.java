package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최소 {

	public static void main(String[] args) {
		int min = 999;
		int max = 0;
		Random r = new Random(100);
		int[] x = new int[10];
		int[] x2 = new int[10];
		for (int i = 0; i < 10; i++) {
			x[i] = r.nextInt(1000);
			x2[i] = r.nextInt(1000);
		}
		Arrays.sort(x);

		System.out.println("최소(x[0]) : " + x[0]);
		System.out.println("최대(x[9]) : " + x[9]);
		
		
	}
}
