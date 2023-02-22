package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("글자 길이 판독기");
		f.setSize(300, 600);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("굴림", 1, 30);
		Font font2 = new Font("굴림", 1, 15);

		JLabel a = new JLabel("Words : ");
		JTextArea text = new JTextArea("", 20, 20);
		JButton b1 = new JButton("글 자 수");
		JButton b2 = new JButton("배 경 색");
		JButton b3 = new JButton("글 자 색");

		a.setFont(font);
		text.setFont(font2);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(a);
		f.add(text);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String x = text.getText();
				JOptionPane.showMessageDialog(f, "글자수는 " + x.length());
				text.setText("");
			}
		});
		b2.addActionListener(new ActionListener() {
			int x=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				if (x == 0) {
					text.setBackground(Color.black);
					text.setForeground(Color.white);
					x = 1;
				} else {
					text.setBackground(Color.white);
					text.setForeground(Color.black);
					x = 0;
				}
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String x = text.getText();
				JOptionPane.showMessageDialog(f, "글자수는 " + x.length());
				text.setText("");
			}
		});

		f.setVisible(true);

	}

}
