package 반복문;

import java.util.Scanner;

public class 스캐너 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("나이 입력>>"); int age = sc.nextInt(); int nextAge = age+1;
		 * System.out.println("내년엔 " + nextAge + "살");
		 */
		System.out.print("무슨 요일?(주중 :1, 주말 :2 >>)");
		int data = sc.nextInt();
		if (data == 1) {
			System.out.println("주중");
		} else if (data == 2) {
			System.out.println("주말");
		} else {
			System.out.println("제대로 입력");
		}
		System.out.print("주말에 뭐함?");
		String data1 = sc.next();
		System.out.println("주말에 " + data1 + "한다");
		sc.close();
	}

}