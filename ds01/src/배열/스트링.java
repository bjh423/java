package 배열;

public class 스트링 {

	public static void main(String[] args) {
		String s = "스트링1a";
		String s2 = "스트링2B";
		
		System.out.println(s+s2); //결합
		System.out.println(s.concat(s2)); //결합
		
		System.out.println(s.charAt(0)); //1글자추출
		System.out.println(s.substring(3)); //인덱스 3이후 추출
		System.out.println(s.substring(2,4)); //인데스 2~4 추출
		
		System.out.println(s.endsWith("1")); //특정 문자로 종료
		System.out.println(s.lastIndexOf("링")); //특정 문자 위치
		
		System.out.println(s.toUpperCase()); //대문자로
		System.out.println(s2.toLowerCase()); //소문자로
		
		System.out.println(s.length()); //글자수
		System.out.println(s.replace("스트링", "문자열")); //특정 글자 변환
		
	}
}
