package 상속응용;

public class 스레드사용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		별스레드 별 = new 별스레드();
		이름스레드 이름 = new 이름스레드();
		
		별.start();
		이름.start();

	}

}
