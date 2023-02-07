package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {
	public static void main(String[] args) {
		JFrame a = new JFrame();
		a.setSize(400,800);
		
		FlowLayout flow = new FlowLayout();
		
		a.setLayout(flow);
		
		JLabel x = new JLabel();
		x.setText("아이디");
		JLabel y = new JLabel();
		y.setText("비밀번호");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		

		JButton b = new JButton();
		b.setText("버튼1");
		JButton c = new JButton();
		c.setText("버튼2");
		
		Font font = new Font("굴림",1,20);
		
		x.setFont(font);
		y.setFont(font);
		b.setFont(font);
		c.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		
		b.setBackground(Color.RED); //배경색
		b.setForeground(Color.WHITE); //글자색
		c.setBackground(Color.RED); //배경색
		c.setForeground(Color.WHITE); //글자색

		ImageIcon icon = new ImageIcon("1.jpg");
		ImageIcon icon2 = new ImageIcon("2.jpg");
		
		b.setIcon(icon);
		c.setIcon(icon2);
		
		
		a.add(x);
		a.add(input1);
		a.add(b);
		a.add(y);
		a.add(input2);
		a.add(c);
		
		a.setVisible(true);
	}
}
