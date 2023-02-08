package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class For3 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 350);
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("별 10개");
		JButton b2 = new JButton("커피*5");
		JButton b3 = new JButton("커피*우유3");
		JButton b4 = new JButton("1:짱!");

		Font f1 = new Font("굴림", 1, 45);

		b1.setBackground(Color.pink);
		b2.setBackground(Color.cyan);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.cyan);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
				System.out.println();
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + ": 짱!");
				}
				System.out.println();
			}
		});

		f.setVisible(true);

	}
}
