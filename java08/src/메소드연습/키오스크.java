package 메소드연습;

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

public class 키오스크 {

	static int index = 0;
	static int num0 = 0;
	static int num1 = 0;
	static int num2 = 0;
	static int num = 0;
	static int allCost = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 350);
		Font font = new Font("굴림", 1, 30);
		Font font2 = new Font("굴림", 1, 20);
		f.getContentPane().setBackground(Color.white);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton a = new JButton("짜   장");
		a.setFont(font2);
		a.setBackground(Color.gray);
		JButton b = new JButton("짬   뽕");
		b.setFont(font2);
		b.setBackground(Color.orange);
		JButton c = new JButton("탕수육");
		c.setFont(font2);
		c.setBackground(Color.yellow);

		f.add(a);
		f.add(b);
		f.add(c);

		String[] food = { "짜   장", "짬   뽕", "탕수육" };
		final int[] foodCost = { 8000, 9000, 15000 };
		String[] foodImg = { "1.jpg", "2.jpg", "3.jpg" };

		JLabel label1 = new JLabel("개수 : ");
		label1.setFont(font2);
		f.add(label1);
		JLabel label2 = new JLabel(num + "개");
		label2.setFont(font2);
		f.add(label2);

		JLabel img = new JLabel();
		img.setHorizontalAlignment(0);
		ImageIcon icon = new ImageIcon("0.jpg");
		img.setIcon(icon);
		f.add(img, BorderLayout.CENTER);

		JLabel cost = new JLabel("결제금액 : " + allCost + "원");
		cost.setFont(font);
		cost.setHorizontalAlignment(0);
		f.add(cost, BorderLayout.SOUTH);

		a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 0;
				ImageIcon icon = new ImageIcon(foodImg[index]);
				img.setIcon(icon);
				num0++;
				num = num0 + num1 + num2;
				label2.setText(num + "개");

				allCost += foodCost[index];
				cost.setText("결제금액 : " + allCost + "원");
				
				f.setTitle("짜장" + num0 + "개, 짬뽕" + num1 + "개, 탕수육 " + num2 + "개");

			}
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 1;
				ImageIcon icon = new ImageIcon(foodImg[index]);
				img.setIcon(icon);
				num1++;
				num = num0 + num1 + num2;
				label2.setText(num + "개");

				allCost += foodCost[index];
				cost.setText("결제금액 : " + allCost + "원");

				f.setTitle("짜장" + num0 + "개, 짬뽕" + num1 + "개, 탕수육 " + num2 + "개");
			}
		});
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 2;
				ImageIcon icon = new ImageIcon(foodImg[index]);
				img.setIcon(icon);
				num2++;
				num = num0 + num1 + num2;
				label2.setText(num + "개");

				allCost += foodCost[index];
				cost.setText("결제금액 : " + allCost + "원");

				f.setTitle("짜장" + num0 + "개, 짬뽕" + num1 + "개, 탕수육 " + num2 + "개");
			}
		});
	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
