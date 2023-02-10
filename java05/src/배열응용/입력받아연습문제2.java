package 배열응용;

import java.util.Scanner;

public class 입력받아연습문제2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] x= new int[5];
		for (int i = 0; i < x.length; i++) {
			System.out.print((i+1) + "번째에 넣을 숫자 입력 : ");
			x[i] = sc.nextInt();
		}
		System.out.println("1번째 + 3번째 = " + (x[0] + x[2]));
		
		String[] y = new String[3];
		for (int i = 0; i < y.length; i++) {
			y[i] = sc.next();
		}
		
		System.out.println(y[0] + "보다 " + y[1]);
		
		
		
		sc.close();
		
	}
}