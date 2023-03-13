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
import 자바DB연결.MP_StaffDAO;

public class MP_Staff_Main {
	public static void open() {
		JFrame f = new JFrame();
		f.setTitle("관리자 화면");
		f.setSize(600, 350);

		JLabel l1 = new JLabel("        관리자 메인 화면        ");
		JButton b1 = new JButton("회  원    관  리");
		JButton b2 = new JButton("스 태 프   관 리");
		JButton b3 = new JButton("제  품    관  리");

		// 가입
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "회원 관리 페이지");
			}
		});

		// 탈퇴
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MP_Staff_Manage manage = new MP_Staff_Manage();
				f.dispose();
				manage.open();
				
			}
		});

		// 수정
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "제품 관리 페이지");
			}
		});

		FlowLayout flow = new FlowLayout();

		Font font = new Font("굴림", Font.BOLD,45);

		f.setLayout(flow);

		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		l1.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);
		b2.setBackground(Color.gray);
		b2.setForeground(Color.white);
		b3.setBackground(Color.gray);
		b3.setForeground(Color.white);

		f.getContentPane().setBackground(Color.white);

		f.setVisible(true);

	}

}