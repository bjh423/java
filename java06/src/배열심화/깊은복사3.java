package 배열심화;

public class 깊은복사3 {

	public static void main(String[] args) {
		String[] sub = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] fir = { 44, 66, 22, 99, 100 };
		int[] sec = fir.clone();
		sec[0] = 22;
		sec[2] = 88;

		int[] x = new int[5];
		int a = 0; // 오른 과목 수
		int b = 0; // 같은 과목 수

		System.out.println("1학기\t2학기\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for (int i = 0; i < sec.length; i++) {
			System.out.println(fir[i] + "\t" + sec[i]);
			if (fir[i] < sec[i]) {
				x[i] = 2; // 올랐다면 x[i] = 2
				a++;
			} else if (fir[i] == sec[i]) {
				x[i] = 1; // 같으면 x[i] = 1
				b++;
			}
		}

		System.out.print("\n오른 과목 수 : " + a + "\n오른 과목 명 : ");

		for (int i : x) {
			if (i == 2) {
				System.out.println(sub[i] + " ");
			}
		}

	}

}
