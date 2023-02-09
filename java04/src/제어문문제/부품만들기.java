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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품만들기 {
	public static void main(String[] args) {
		JFrame a = new JFrame();
		a.setSize(400,400);
		a.getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		
		a.setLayout(flow);
		
		JLabel x = new JLabel();
		x.setText("아이디");
		JLabel y = new JLabel();
		JLabel z = new JLabel();
		y.setText("비밀번호");
		z.setText("로그인 결과");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		

		JButton b = new JButton();
		ImageIcon icon = new ImageIcon("001.jpg");
		b.setIcon(icon);
		b.setBackground(Color.white);
		b.setBorderPainted(false);
		
		Font font = new Font("굴림",1,30);
		
		x.setFont(font);
		y.setFont(font);
		z.setFont(font);
		b.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		
		a.add(x);
		a.add(input1);
		a.add(y);
		a.add(input2);
		a.add(b);
		a.add(z);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = input1.getText();
				String pw = input2.getText();
				
				if(id.equals("root") && pw.equals("1234")) {
					//JOptionPane.showMessageDialog(a, "로그인성공");
					z.setText("로그인 성공");
				}else {
					//JOptionPane.showMessageDialog(a, "로그인실패");
					z.setText("로그인 실패");
					input1.setText("");
					input2.setText("");
				}
			}
		});
		
		
		a.setVisible(true);
	}
}
