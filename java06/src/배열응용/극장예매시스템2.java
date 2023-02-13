package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);
		f.setSize(600,1200); //화면 사이즈
		f.setTitle("극장예매시스템");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton[] btn = new JButton[200]; // 좌석 수
		int[] seat = new int[btn.length]; // 0 : 예약x , 1 : 예약
		
		Font font = new Font("굴림",1,20);
		
		JLabel result = new JLabel("결과");
		result.setForeground(Color.cyan);
		result.setFont(font);
		
		
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton((i+1) + "");
			btn[i].setFont(font);
			f.add(btn[i]);
			
			
			
			
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);
					if(seat[no-1] == 1) {
						result.setText("이미 예약된 좌석");
					}else {
						result.setText(text + "번 예약완료");
						seat[no-1] = 1;
						btn[no-1].setBackground(Color.red);
						btn[no-1].setEnabled(false);
					}
				
				}
			});
		}

		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setFont(font);
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = 0;
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						x++;
					}
				}
				JOptionPane.showMessageDialog(f, "남은 자리 수 : " + (seat.length-x) + "\n" + x + "만원 결제 필요" );
				
			}
		});
		
		f.setVisible(true);
	}
}