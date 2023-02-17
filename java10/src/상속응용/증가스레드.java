package 상속응용;

public class 증가스레드 extends Thread {
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("증가>> " + i);
		}
	}
}
