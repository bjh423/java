package 배열;

import java.util.Scanner;

public class 배열입력3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		for (int y : x) {
			System.out.println(y);
		}
		int count=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]==33) {
				count++;
			}
		}
		System.out.println("33의 개수 : " + count);
	}
}
