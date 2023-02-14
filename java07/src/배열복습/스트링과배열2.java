package 배열복습;

public class 스트링과배열2 {
	public static void main(String[] args) {

		String s = "감자,고구마,양파";
		// 문자열 분리 = split(기준)
		// 분리된 내용은 배열로

		String[] s2 = s.split(",");
		System.out.println(s2.length);
		System.out.println(s2[0]);

		String ss = "감자 고구마 양파";
		String[] ss2 = ss.split(" ");
		System.out.println(ss2[2]);

		String s3 = "      123"; // 공백6칸
		System.out.println(s3.trim());
		String s4 = s3.trim();
		System.out.println(s4.length());

		String s5 = s3.replace("    ", "");
		System.out.println(s5);

		String s6 = "가나다라";
		char[] s7 = s6.toCharArray(); // 한글자씩
		System.out.println(s7[0]);
		System.out.println(s7[1]);

	}
}
