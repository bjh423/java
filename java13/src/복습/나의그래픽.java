package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트 처리");
		f.setSize(300,200);
		JButton b = new JButton("버 튼");
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("클릭");
				
			}
		});
		
		
		
		f.add(b);
		
		f.setVisible(true);
	}

}
