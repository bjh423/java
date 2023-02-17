package 상속응용;

public class 이름스레드 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + "방준호");
		}
	}
}
