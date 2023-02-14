package 부품응용;

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

public class 로그인화면 {
	public static void main(String[] args) {
		// jframe, imageicon, imagelabel
		// font, flowlayout
		// idlabel, pwlabel, id입력값, pw입력값
		// 로그인버튼, 리셋버튼

		JFrame f = new JFrame();
		f.setTitle("일기장 로그인");
		f.setSize(450, 800);
		f.getContentPane().setBackground(Color.cyan);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("굴림", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아   이   디 :");
		JLabel pw = new JLabel("패 스 워 드 :");

		id.setFont(font);
		pw.setFont(font);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);

		ImageIcon loginImg = new ImageIcon("login.png");
		ImageIcon resetImg = new ImageIcon("reset.png");
		ImageIcon labelImg = new ImageIcon("note.png");

		JButton login = new JButton();
		login.setIcon(loginImg);
		JButton reset = new JButton();
		reset.setIcon(resetImg);
		top.setIcon(labelImg);

		// 1) 버튼에 액션 기능 추가
		// 2) 클릭했을때 어떤 부품이 처리 담당할지 new로 지정
		// 3) 클릭했을때 어떻게 처리할지 작성

		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				idText.setText("");
				pwText.setText("");
			}
		});
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인처리
				String id2 = idText.getText();
				String pw2 = pwText.getText();

				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					쓰기화면 diary = new 쓰기화면();
					diary.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}

			}
		});

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);

	}
}
