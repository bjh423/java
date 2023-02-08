package 조건문;

import javax.swing.JOptionPane;

public class 설문조사 {

	public static void main(String[] args) {
		int yes = 0, no = 0;

		for (int i = 0; i < 10; i++) {
			String re = JOptionPane.showInputDialog("배부름? (배고프면1, 안고프면2)");
			switch (re) {
			case "1":
				yes++;
				break;

			case "2":
				no++;
				break;
			default:
				JOptionPane.showInputDialog("1,2중 선택");
				i--;
				break;
			}

		}
		System.out.println("배고픈 사람 : " + yes + "명");
		System.out.println("배고픈 사람 : " + no + "명");

	}

}
