package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		// 배열에는 참조형도 입력 가능
		// 정수 실수 문자 논리 String jbutton 다들어감
		// 기본형은 변수의 값 저장, 참조형은 주소 저장
		Random r = new Random();
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		// 버튼 200개 배열
		JButton[] buttons = new JButton[200];

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
		}

		f.setLayout(null);

		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBounds(r.nextInt(800), r.nextInt(700), 100, 50);
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}

}
