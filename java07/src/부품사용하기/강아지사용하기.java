package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {
	public static void 강아지클래스사용(String[] args) {
		강아지 까꼬 = new 강아지();
		까꼬.color = "gold";
		까꼬.height = 30;
		까꼬.type = "웰시코기";
		까꼬.roar();
		까꼬.sleep();

		강아지 봄이 = new 강아지();
		봄이.color = "black and white";
		봄이.height = 50;
		봄이.type = "허스키";
		봄이.roar();
		봄이.sleep();
	}
}
