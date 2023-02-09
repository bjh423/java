package 제어문문제;

import java.util.Random;

public class 로또2 {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println((r.nextInt(45)+1) + " ");
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println((r.nextInt(9)+2) + " ");
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println((r.nextInt(28)+3) + " ");
		}
	}
}
