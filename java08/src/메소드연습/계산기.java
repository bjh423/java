package 메소드연습;

public class 계산기 {
	public void 더하기(int x, int y) {
		System.out.println("더하기 기능");
		System.out.println(x+y);
	}
	public void 곱하기(int x, int y, int z) {
		System.out.println("곱하기");
		System.out.println(x*y*z);
	}
	public int 빼기(int x, int y) {
		System.out.println("빼기");
		System.out.println(x-y);
		return x-y;
	}
}
