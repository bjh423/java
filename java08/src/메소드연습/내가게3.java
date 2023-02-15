package 메소드연습;

public class 내가게3 {
	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전 손님
		int count2 = 4; // 오후 손님

		// 1번
		System.out.println("오늘 온 손님의 총 합은 " + cal3.add(count1, count2) + "명입니다.");

		// 2번
		System.out.println("손님 수 차이는 " + cal3.minus(count1, count2) + "명입니다.");

		// 3번
		System.out.println("오전 결제금액은 " + cal3.mul(price, count1) + "원입니다.");

		// 4번
		System.out.println("오후 결제금액은 " + cal3.mul(price, count2) + "원입니다.");

		// 5번
		System.out.println("오늘 하루 총 결제 금액은 " + (cal3.mul(price, count1) + cal3.mul(price, count2)) + "원입니다.");
		
		// 6번
		System.out.println("1인당 결제 금액은 " + cal3.div((cal3.mul(price, count1) + cal3.mul(price, count2)), cal3.add(count1, count2)) + "원입니다.");
	}
}
