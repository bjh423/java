package 확인문제3;

public class 내차들 {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.sort);
		System.out.println(c1.wheel);
		c1.name();
		c1.drive();

		System.out.println("");

		Truck c2 = new Truck();
		System.out.println(c2.sort);
		System.out.println(c2.wheel);
		c2.name();
		c2.drive();
		c2.dur();

		System.out.println("");

		CoffeeTruck c3 = new CoffeeTruck();
		System.out.println(c3.sort);
		System.out.println(c3.wheel);
		c3.name();
		c3.drive();
		c3.dur();
		c3.cost();

		System.out.println("");
	}

}
