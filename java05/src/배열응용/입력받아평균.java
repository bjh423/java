package 배열응용;

import java.util.Random;

public class 입력받아평균 {
	public static void main(String[] args) {
		Random r = new Random(42);
		
		int[] x = new int[10000];
		
		int a = 0;
		int z = 0; //0점
		int sum = 0; //합계
		int y = 0; //평균+-50
		
		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(451); //점수넣기
		}
		
		System.out.print("만점자 : ");
		for (int i = 0; i < x.length; i++) {
			
			sum = sum+x[i]; //합계추가
			
			if (x[i] == 450) {
				a++;
				System.out.print((i+1) + "번 "); //만점자
			}else if (x[i]==0) {
				z++; // 0점자
			}
			
		}
		
		double av = (double)sum/10000;
		
		System.out.println();
		System.out.println("만점자 : " + a + "명");
		System.out.println("0점 : " + z + "명");
		System.out.println("평균 : " + av);
		
		for (int i = 0; i < x.length; i++) {
			if ( x[i] <= (av+50) && x[i] >= (av-50)) {
				y++;
			}
		}
		System.out.println("평균 +-50은 " + y + "명");
		
		
	}
}
