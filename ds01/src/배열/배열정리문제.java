package 배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// 1번
		int min = 999;
		int[] x = new int[5];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			if (x[i] < min) {
				min = x[i];
			}
		}
		System.out.println("최소값 : " + min);

		// 2번
		int[] y = new int[20];
		for (int i = 0; i < y.length; i++) {
			y[i] = r.nextInt(900);
		}
		Arrays.sort(y);
		System.out.println("최대값 : " + y[19]);

		// 3번
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		if (s1.equals(s2)) {
			System.out.println("문자열 동일");
		} else {
			System.out.println("문자열 다름");
		}
		if (s1.length() > s2.length()) {
			System.out.println("s1의 length가 더 크다");
		} else if (s1.length() < s2.length()) {
			System.out.println("s2의 length가 더 크다");
		} else {
			System.out.println("s1과 s2의 length가 같다");
		}

		// 4번
		String s3 = "나는 진짜 java programmer가 되었어";
		String z = s3.substring(6, 21);
		System.out.println(z.toUpperCase());

		// 5번
		String s4 = "2056521";
		if (s4.charAt(0) == '1') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// 6번
		String s5 = "[ 10,20,30,40,50]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		s5= s5.trim();
		String[] s6 = s5.split(",");
		s5.split(",");
		int sum = 0;
		for (int i = 0; i < s6.length; i++) {
			sum += Integer.parseInt(s6[i]);
		}
		System.out.println(sum);
		
		// 7번(내림차순으로 진행)
		Integer[] s7 = new Integer[s6.length];
		for (int i = 0; i < s6.length; i++) {
			s7[i] = Integer.parseInt(s6[i]);
		}
		Arrays.sort(s7,Collections.reverseOrder());
		for (int i = 0; i < s7.length; i++) {
			System.out.println(s7[i]);
		}
	}
}
