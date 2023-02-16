package 상속;

public class 우먼 extends 사람 {
	int power;

	public void eat() {
		System.out.println("밥을 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("잘 잔다");
	}

	public void gen() {
		System.out.println("여성이다");
	}

	public void setGen() {
		this.gen = '여';
	}
}
