package 상속응용;

public class 달러 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("$");
		}
	}
}
