package 반복문;

import java.util.Scanner;

public class 스캐너_연습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1번
		System.out.print("id 입력 >>");
		String id = sc.next();
		System.out.print("pw 입력 >>");
		String pw = sc.next();
		
		if(id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		//2번
		System.out.print("사과 구매 갯수>>");
		int a_n = sc.nextInt();
		System.out.print("사과 구매 가격>>");
		int a_c = sc.nextInt();
		System.out.print("딸기 구매 갯수>>");
		int s_n = sc.nextInt();
		System.out.print("딸기 구매 가격>>");
		int s_c = sc.nextInt();
		
		System.out.println("사과 구매 가격은 "+ a_n*a_c);
		System.out.println("딸기 구매 가격은 "+ s_n*s_c);
		
		//3번
		System.out.println("시작값 >> ");
		int s = sc.nextInt();
		System.out.println("종료값 >> ");
		int e = sc.nextInt();
		int sum = 0;
		for (int i = s; i <= e; i++) {
			sum = i+sum;
		}
		System.out.println(sum);
		
		//4번
		System.out.print("시작값 >> ");
		int s1 = sc.nextInt();
		System.out.print("종료값 >> ");
		int e1 = sc.nextInt();
		System.out.print("점프값 >> ");
		int j = sc.nextInt();
		int sum1 = 0;
		for (int i = s1; i <= e1; i=i+j) {
			sum1 = i+sum1;
		}
		System.out.println(sum1);
		
		sc.close();
	}

}