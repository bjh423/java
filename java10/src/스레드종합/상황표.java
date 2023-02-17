package 스레드종합;

public class 상황표 {
	public static void main(String[] args) {
		카운트 count = new 카운트();
		타이머 timer = new 타이머();
		사진 img = new 사진();
		
		img.start();
		count.start();
		timer.start();
	}
}
