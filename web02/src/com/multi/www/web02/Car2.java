package com.multi.www.web02;

public class Car2 {
	// 멤버변수
	// 멤버메서드
	// toString()
	// 객체 생성시 멤버 변수값을 한번에 투입하고 싶다
	// -> 객체 생성시 자동 호출되는 메서드 추가 (=생성자)

	String color;
	int price;
	int speed;
	public static Car2 car2;
	// static : 변수를 하나만 만들 때
	// public : 제공하는 car2를 어디서나 쓸 수 있음

	// 싱글톤은 해당 클래스에서 하나만 만들어서 제공

	public static Car2 getInstance() {
		if(car2 == null) {
		car2 = new Car2("빨강", 100, 110);
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달린다");
	}

	public Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

}
