package 배열;

public class 배열2 {

	public static void main(String[] args) {
		
		int[] x = new int[5];					// 1
		System.out.println(x.length);			// 2
		x[0] = 100; System.out.println(x[0]);	// 3
		x[4] = 500; System.out.println(x[4]);	// 4
		x[2] = 200; System.out.println(x[2]);	// 5
		for (int i = 0; i < x.length; i++) {	// 6
			System.out.println(x[i] + " ");
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println("인덱스 " + i + ": " + x[i]);	// 7
		}
		
	}

}
