package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("몸무게(kg)");
		String b = JOptionPane.showInputDialog("키(m)");
		double c = Double.parseDouble(a);
		double d = Double.parseDouble(b);
		double bmi = c/(d*d);
		System.out.println(bmi);

	}
}
