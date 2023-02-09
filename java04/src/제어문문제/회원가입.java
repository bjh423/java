package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원가입 {
	public static void main(String[] args) {
		JFrame a = new JFrame();
		a.setSize(400,550);
		a.getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		
		a.setLayout(flow);
		
		
		JLabel logo = new JLabel();
		JLabel id = new JLabel();
		id.setText("아이디");
		JLabel pw = new JLabel();
		pw.setText("비밀번호");
		JLabel name = new JLabel();
		name.setText("이름");
		JLabel tel = new JLabel();
		tel.setText("전화번호");
		
		JTextField input1 = new JTextField(11);
		JTextField input2 = new JTextField(11);
		JTextField input3 = new JTextField(11);
		JTextField input4 = new JTextField(11);
		

		JButton b = new JButton("회원가입");
		
		Font font = new Font("굴림",1,30);
		
		id.setFont(font);
		pw.setFont(font);
		name.setFont(font);
		tel.setFont(font);
		b.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		
		a.add(logo);
		a.add(id);
		a.add(input1);
		a.add(pw);
		a.add(input2);
		a.add(name);
		a.add(input3);
		a.add(tel);
		a.add(input4);
		a.add(b);

		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id1 = input1.getText();
				String pw1 = input2.getText();
				String name1 = input3.getText();
				String tel1 = input4.getText();
				
				JOptionPane.showMessageDialog(a, "아이디: " + id1 + "\n비밀번호: " + pw1 + "\n이름: " + name1 + "\n전화번호: " + tel1);
			}
		});
		
		
		a.setVisible(true);
	}
}
