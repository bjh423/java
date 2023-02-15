package 메소드연습;

public class 내가게2 {
	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int re1 = cal2.add(300, 200);
		double re2 = cal2.add(300, 22.2);
		double re3 = cal2.add(11.1, 22.2);
		String re4 = cal2.add("나는 오늘 몇시에", 1);
		System.out.println(re1-1000);
		System.out.println(re2-1000);
		System.out.println(re3-1000);
		System.out.println(re4 + "졸려");
	}
}
