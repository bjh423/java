package 배열복습;

public class 스트링과배열3 {
	public static void main(String[] args) {

		String tel = "     011-245-1234    ";

		// 1.공백제거 trim
		String telTrim = tel.trim();
		System.out.println(telTrim);

		// 2.-기준 분리
		String[] telsplit = telTrim.split("-");
		switch (telsplit[0]) { //if면 equals()사용
		case "011":
			System.out.println("SK");
			break;
		case "019":
			System.out.println("LG");
			break;
		default:
			System.out.println("Apple");
			break;
		}
		
		switch (telsplit[1].length()) {
		case 0: case 1: case 2: case 3:
			System.out.println("올드폰");
			break;
		default:
			System.out.println("최신폰");
			break;
		}
		
		if (telsplit[0].length()+telsplit[1].length()+telsplit[2].length() >= 10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}

	}
}
