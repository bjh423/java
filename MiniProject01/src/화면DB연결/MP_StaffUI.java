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

public class MP_StaffUI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("관리자 화면");
		f.setSize(600, 600);

		JLabel l1 = new JLabel("관리자 가입 화면");
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

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

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

		// 탈퇴
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
				String id = t1.getText();

				MP_StaffDAO dao = new MP_StaffDAO();
				MP_StaffVO bag = new MP_StaffVO();
				bag.setId(id);
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
				MP_StaffDAO dao = new MP_StaffDAO();
				MP_StaffVO bag = new MP_StaffVO();

				System.out.println("회원정보 수정처리");

				String preID = JOptionPane.showInputDialog("확인을 위해 기존 아이디를 입력해주세요");
				String prePW = JOptionPane.showInputDialog("확인을 위해 기존 비밀번호를 입력해주세요");

				int tmp = 0;
				switch (dao.login(preID, prePW)) {
				case 2:
					JOptionPane.showMessageDialog(f, "비밀번호가 틀렸습니다");
					preID = JOptionPane.showInputDialog(f, "확인을 위해 기존 아이디를 입력해주세요");
					prePW = JOptionPane.showInputDialog(f, "확인을 위해 기존 비밀번호를 입력해주세요");
				case 1:
					JOptionPane.showMessageDialog(f, "아이디가 존재하지 않습니다");
					preID = JOptionPane.showInputDialog(f, "확인을 위해 기존 아이디를 입력해주세요");
					prePW = JOptionPane.showInputDialog(f, "확인을 위해 기존 비밀번호를 입력해주세요");
				case 0:
					tmp = 1;
					break;
				}

				if (tmp == 1) {
					String id = t1.getText();
					String pw = t2.getText();
					String name = t3.getText();
					String tel = t4.getText();
					String rank = t5.getText();

					bag.setId(id);
					bag.setPw(pw);
					bag.setName(name);
					bag.setTel(tel);
					bag.setRank(Integer.parseInt(rank));

					int x = dao.codeCheck(bag.getRank(), t6.getText());
					switch (x) {
					case 1:
						JOptionPane.showMessageDialog(f, "인증코드가 일치하지 않습니다");
						break;
					case 2:
						JOptionPane.showMessageDialog(f, "인증코드 확인 중 오류가 발생했습니다");
						break;
					case 0:
						dao.update(bag, preID);
						break;
					}
				}

			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
				f.setSize(550, 700);

				MP_StaffDAO dao = new MP_StaffDAO();
				ArrayList<MP_StaffVO> list = dao.search();

				String[] header = { "직원번호", "아이디", "이름", "전화번호","직원등급" };
				Object[][] all = new String[list.size()][5];

				if (list.size() == 0) {
					System.out.println("검색 결과 없음");
				} else {
					System.out.println("총 " + list.size() + "개의 검색결과가 있습니다.");

					for (int i = 0; i < all.length; i++) {
						all[i][0] = list.get(i).getCode()+"";
						all[i][1] = list.get(i).getId();
						all[i][2] = list.get(i).getName();
						all[i][3] = list.get(i).getTel();
						switch (list.get(i).getRank()) {
						case 1:
							all[i][4] = "점장";
							break;
						case 2:
							all[i][4] = "매니저";
							break;
						case 3:
							all[i][4] = "정직원";
							break;
						case 4:
							all[i][4] = "아르바이트";
							break;
						}
						
					}
				}

				JTable table = new JTable(all, header);
				JScrollPane scroll = new JScrollPane(table);

				f.add(scroll);
				f.setVisible(true);
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