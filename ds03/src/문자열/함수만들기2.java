package 문자열;

public class 함수만들기2 {

	public static void 세수() {
		System.out.println("세수하기");
	}
	
	public static void 세수(String x) {
		System.out.println(x + "을(를) 위해 세수하기");
	}
	
	public static void 밥(String x) {
		System.out.println(x + "밥먹기");
	}
	
	public static void 운동(String x) {
		System.out.println(x + "에서 운동하기");
	}
	
	public static void 잠(String x) {
		System.out.println(x + "잠자기");
	}
	
	public static void 화장() {
		System.out.println("화장하기");
	}
	
	
	
	public static void main(String[] args) {
		세수();
		밥("아침");
		운동("운동장");
		잠("낮");
		밥("점심");
		세수("외출");
		화장();
		밥("저녁");
		운동("공원");
		잠("저녁");
	}
}