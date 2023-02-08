package 반복문;

public class 스킵 {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else if (i == 9) {
				System.exit(0); //0 : 정상 종료, 0이아닌 다른값 = 비상종료
			} else {
				continue;
			}
		}
		System.out.println("반복문 모두 종료");
	}

}
