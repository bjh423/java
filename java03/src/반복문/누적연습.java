package 반복문;

import javax.swing.JOptionPane;

public class 누적연습 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			sum = i+sum;
			//System.out.println(sum);
		}
		
		System.out.println(sum);
		
		String sum2 = "";
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("rr");
			sum2 = sum2 + data + " ";
		}
		
		
		
		
	}

}
