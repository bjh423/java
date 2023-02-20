package 정리;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewCarGame extends JFrame {

	public static void main(String[] args) {
		NewCarGame f = new NewCarGame();
	}

	public NewCarGame() {
		setTitle("새로운 자동차 게임");
		setSize(600, 300);
		getContentPane().setBackground(Color.white);
		setLayout(null);

		NewCar car1 = new NewCar("car01.png", 0, 0);
		NewCar car2 = new NewCar("car01.png", 0, 120);
		NewCar car3 = new NewCar("car01.png", 0, 240);

		car1.start();
		car2.start();
		car3.start();

		setVisible(true);
	}

	public class NewCar extends Thread {
		int x, y;
		String file;
		JLabel label;

		public NewCar(String file, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel();
			ImageIcon icon = new ImageIcon(file);
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
		}

		public void run() {
			Random r = new Random();
			for (int i = 0; i < 500; i++) {
				x = x + (r.nextInt(50) + 1);
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
