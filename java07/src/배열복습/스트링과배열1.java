package 배열복습;

public class 스트링과배열1 {
	public static void main(String[] args) {
		String a = "동해물과 백두산이 마르고 닳도록";
		String b = "하느님이 보우하사 우리나라 만세!!";

		System.out.println(a + b);
		System.out.println(a.concat(b));

		System.out.println(a.charAt(0));
		char x = a.charAt(0);

		System.out.println(a.endsWith("록"));
		boolean y = a.endsWith("록");

		String result = a.substring(3); // 3번째부터 끝까지 추출 <-스트링
		String result2 = a.substring(3, 7); // 3번째~7번째 추출 <-스트링

		boolean result3 = a.contains(b);

		int index = a.lastIndexOf("닳");

		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());

		a.replace("록", "록~"); // <-비파괴형
		System.out.println(a);
		String z = a.replace("록", "록~"); // <-비파괴형
		System.out.println(z);

	}
}
