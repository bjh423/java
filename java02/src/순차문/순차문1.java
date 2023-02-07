package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {
	public static void main(String[] args) {
		//입력->처리->출력
		//입력 -> 도구 사용
		String a = JOptionPane.showInputDialog("취미는?");
		String b = JOptionPane.showInputDialog("언제?");
		//처리 -> 글자 연결
		String c = a+b;
		//출력 -> 화면에 보이게
		System.out.println(c);

	}
}
