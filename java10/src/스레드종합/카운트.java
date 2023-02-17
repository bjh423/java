package 스레드종합;

public class 카운트 extends Thread {

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트 : " + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제");
			}

		}
	}
}
