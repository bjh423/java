package 화면DB연결;

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

import 자바DB연결.MP_StaffDAO;

public class MP_StaffUI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(600, 600);

		JLabel l1 = new JLabel("<<<< 회원가입화면 >>>>");
		JLabel l2 = new JLabel("아 이 디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이      름");
		JLabel l5 = new JLabel("전화번호");
		JLabel l6 = new JLabel("직      책"); //(점장1 매니저2 정직원3 알바4)
		JLabel l7 = new JLabel("인증코드");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);
		JTextField t6 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		// 가입
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				int level = Integer.parseInt(t5.getText());

				if (id.equals("")) {
					JOptionPane.showMessageDialog(f, "아이디는 필수 입력 항목입니다.");
				}

				MP_StaffDAO dao = new MP_StaffDAO();
				MP_StaffVO bag = new MP_StaffVO();

				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				bag.setLevel(level);

				int result = dao.insert(bag, t6.getText());

				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원가입 실패, 재입력해주세요");
				}

			}
		});

		// 탈퇴
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
				String id = t1.getText();

				MP_StaffDAO dao = new MP_StaffDAO();
				MP_StaffVO bag = new MP_StaffVO();
				int result = dao.delete(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 처리 완료");
				} else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 처리 실패");
				}

			}
		});

		// 수정
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원정보 수정처리");
				String id = t1.getText();
				String tel = t4.getText();

				MP_StaffDAO dao = new MP_StaffDAO();
				MP_StaffVO bag = new MP_StaffVO();
				int result = dao.update(bag, t6.getText());
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원정보 수정 완료");
				} else {
					JOptionPane.showMessageDialog(f, "회원정보 수정 실패");
				}
			}
		});

		/*
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원검색처리");
				String id = t1.getText();

				MP_StaffDAO dao = new MP_StaffDAO();
				MP_StaffVO bag = dao.one(id);

				if (bag != null) {
					t2.setText(bag.getPw());
					t2.setBackground(Color.white);
					t3.setText(bag.getName());
					t3.setBackground(Color.white);
					t4.setText(bag.getTel());
					t4.setBackground(Color.white);
				} else {
					JOptionPane.showMessageDialog(f, "검색결과없음");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				}

			}
		});
		*/

		FlowLayout flow = new FlowLayout();

		Font font = new Font("궁서", Font.BOLD, 35);

		f.setLayout(flow);

		f.add(l1);
		f.add(l2);f.add(t1);
		f.add(l3);f.add(t2);
		f.add(l4);f.add(t3);
		f.add(l5);f.add(t4);
		f.add(l6);f.add(t5);
		f.add(l7);f.add(t6);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		l7.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t5.setFont(font);
		t6.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.blue);
		t5.setBackground(Color.yellow);
		t5.setForeground(Color.blue);
		t6.setBackground(Color.yellow);
		t6.setForeground(Color.blue);

		b1.setBackground(Color.pink);
		b1.setForeground(Color.red);
		b2.setBackground(Color.pink);
		b2.setForeground(Color.red);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.red);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.red);

		f.getContentPane().setBackground(Color.green);

		f.setVisible(true);

	}

}