package 배열기본;

import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		int[] x = new int[999];
		for (int i : x) {
			System.out.println(i);
		}
		System.out.println("======================");

		Random r = new Random();

		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(4) + 1;
			System.out.println(x[i]);
		}

	}

}
