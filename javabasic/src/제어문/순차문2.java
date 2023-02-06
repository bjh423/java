package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("좋아하는 운동");
		String b = JOptionPane.showInputDialog("좋아하는 요일");
		
		String c = b + "에 저는 " + a + "를 합니다.";
		
		System.out.println(c);
	}
}
