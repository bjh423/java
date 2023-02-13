package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 프레임 생성-> 설정(레이아웃x) -> 버튼 배열 생성 -> 배열에 버튼 입력 -> 위치지정,f에 add -> (심화)버튼 색 몇가지 임의
		// 설정

		Random r = new Random();

		JFrame f = new JFrame();
		f.setSize(500, 500);

		JButton[] x = new JButton[200];
		Color[] y = { Color.red, Color.cyan, Color.green, Color.pink, Color.yellow };

		for (int i = 0; i < x.length; i++) {
			x[i] = new JButton("버튼 " + i);
			x[i].setBounds(r.nextInt(350), r.nextInt(400), 100, 50);
			x[i].setBackground(y[r.nextInt(5)]);
			f.add(x[i]);
		}

		f.setLayout(null);
		f.setVisible(true);
	}
}