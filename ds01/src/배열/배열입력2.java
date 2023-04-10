package 배열;

import java.util.Scanner;

public class 배열입력2 {
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

	}
}
