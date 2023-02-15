package 키오스크복습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 키오스크2 {

	static int index = 0;
	static int numa = 0; // 짜장
	static int numb = 0; // 짬뽕
	static int numc = 0; // 탕슉

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.setTitle("점심식사 메뉴");
		f.getContentPane().setBackground(Color.white);

		final int[] foodCost = { 8000, 9000, 15000 };
		String[] foodImg = { "1.jpg", "2.jpg", "3.jpg" };

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("굴림", 1, 20);

		JButton a = new JButton("짜   장");
		a.setFont(font);
		a.setBackground(Color.gray);

		JButton b = new JButton("짬   뽕");
		b.setFont(font);
		b.setBackground(Color.orange);

		JButton c = new JButton("탕수육");
		c.setFont(font);
		c.setBackground(Color.yellow);
		JLabel aCost = new JLabel("8000원  ");
		aCost.setFont(font);

		JLabel bCost = new JLabel("9000원");
		bCost.setFont(font);

		JLabel cCost = new JLabel("15000원");
		cCost.setFont(font);

		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("0.jpg");
		img.setIcon(icon);

		JLabel re = new JLabel("주문 현황");
		re.setSize(400, 400);
		re.setFont(font);

		f.add(a);
		f.add(b);
		f.add(c);
		f.add(aCost);
		f.add(bCost);
		f.add(cCost);
		f.add(img, BorderLayout.CENTER);
		f.add(re, BorderLayout.SOUTH);

		a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 0;
				ImageIcon icon = new ImageIcon(foodImg[index]);
				img.setIcon(icon);
				re.setText("짜장면 : " + ++numa + "  짬뽕 : " + numb + "  탕수육 : " + numc);
				f.setTitle(numa * foodCost[0] + numb * foodCost[1] + numc * foodCost[2] + "원");
			}
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 1;
				ImageIcon icon = new ImageIcon(foodImg[index]);
				img.setIcon(icon);
				re.setText("짜장면 : " + numa + "  짬뽕 : " + ++numb + "  탕수육 : " + numc);
				f.setTitle(numa * foodCost[0] + numb * foodCost[1] + numc * foodCost[2] + "원");
			}
		});
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 2;
				ImageIcon icon = new ImageIcon(foodImg[index]);
				img.setIcon(icon);
				re.setText("짜장면 : " + numa + "  짬뽕 : " + numb + "  탕수육 : " + ++numc);
				f.setTitle((numa * foodCost[0]) + (numb * foodCost[1]) + (numc * foodCost[2]) + "원");
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
