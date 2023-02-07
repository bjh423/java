package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,300);
		
		JButton b1 = new JButton();
		b1.setText("버튼1");
		
		f.add(b1);
		
		f.setVisible(true);//보여주기는 맨 끝으로
	}
}
