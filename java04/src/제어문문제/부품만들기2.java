package 제어문문제;

import java.util.Scanner;

public class 부품만들기2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("인기 투표 시스템");
		System.out.println("=============");

		int x = 0; //아이유
		int y = 0; //방탄
		int z = 0; //뉴진스

		while (true) {

			System.out.println("1)아이유 2)방탄 3)뉴진스 4)종료");
			int a = sc.nextInt();
			if (a == 1) {
				x++;
			} else if (a == 2) {
				y++;
			} else if (a == 3) {
				z++;
			} else if (a == 4) {
				System.out.println("시스템을 종료합니다");
				System.out.println("-------------");
				System.out.println("아이유 " + x + "표");
				System.out.println("방탄 " + y + "표");
				System.out.println("뉴진스 " + z + "표");
				System.out.println("-------------");
				sc.close();
				break;
			} else {
				System.out.println("1,2,3,4중 입력");
			}

		}

	}
}
