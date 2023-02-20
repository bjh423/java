package 자동차게임;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyThread extends Thread {

	int x, y;
	JLabel label;

	public MyThread(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon name = new ImageIcon(file);
		label.setIcon(name);
		label.setBounds(x, y, 100, 100);
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
