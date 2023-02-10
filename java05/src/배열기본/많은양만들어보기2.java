package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] x = new int[1000];
		Random r = new Random(42);
		int y = 0; //3+
		int z = 0;
		
		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(19)+2;
			System.out.println(x[i]);
			if (x[i]>=15) {
				y++;
				z = z+x[i];
			}
		}
		System.out.println("15이상 숫자 : " + y + "개");
		System.out.println("15이상 숫자의 합 : " + z);

	}

}
