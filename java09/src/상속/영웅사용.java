package 상속;

public class 영웅사용 {
	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();

		맨 m = new 맨();
		m.power = 100000;
		m.run();

		슈퍼우먼 x = new 슈퍼우먼();
		x.age = 25;
		x.setGen();
		x.name = "";
		x.fly();
		x.power = 20000000;
		System.out.println(x);

	}
}
