package 생성자;

public class 창업 {

	public static void main(String[] args) {

		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 24, "남");
		직원 work3 = new 직원("송길동", 26, "여");

		System.out.println(work1 + "\n" + work2 + "\n" + work3);
		System.out.println("직원 수 : " + 직원.count);
		System.out.println("나이 평균 : " + (double) 직원.ageSum / 직원.count);
		
		
	}

}
