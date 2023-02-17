package 스레드종합;

public class 타이머3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("3번 스레드 : " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("에러 발생");
			}
		}
	}
}
