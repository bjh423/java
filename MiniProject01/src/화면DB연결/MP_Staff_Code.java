package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import 자바DB연결.MP_StaffDAO;
import 자바DB연결.MP_StaffDAO;

public class MP_Staff_Code {
	public static void open() {
		JFrame f = new JFrame();
		f.setTitle("관리자 화면");
		f.setSize(600, 400);

		JLabel l1 = new JLabel("인증 코드 설정");
		JLabel l5 = new JLabel("  ");
		JLabel l2 = new JLabel("관리자 가입 시 필요한 인증코드를 설정하는 화면입니다.");
		JLabel l3 = new JLabel("인증코드를 사용할 직책을 입력하세요");
		JLabel l4 = new JLabel("인증코드를 설정해주세요");

		String[] opt = { "점장", "매니저", "정직원", "아르바이트" };
		JComboBox<String> com = new JComboBox<String>(opt);
		JTextField t1 = new JTextField(10);

		JButton b1 = new JButton("설정");

		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		f.setLayout(grid);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		f.add(l1, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		f.add(l5, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		f.add(l2, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		f.add(l3, gbc);

		gbc.fill = GridBagConstraints.EAST;
		gbc.gridx = 0;
		gbc.gridy = 4;
		f.add(com, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 5;
		f.add(l4, gbc);

		gbc.fill = GridBagConstraints.EAST;
		gbc.gridx = 0;
		gbc.gridy = 6;
		f.add(t1, gbc);

		gbc.gridx = 0;
		gbc.gridy = 7;
		f.add(b1, gbc);

		// 가입
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int lev = 0;
				String item = com.getSelectedItem().toString();
				switch (item) {
				case "점장":
					lev = 1;
					break;
				case "매니저":
					lev = 2;
					break;
				case "정직원":
					lev = 3;
					break;
				case "아르바이트":
					lev = 4;
					break;
				}

				MP_StaffDAO dao = new MP_StaffDAO();
				MP_StaffVO bag = new MP_StaffVO();

				System.out.println("인증코드 수정처리");

				String preCode = JOptionPane.showInputDialog("확인을 위해 기존 인증코드를 입력해주세요");

				String code = t1.getText();
				

				int x = dao.codeCheck(lev, preCode);
				switch (x) {
				case 1:
					JOptionPane.showMessageDialog(f, "인증코드가 일치하지 않습니다");
					break;
				case 2:
					JOptionPane.showMessageDialog(f, "인증코드 확인 중 오류가 발생했습니다");
					break;
				case 0:
					String preid = "admin" + lev;
					bag.setId(preid);
					bag.setTel(code);
					dao.update(bag, preid);

					JOptionPane.showMessageDialog(f, "인증 코드 수정이 완료되었습니다.");
					break;

				}
			}
		});

		Font font = new Font("굴림", Font.BOLD, 35);
		Font font1 = new Font("굴림", Font.BOLD, 20);

		l1.setFont(font);
		l1.setHorizontalAlignment(0);
		l2.setFont(font1);
		l3.setFont(font1);
		l4.setFont(font1);
		t1.setFont(font1);
		b1.setFont(font1);

		t1.setBackground(Color.green);
		t1.setForeground(Color.black);

		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);

		f.getContentPane().setBackground(Color.white);

		f.setVisible(true);

	}

}