package 상속;

import java.util.Date;

public class 타이머 extends Thread {

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			Date date = new Date();
			System.out.println("타이머 >> " + date);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제");
			}

		}
	}
}
