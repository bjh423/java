package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import 자바DB연결.MP_StaffDAO;

public class MP_Staff_Login {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("로그인 화면");
		f.setSize(600, 300);
 
		JLabel l1 = new JLabel("                           관리자 로그인                           ");
		JLabel l2 = new JLabel("아 이 디");
		JLabel l3 = new JLabel("패스워드");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);

		JButton b1 = new JButton("로그인");
		JButton b2 = new JButton("관리자 가입");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				MP_StaffDAO dao = new MP_StaffDAO();
				int tmp = dao.login(id, pw);
				switch (tmp) {
				case 0:
					JOptionPane.showMessageDialog(f, "로그인 성공");
					MP_Staff_Main main = new MP_Staff_Main();
					f.dispose();
					main.open();
					break;
				case 1: case 2:
					JOptionPane.showMessageDialog(f, "로그인 실패");
				default:
					break;
				}
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MP_Staff_SignUp signup = new MP_Staff_SignUp();
				signup.open();
			}
		});

		FlowLayout flow = new FlowLayout();

		Font font = new Font("굴림", Font.BOLD, 35);

		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(b1);
		f.add(b2);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);

		t1.setBackground(Color.green);
		t1.setForeground(Color.black);
		t2.setBackground(Color.green);
		t2.setForeground(Color.black);

		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.white);
		b2.setBackground(Color.GRAY);
		b2.setForeground(Color.white);

		f.getContentPane().setBackground(Color.white);

		f.setVisible(true);

	}

}