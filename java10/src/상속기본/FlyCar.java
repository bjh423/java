package 상속기본;

public class FlyCar extends Car {
	String color;

	@Override
	public void ride() {
		System.out.println("하늘을 달리다");
	}

	@Override
	public String toString() {
		return "FlyCar [color=" + color + ", wheel=" + wheel + ", name=" + name + "]";
	}
	
	
}
