package 문자열;

public class 문자열심화 {
	public static void main(String[] args) {
		String s = "가나다";
		String s2 = "가나다";
		
		System.out.println(s);
		System.out.println(s2);

		System.out.println(s.equals(s2));
		System.out.println(s == s2);
		
		s = "라마바";
		
		System.out.println(s.equals(s2));
		System.out.println(s == s2);
		
		// String은 새로운 값이 저장될때마다 새로운 주소를 사용
		// StringBuilder 사용
		
		StringBuilder b = new StringBuilder();
		b.append("라마바");
		System.out.println(b);
		
	}
}
