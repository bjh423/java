package 상속;

public class 슈퍼우먼 extends 우먼 {
	public void fly() {
		System.out.println("하늘을 날다.");
	}

	@Override
	public void eat() {
		System.out.println("밥을 잘 먹는다.");
	}

	@Override
	public String toString() {
		return "슈퍼우먼 [power=" + power + ", name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
}
