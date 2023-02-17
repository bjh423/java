package 스레드종합;

public class 타이머2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("2번 스레드 : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("에러 발생");
			}
		}
	}
}
