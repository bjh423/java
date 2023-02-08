package 반복문;

import java.util.Scanner;

public class 스캐너2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("나에 대한 정보");
		System.out.println("-----------");
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.print("취미 입력 >> ");
		String hobby = sc.next();
		System.out.println("-----------");
		System.out.println("나의 이름은 "+name);
		System.out.println("나의 나이는 "+age + "세");
		System.out.println("나의 취미는 "+hobby + "입니다.!");
		*/
		
		
		System.out.print("나이 입력 >> ");
		int x = sc.nextInt();
		System.out.println("내년 나이는 " + (x+1) + "세");
		
		System.out.print("키를 입력 >> ");
		double y = sc.nextDouble();
		System.out.println("당신의 키는 " + y);
		System.out.println("내년 당신의 키는 " + (y+10));
		
		System.out.print("저녁을 먹었는지 입력(true/flase) >> ");
		boolean z = sc.nextBoolean();
		System.out.println("당신의 저녁 여부는 " + z);
		if(z) {
			System.out.println("배가 부르시겠군요");
		}else {
			System.out.println("배가 고프시겠군요");
		}
		
		System.out.print("올해의 목표는 >> ");
		sc.nextLine();
		String w = sc.nextLine();
		System.out.println("올해의 목표는 " + w);
		
		sc.close();
	}

}