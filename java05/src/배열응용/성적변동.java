package 배열응용;

import java.util.Random;

public class 성적변동 {
	public static void main(String[] args) {

		Random r = new Random(42);

		int[] a = new int[10000];
		int[] b = new int[10000];

		for (int i = 0; i < b.length; i++) {
			a[i] = r.nextInt(101);
			b[i] = r.nextInt(101);
		}

		int c1 = 0; // 동일
		int c2 = 0; // 다름
		int c3 = 0;

		for (int i = 0; i < b.length; i++) {
			if (a[i] == b[i]) {
				c1++;
			} else {
				c2++;
			}
			if (a[i] > b[i]) {
				c3++;
			}

		}

		System.out.println("점수 동일 : " + c1 + "명");
		System.out.println("down : " + c3);
		System.out.println("up : " + (c2 - c3));
	}
}