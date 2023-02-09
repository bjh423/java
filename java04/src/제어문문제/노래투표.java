package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 노래투표 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(400, 850);

		f.getContentPane().setBackground(Color.white);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel logo = new JLabel("노래 인기 투표");
		JLabel a1 = new JLabel("1. 아이유 라일락 : ");
		JLabel a2 = new JLabel("0표");
		JLabel b1 = new JLabel("2. 프로미스나인 - we go : ");
		JLabel b2 = new JLabel("0표");
		JLabel c1 = new JLabel("3. 스테이씨 - ASAP : ");
		JLabel c2 = new JLabel("0표");

		JButton a3 = new JButton();
		ImageIcon icon1 = new ImageIcon("a3.png");
		a3.setIcon(icon1);
		a3.setBorderPainted(false);
		a3.setBackground(Color.white);

		JButton b3 = new JButton();
		ImageIcon icon2 = new ImageIcon("b3.png");
		b3.setIcon(icon2);
		b3.setBorderPainted(false);
		b3.setBackground(Color.white);

		JButton c3 = new JButton();
		ImageIcon icon3 = new ImageIcon("c3.png");
		c3.setIcon(icon3);
		c3.setBorderPainted(false);
		c3.setBackground(Color.white);

		JButton end = new JButton("종료");

		Font font1 = new Font("궁서", 1, 20);
		Font font = new Font("굴림", 1, 20);

		logo.setFont(font1);
		a1.setFont(font);
		a2.setFont(font);
		a3.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		c1.setFont(font);
		c2.setFont(font);
		c3.setFont(font);

		f.add(logo);
		f.add(a3);
		f.add(a1);
		f.add(a2);
		f.add(b3);
		f.add(b1);
		f.add(b2);
		f.add(c3);
		f.add(c1);
		f.add(c2);

		f.add(end);

		f.setVisible(true);

		while (true) {

			a3.addActionListener(new ActionListener() {
				int i = 0;

				@Override
				public void actionPerformed(ActionEvent e) {
					i++;
					a2.setText(i + "표");
				}
			});
			b3.addActionListener(new ActionListener() {
				int i = 0;

				@Override
				public void actionPerformed(ActionEvent e) {
					i++;
					b2.setText(i + "표");

				}
			});
			c3.addActionListener(new ActionListener() {
				int i = 0;

				@Override
				public void actionPerformed(ActionEvent e) {
					i++;
					c2.setText(i + "표");

				}
			});
			end.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});

		}

	}
}
