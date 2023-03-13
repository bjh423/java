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

public class MP_Staff_SignUp {
	public static void open() {
		JFrame f = new JFrame();
		f.setTitle("관리자 가입화면");
		f.setSize(600, 600);

		JLabel l1 = new JLabel("           관리자 가입          ");
		JLabel l2 = new JLabel("아 이 디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이      름");
		JLabel l5 = new JLabel("전화번호");
		JLabel l6 = new JLabel("직      책"); // (점장1 매니저2 정직원3 알바4)
		JLabel l7 = new JLabel("인증코드");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);
		JTextField t6 = new JTextField(10);

		JButton b1 = new JButton("관리자 가입");

		// 가입
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result = 0;

				MP_StaffDAO dao = new MP_StaffDAO();
				MP_StaffVO bag = new MP_StaffVO();

				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				int rank = Integer.parseInt(t5.getText());

				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				bag.setRank(rank);

				if (id.equals("")) {
					JOptionPane.showMessageDialog(f, "아이디는 필수 입력 항목입니다.");
				} else {
					switch (dao.codeCheck(rank, t6.getText())) {
					case 2:
						JOptionPane.showMessageDialog(f, "오류발생");
						break;
					case 1:
						JOptionPane.showMessageDialog(f, "인증코드가 일치하지 않습니다");
						break;
					case 0:
						result = dao.insert(bag);
						if (result == 1) {
							JOptionPane.showMessageDialog(f, "회원가입 성공");
						} else {
							JOptionPane.showMessageDialog(f, "회원가입 실패");
						}
						break;
					}
				}

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
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(l6);
		f.add(t5);
		f.add(l7);
		f.add(t6);
		f.add(b1);

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

		t1.setBackground(Color.green);
		t1.setForeground(Color.black);
		t2.setBackground(Color.green);
		t2.setForeground(Color.black);
		t3.setBackground(Color.green);
		t3.setForeground(Color.black);
		t4.setBackground(Color.green);
		t4.setForeground(Color.black);
		t5.setBackground(Color.green);
		t5.setForeground(Color.black);
		t6.setBackground(Color.green);
		t6.setForeground(Color.black);

		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);

		f.getContentPane().setBackground(Color.white);

		f.setVisible(true);

	}

}