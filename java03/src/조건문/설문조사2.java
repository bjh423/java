package 조건문;

import javax.swing.JOptionPane;

public class 설문조사2 {

	public static void main(String[] args) {
		// 인기투표 1/2/3번, 10명에게 표받고 각각 몇표인지 출력
		int x = 0;
		int y = 0;
		int z = 0;

		for (int i = 0; i < 10; i++) {
			String re = JOptionPane.showInputDialog("1/2/3번 선택");
			switch (re) {
			case "1":
				x++;
				break;
			case "2":
				y++;
				break;
			case "3":
				z++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2,3중 선택");
				i--;
				break;
			}
		}
		System.out.println("1번 선택한 사람 : " + x + "명");
		System.out.println("2번 선택한 사람 : " + y + "명");
		System.out.println("3번 선택한 사람 : " + z + "명");

	}

}
