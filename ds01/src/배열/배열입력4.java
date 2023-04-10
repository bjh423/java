package 배열;

import java.util.Scanner;

public class 배열입력4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] x = new double[5];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextDouble();
		}
		sc.close();
		for (double y : x) {
			System.out.println(y);
		}
		int count=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]==22.2) {
				count++;
			}
		}
		System.out.println("22.2의 개수 : " + count);
	}
}