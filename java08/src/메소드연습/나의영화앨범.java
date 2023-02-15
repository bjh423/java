package 메소드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {

	static int index = 2;

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };

		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.cyan);

		Font font = new Font("굴림", 1, 40);
		Font font2 = new Font("굴림", 1, 20);

		JLabel top = new JLabel(title[index]);
		top.setHorizontalAlignment(0);
		top.setFont(font);

		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon(img[index]);
		center.setHorizontalAlignment(0);
		center.setIcon(icon);
		center.setFont(font);

		JLabel under = new JLabel("평점 : " + String.valueOf(jumsu[index]));
		under.setHorizontalAlignment(0);
		under.setFont(font);

		f.add(top, BorderLayout.NORTH);
		f.add(center, BorderLayout.CENTER);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("왼   쪽");
		left.setFont(font2);
		left.setBackground(Color.white);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (index>0) {
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText("평점 : " + jumsu[index - 1]);
					index--;
				} else {
					JOptionPane.showMessageDialog(f, "페이지의 처음");
				}
				
				
				
			}
		});

		JButton right = new JButton("오른쪽");
		right.setFont(font2);
		right.setBackground(Color.white);
		f.add(right, BorderLayout.EAST);
		
		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (index<title.length-1) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText("평점 : " + jumsu[index + 1]);
					index++;
				} else {
					JOptionPane.showMessageDialog(f, "페이지의 끝");
				}
				
				
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}
}
