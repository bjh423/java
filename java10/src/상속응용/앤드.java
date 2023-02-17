package 상속응용;

public class 앤드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("&");
		}
	}
}
