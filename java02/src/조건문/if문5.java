package 조건문;

public class if문5 {
	public static void main(String[] args) {
	String ssn = "1234321";
	
	if (ssn.equals("1234321")) {
		System.out.println("동일지역 출생");
	}else {
		System.out.println("동일지역 출생x");
	}
		
	
	char gen = ssn.charAt(0); //첫번째 자리 문자 추출
	
	switch (gen) {
	case '1': case '3':
		System.out.println("남");
		break;
	case'2' : case'4':
		System.out.println("여");
		break;
	}
		
	}

}