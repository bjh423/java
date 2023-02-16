package 확인문제3;

public class Truck extends Car {

	static String sort = "트럭";

	@Override
	public void name() {
		System.out.println("이것은 트럭입니다.");
	}

	public void dur() {
		System.out.println("튼튼하다");
	}

}
