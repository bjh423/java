package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 처리 출력
		String x = JOptionPane.showInputDialog("숫자 1입력");
		int x1 = Integer.parseInt(x);
		String y = JOptionPane.showInputDialog("숫자 2입력");
		int y1 = Integer.parseInt(y);
		
		System.out.println(x1/y1);
		System.out.println((double)x1/y1);

	}

}
