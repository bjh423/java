package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int target = (r.nextInt(100)+1);
		
		int count = 0;
		
		
		while (true) {
			count++;
			
			System.out.println("예상값입력 (1~100)");
			int data = sc.nextInt();
			
			if (target == data) {
				System.out.println("정답. " + count + "회만에 성공");
				sc.close();
				break;
				}
			else {
				if(target > data) {
					System.out.println("정답보다 작음");
				}else {
					System.out.println("정답보다 큼");
				}
			}
		}
		

	}

}


