package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42);
		int[] x = new int[10000];
		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(1000) + 1;
		}

		Arrays.sort(x);
		for (int i : x) {
			System.out.println(i); // 오름차순
		}

		System.out.println("최소 : " + x[0]);
		System.out.println("최대 : " + x[x.length - 1]);
		int sum = 0;
		for (int i = 7000; i < x.length; i++) {
			sum = x[i] + sum;
		}
		System.out.println("상위 30%평균 : " + (sum / 3000.0));
		int sum1 = 0;
		for (int i = 0; i < 3000; i++) {
			sum1 = x[i] + sum1;
		}
		System.out.println("하위 30%평균 : " + (sum1 / 3000.0));

	}

}
