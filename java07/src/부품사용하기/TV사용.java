package 부품사용하기;

import 부품만들기.TV;

public class TV사용 {
	public static void main(String[] args) {
		TV 거실 = new TV();
		거실.ch = 10;
		거실.vol = 9;
		거실.onOff = true;
		거실.채널변경();
		System.out.println(거실.ch + " " + 거실.vol + " " + 거실.onOff);

		TV 안방 = new TV();
		안방.ch = 20;
		안방.vol = 15;
		안방.onOff = false;
		안방.채널변경();
		System.out.println(안방.ch + " " + 안방.vol + " " + 안방.onOff);
	}
}
