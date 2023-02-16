package 확인문제3;

public class CoffeeTruck extends Truck {

	static String sort = "커피트럭";

	@Override
	public void name() {
		System.out.println("이것은 커피트럭입니다.");
	}

	@Override
	public void dur() {
		System.out.println("트럭은 튼튼한데 커피기계는 아닐수도");
	}

	public void cost() {
		System.out.println("커피 한잔에 500원");
	}

}
