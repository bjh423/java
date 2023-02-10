package 배열기본;

public class 배열기본확인 {
	public static void main(String[] args) {

		String a[] = new String[5];
		a[0] = "서울";
		a[1] = "대전";
		a[2] = "대구";
		a[3] = "부산";
		a[4] = "제주";
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		char b[] = { 'r', 'g', 'b', 'y', 'w' };
		for (char x : b) {
			System.out.println(x);
		}

		int c[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}
}
