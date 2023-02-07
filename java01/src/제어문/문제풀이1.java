package 제어문;

import javax.swing.JOptionPane;

public class 문제풀이1 {
	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일?");
		String play = JOptionPane.showInputDialog("수업 끝나고 할 것");
		
		String x = "오늘은 " + day + "이고, 저는 수업 후 " + play + "을(를) 할 것 입니다.";
		
		System.out.println(x);
	}
}