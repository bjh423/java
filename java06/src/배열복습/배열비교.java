package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		// 입력 : 많은 양의 저장공간 (2개 배열)
		// 랜덤 데이터 입력
		// 반복문으로 인덱스를 옮기면서 데이터 입력
		int[] ans = new int[990];
		int[] ans1 = new int[990];
		int score = 0;

		Random r = new Random(42);

		for (int i = 0; i < ans1.length; i++) {
			ans[i] = r.nextInt(4) + 1;
			ans1[i] = r.nextInt(4) + 1;
		}

		System.out.println("번호\t:\t답안\t\t내답");

		for (int i = 0; i < ans1.length; i++) {
			System.out.println(i + " : " + ans[i] + " <-> " + ans1[i]);
			if (ans[i] == ans1[i]) {
				score++;
			}
		}
		System.out.println("총점 : " + score);
	}

}
