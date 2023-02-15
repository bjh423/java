package 메소드연습;

public class 내가게 {
	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.더하기(2, 3);
		cal.곱하기(2, 3, 4);
		int re = cal.빼기(5, 3);
		System.out.println(re+100);
	}
}
