package 스레드종합;

public class 사진 extends Thread {

	@Override
	public void run() {
		String[] images = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg"};
		for (double i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[(int)i]);
			if (i==images.length-1) {
				i=-1;
			}
			
			
			try {
				Thread.sleep(5000); //5초재워라! //ms(밀리세컨즈)
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
