package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("입력1");
		String b = JOptionPane.showInputDialog("입력2");
		String c = JOptionPane.showInputDialog("입력3");
		
		String d = a+b+c;
		System.out.println(d);
		JOptionPane.showMessageDialog(null, d);
	}
}
