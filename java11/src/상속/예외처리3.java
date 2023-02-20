package 상속;


public class 예외처리3 {
	public static void main(String[] args) {
		
		int[] num = new int[3];
		try {
			num[3] = 2;
		} catch (Exception e) {
		}
		System.out.println(num.length);
	}
	// 안하면 실행이 안됨
	// 컴파일에러 : 걍 말이 안되는 거
	// 실행에러 : 하다가 삑나는거
	// try catch
	// 외부자원 연결(네트워크,파일,DB,CPU)
}
