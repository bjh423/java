package 상속응용;

public class 동시실행 {

	public static void main(String[] args) {
		골뱅이 골뱅이 = new 골뱅이();
		달러 달러 = new 달러();
		앤드 앤드 = new 앤드();
		
		골뱅이.start();
		달러.start();
		앤드.start();

	}

}
