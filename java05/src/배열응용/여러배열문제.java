package 배열응용;

public class 여러배열문제 {
	public static void main(String[] args) {

		String[] names = { "김ㅇㅇ", "이ㅇㅇ", "박ㅇㅇ", "최ㅇㅇ", "정ㅇㅇ" };

		int[] t1 = { 77, 88, 99, 55, 70 };
		int[] t2 = { 99, 100, 88, 80, 70 };

		int c1 = 0; // 오른사람
		int c2 = 0; // 같은사람
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < t2.length; i++) {
			sum1 = sum1+t1[i];
			sum2 = sum2+t2[i];
			if (t1[i] < t2[i]) {// 성적이 오른 사람
				c1++;
			} else if (t1[i] == t2[i]) {// 성적이 같은 사람
				c2++;
			}
		}
		System.out.println("성적이 오른 사람 : " + c1 + " 명");
		System.out.println("성적이 같은 사람 : " + c2 + " 명");
		for (int i = 0; i < t2.length; i++) {
			if (t2[i] == 100) {
				System.out.println((i + 1) + "번 " + names[i] + "는 만점");
			}
		}
		System.out.println("1학기평균 : " + sum1 + "\n2학기 평균 : " + sum2);

		for (int i = 0; i < t2.length; i++) {
			if (names[i].equals("박ㅇㅇ")) {
				System.out.println(names[i] + "의 1학기 성적 : " + t1[i] + ", 2학기 성적 : " + t2[i]);
			}
		}
		// 1. 성적이 오른 사람 수
		// 2. 성적이 동일한 사람 수
		// 3. 2학기 만점인 사람 이름,번호
		// 4. 1학기 평균 vs 2학기 평균
		// 5. 박의 1학기,2학기 성적

	}
}