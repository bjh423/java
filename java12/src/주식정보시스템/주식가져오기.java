package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 주식가져오기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(200, 350);
		Font font = new Font("굴림", 1, 30);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.cyan);

		JButton b1 = new JButton("삼성전사");
		b1.setFont(font);
		b1.setBackground(Color.pink);
		JButton b2 = new JButton("카카오");
		b2.setFont(font);
		b2.setBackground(Color.orange);
		JButton b3 = new JButton("네이버");
		b3.setFont(font);
		b3.setBackground(Color.yellow);
		JButton b4 = new JButton("크롤링 시작");
		b4.setFont(font);
		b4.setBackground(Color.gray);

		JLabel x = new JLabel("Code");
		x.setFont(font);
		JTextField y = new JTextField(6);
		y.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 x = new 네이버증권크롤링3();
				x.naver("005930");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 x = new 네이버증권크롤링3();
				x.naver("035720");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 x = new 네이버증권크롤링3();
				x.naver("035420");
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 x = new 네이버증권크롤링3();
				String yy = y.getText();
				x.naver(yy);
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(x);
		f.add(y);
		f.add(b4);
		f.setVisible(true);

	}
}