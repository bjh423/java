package 스태틱;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int num = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.cyan);
		Font font = new Font("굴림", 1, 15);
		Font font1 = new Font("굴림", 1, 150);

		JButton a = new JButton("1 더하기");
		a.setFont(font);

		JButton b = new JButton("0으로 초기화");
		b.setFont(font);

		JButton c = new JButton("1 빼기");
		c.setFont(font);

		JLabel re = new JLabel("결과");
		re.setFont(font1);
		re.setHorizontalAlignment(0);

		f.add(a);
		f.add(b);
		f.add(c);
		f.add(re, BorderLayout.SOUTH);

		a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				re.setText(String.valueOf(++num));

			}
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num=0;
				re.setText(String.valueOf(num));

			}
		});
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				re.setText(String.valueOf(--num));

			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
