package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {
	public static void main(String[] args) {
		//입력->처리->출력
		//입력 -> 도구 사용
		String a = JOptionPane.showInputDialog("정수1");
		String b = JOptionPane.showInputDialog("정수2");
		//처리 -> 더하기
		//String을 int로 변경
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int e = c + d;
		
		double f = Double.parseDouble(a);
		double g = Double.parseDouble(b);
		double h = f+g;
		//출력 -> 화면에 보이게
		System.out.println(e+"\n");
		System.out.println(h);

	}
}
