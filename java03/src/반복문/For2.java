package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		// for(초기값 ; 조건식 ; 증감식)
		for (;;) {
			System.out.println("잘 안씀");
			String data = JOptionPane.showInputDialog("종료?");
			if (data.equals("y")) {
				System.out.println("ㅂㅂ");
				break;
			}
		}
	}
}
