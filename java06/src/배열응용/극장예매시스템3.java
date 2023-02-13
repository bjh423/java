package 배열응용;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템3 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("영화 티켓 예매");
		f.setSize(600, 1200);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("굴림", 1, 20);

		// 버튼추가 및 기능할당
		JButton[] btn = new JButton[100]; // 200개 버튼
		int[] seat = new int[btn.length]; // 0 : 예약x , 1 : 예약o

		// 결과 라벨
		JLabel ans = new JLabel("결과창");
		ans.setFont(font);

		// 확인용 버튼
		JButton ok = new JButton("예매 현황 확인");
		ok.setFont(font);

		

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setText((i + 1) + "");
			btn[i].setFont(font);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand(); // 버튼 숫자 가져오기
					int no = Integer.parseInt(text); // 버튼 숫자 정수화

					if (seat[no - 1] == 0) {// 빈자리
						ans.setText(text + "번 예약 성공");
						seat[no - 1] = 1;
					} else {
						ans.setText("이미 예약된 좌석입니다.");
					}

				}
			});

			f.add(btn[i]);
		}
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int i : seat) {
					if (i == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, count + "개 좌석 예약 완료");
			}
		});

		f.add(ans);
		f.add(ok);

		f.setVisible(true);
	}
}
