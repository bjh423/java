package 제어문;

import javax.swing.JOptionPane;

public class 순차문1 {
	public static void main(String[] args) {
		// 프로그램 짜는 순서
		//입력 : 데이터 입력
		// 처리 : 작업 수행
		// 출력 : 처리 내용 출력
		// 외부대화창 입력 = 모두 String으로 인식
		String name = JOptionPane.showInputDialog("당신의 이름은");

		// 처리
		String result = "나의 이름은 " + name + "입니다.";

		// 출력
		System.out.println(result);
	}
}
