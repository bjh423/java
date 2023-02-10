package 배열응용;

import java.util.Scanner;

public class 여러배열문제2 {
	public static void main(String[] args) {

		String[] a = new String[3];
		String[] b = new String[3];
		Scanner sc = new Scanner(System.in);
		int c = 0;
		
		System.out.println("작년에 가고 싶었던 곳 세곳을 입력하시오.");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}
		System.out.println("올해에 가고 싶었던 곳 세곳을 입력하시오.");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.next();
			if (b[i].equals(a[i])) {
				c++;
			}
		}
		System.out.println("작년,올해 동일 우선순위 : " + c + "곳");
		sc.close();
		
	}
}