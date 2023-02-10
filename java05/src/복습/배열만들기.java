package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 이미 값을 아는 경우
		String[] x = {"2","3","4","5","6"};
		for (int i = 0; i < x.length; i++) {
			System.out.println(i);
		}
		
		// 2. 값을 모르는 경우
		String[] y = new String[5];
		y[0] = "1";
		y[1] = "1";
		y[2] = "1";
		y[3] = "1";
		y[4] = "1";
		
		//for-each 인덱스 하나씩 자동 증가, 출력용(자바)
		for (String qwe : y) {
			System.out.println(qwe);
		}
		
		
	}

}
