package 부품응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 쓰기화면 {
	public void open() {
		// jframe 화면이 보이게
		JFrame f = new JFrame();
		f.setTitle("일기장 화면");
		f.setSize(500, 600);
		f.getContentPane().setBackground(Color.cyan);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("굴림", 1, 30);

		JLabel day = new JLabel("날       짜");
		JLabel title = new JLabel("일기 제목");
		JLabel content = new JLabel("내       용");

		day.setFont(font);
		title.setFont(font);
		content.setFont(font);

		JTextField dayText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		dayText.setHorizontalAlignment(JTextField.CENTER);
		titleText.setHorizontalAlignment(JTextField.CENTER);
		dayText.setFont(font);
		titleText.setFont(font);

		JTextArea contentText = new JTextArea(5, 10);
		contentText.setFont(font);

		JButton btn = new JButton("저장");
		btn.setFont(font);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String day2 = dayText.getText();
				String title2 = titleText.getText();
				String content2 = contentText.getText();
				System.out.println(day2 + " " + title2 + " " + content2);
				
				try {
					FileWriter file = new FileWriter(day2 + ".text");
					file.write(day+"\n");
					file.write(title2+"\n");
					file.write(content2+"\n");
					file.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("파일로 저장하는 중 문제 발생");
				}
				
				
			}
		});

		f.add(day);
		f.add(dayText);
		f.add(title);
		f.add(titleText);
		f.add(content);
		f.add(contentText);
		f.add(btn);

		f.setVisible(true);
	}

}
