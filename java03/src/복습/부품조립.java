package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품조립 {

	public static void main(String[] args) {
		// 1.부품명.기능()
		
		// 2. 신규 생성
		// 부품명 x = new 부품명();
		
		JFrame f = new JFrame();
		f.setSize(400,300);
		f.getContentPane().setBackground(Color.ORANGE);//판때기 색깔
		
		JLabel l = new JLabel("당신이 생각한 숫자");		
		JTextField text = new JTextField(10);
		JButton b = new JButton();
		
		FlowLayout flow = new FlowLayout();
		Font font = new Font("굴림",1,20);
		Font font2 = new Font("굴림",1,30);
		
		f.setLayout(flow);
		
		
		l.setFont(font);
		l.setForeground(Color.blue);
		
		text.setForeground(Color.cyan);
		text.setBackground(Color.black);
		text.setFont(font2);
		
		
		b.setBackground(Color.white);
		b.setForeground(Color.black);
		b.setFont(font2);
		b.setText("숫자 맞추기");
		
		f.add(l);
		f.add(text);
		f.add(b);
		
		f.setVisible(true);
		
		
		
		
		
		
		
		
		

	}

}
