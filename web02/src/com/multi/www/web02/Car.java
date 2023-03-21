package com.multi.www.web02;

public class Car {
	//멤버변수
	//멤버메서드
	//toString()
	//객체 생성시 멤버 변수값을 한번에 투입하고 싶다
	//-> 객체 생성시 자동 호출되는 메서드 추가 (=생성자)
	
	String color;
	int price;
	int speed;
	
	public Car(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

	/*@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}
	*/
	

}
