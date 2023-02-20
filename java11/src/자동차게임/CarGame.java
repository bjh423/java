package 자동차게임;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public static void main(String[] args) {
		CarGame f = new CarGame();
	}

	public CarGame() {
		setTitle("자동차 경주");
		setSize(700, 350);
		setLayout(null);
		getContentPane().setBackground(Color.white);

		MyThread car1 = new MyThread("car01.png", 0, 0);
		MyThread car2 = new MyThread("car01.png", 0, 100);
		MyThread car3 = new MyThread("car01.png", 0, 200);

		car1.start();
		car2.start();
		car3.start();

		setVisible(true);
	}

	public class MyThread extends Thread {

		int x, y;
		JLabel label;

		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon name = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(name);
			label.setBounds(x, y, 100, 100);
			add(label);
		}

		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50);
				x = x + move;
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
