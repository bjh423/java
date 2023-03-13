package 화면DB연결;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import 자바DB연결.MP_StaffDAO;

public class MP_Staff_Manage {
	public static void open() {
		JFrame f = new JFrame();
		f.setSize(550, 550);

		MP_StaffDAO dao = new MP_StaffDAO();
		ArrayList<MP_StaffVO> list = dao.search();

		String[] header = { "직원번호", "아이디", "이름", "전화번호", "직급" };
		Object[][] all = new String[list.size()][5];

		if (list.size() == 0) {
			System.out.println("검색 결과 없음");
		} else {
			System.out.println("총 " + list.size() + "개의 검색결과가 있습니다.");

			for (int i = 0; i < all.length; i++) {
				all[i][0] = list.get(i).getCode() + "";
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
		scroll.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JButton b1 = new JButton("인증코드");
		JButton b2 = new JButton("내 정보 수정");
		JLabel l1 = new JLabel("스태프 관리");

		Font font = new Font("굴림", 1, 15);
		Font font1 = new Font("굴림", 1, 35);
		b1.setFont(font);
		b2.setFont(font);
		l1.setFont(font1);
		l1.setHorizontalAlignment(JLabel.CENTER);

		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		f.setLayout(grid);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0.1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		f.add(b1, gbc);

		gbc.weightx = 0.3;
		gbc.gridx = 1;
		gbc.gridy = 0;
		f.add(l1, gbc);

		gbc.weightx = 0.1;
		gbc.gridx = 2;
		gbc.gridy = 0;
		f.add(b2, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 3;
		f.add(scroll, gbc);
		f.setVisible(true);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MP_Staff_Code code = new MP_Staff_Code();
				code.open();
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MP_Staff_Change Change = new MP_Staff_Change();
				Change.open();

			}
		});

	}

}