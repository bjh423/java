package 스레드종합;

public class 타이머종합 {

	public static void main(String[] args) {
		타이머1 t1 = new 타이머1();
		타이머2 t2 = new 타이머2();
		타이머3 t3 = new 타이머3();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
