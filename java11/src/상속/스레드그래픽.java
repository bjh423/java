package 상속;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	JLabel count, image, time;

	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽();
		// 객체 생성시 클래스 이름과 동일 메서드를 자동호출
	}

	// 방법1
	public 스레드그래픽() {
		setTitle("asd");
		setSize(600, 400);

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		Font font = new Font("굴림", 1, 20);
		count = new JLabel("카운터");

		ImageIcon icon = new ImageIcon("1.jpg");
		image = new JLabel(icon);
		time = new JLabel("시분초");
		count.setFont(font);
		time.setFont(font);

		타이머스레드2 time2 = new 타이머스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		카운트스레드2 count2 = new 카운트스레드2();

		count2.start();
		image2.start();
		time2.start();

		add(count);
		add(image);
		add(time);

		setVisible(true);
	}

	public class 카운트스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트 >> " + i);
				;
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제");
				}

			}
		}
	}

	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				Date date = new Date();
				time.setText(date + "");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제");
				}

			}
		}
	}

	public class 이미지스레드2 extends Thread {

		@Override
		public void run() {
			String[] images = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg" };
			for (double i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[(int) i]);
				image.setIcon(icon);
				if (i == images.length - 1) {
					i = -1;
				}

				try {
					Thread.sleep(5000); // 5초재워라! //ms(밀리세컨즈)
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

}
