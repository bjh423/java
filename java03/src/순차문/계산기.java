package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기 {
	public static void main(String[] args) {
		// 필요 : 폰트, 레이아웃, 버튼1, 틀 , 텍스트 입력1,2 이미지

		JFrame board = new JFrame();
		board.setSize(300, 500);

		ImageIcon calcu = new ImageIcon("011.png");

		JLabel text1 = new JLabel();
		text1.setText("숫자1");
		JLabel text2 = new JLabel();
		text2.setText("숫자2");
		JLabel img = new JLabel();
		img.setIcon(calcu);

		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		button.setText("+");
		button2.setText("-");
		button3.setText("*");
		button4.setText("/");

		JTextField t1 = new JTextField(20);

		JTextField t2 = new JTextField(20);

		Font f = new Font("굴림", 1, 15);
		FlowLayout flow = new FlowLayout();

		board.setLayout(flow);

		text1.setFont(f);
		text2.setFont(f);
		t1.setFont(f);
		t2.setFont(f);
		button.setFont(f);

		board.add(img);
		board.add(text1);
		board.add(t1);
		board.add(text2);
		board.add(t2);
		board.add(button);
		board.add(button2);
		board.add(button3);
		board.add(button4);

		text1.setForeground(Color.blue);
		text2.setForeground(Color.blue);
		button.setForeground(Color.blue);
		button.setBackground(Color.white);
		button2.setForeground(Color.blue);
		button2.setBackground(Color.white);
		button3.setForeground(Color.blue);
		button3.setBackground(Color.white);
		button4.setForeground(Color.blue);
		button4.setBackground(Color.white);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //"333"
				String s2 = t2.getText(); //"222"
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 + n2;
				JOptionPane.showMessageDialog(board, result);

			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //"333"
				String s2 = t2.getText(); //"222"
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 - n2;
				JOptionPane.showMessageDialog(board, result);

			}
		});
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //"333"
				String s2 = t2.getText(); //"222"
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 * n2;
				JOptionPane.showMessageDialog(board, result);

			}
		});
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //"333"
				String s2 = t2.getText(); //"222"
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				double result = (double)n1 / n2;
				JOptionPane.showMessageDialog(board, String.format("%.3f", result));

			}
		});

		board.setVisible(true); // 최종 출력

	}
}
