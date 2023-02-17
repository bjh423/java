package 상속기본;

public class 볼펜Main {
	public static void main(String[] args) {
		볼펜 pen = new 볼펜();
		pen.가격 = 1000;
		pen.회사 = "모나미";
		pen.두께 = 1;

		System.out.println(pen);
	}
}