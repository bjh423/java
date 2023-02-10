package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균2 {
	public static void main(String[] args) {
		// 입력 여러번 여러개 받아서 저장 -> 배열사용
		int[] x = new int[5];
		int y = 0;
		int z = 0;

		for (int i = 0; i < x.length; i++) {
			String data = JOptionPane.showInputDialog("숫자입력 : ");
			x[i] = Integer.parseInt(data);
		}

		for (int i : x) {
			System.out.println(i + " ");
		}
		System.out.println();

		for (int i : x) {
			y = y + i;
			if (i >= 300) {
				z = z + i;
			}
		}
		double av = (double) y / x.length;
		System.out.println("평균 : " + av);
		System.out.println("300이상 숫자 합 : " + z);

		for (int i = 0; i < x.length; i++) {
			if (x[i] >= 300) {
				System.out.println("인덱스 " + i + "는 " + x[i] + "로 300이상이다. ");
			}
		}

	}
}
