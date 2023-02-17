package 상속응용;

public class 스레드사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		감소스레드 감소 = new 감소스레드();
		증가스레드 증가 = new 증가스레드();
		
		감소.start();
		증가.start();

	}

}
