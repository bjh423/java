package 배열심화;

public class 깊은복사 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };
		int[] num2 = num;
		int[] num3 = num.clone();
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		
		for (int i = 0; i < num3.length; i++) {
			System.out.println("\n" + num[i] + "\t" + num2[i] + "\t" + num3[i]);
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		num[0] = 0;
		
		for (int i = 0; i < num3.length; i++) {
			System.out.println("\n" + num[i] + "\t" + num2[i] + "\t" + num3[i]);
		}

	}

}
