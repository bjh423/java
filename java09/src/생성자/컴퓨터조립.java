package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 x = new 컴퓨터(200,"삼성",25);
		x.가격 = 300;
		x.모니터크기 =30;
		x.제조회사 = "우리집";
		
		System.out.println(x);
	}

}
