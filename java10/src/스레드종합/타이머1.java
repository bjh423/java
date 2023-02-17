package 스레드종합;

public class 타이머1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("1번 스레드 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("에러 발생");
			}
		}
	}
}
