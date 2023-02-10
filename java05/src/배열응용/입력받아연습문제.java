package 배열응용;

public class 입력받아연습문제 {
	public static void main(String[] args) {

		String[] a = { "a", "b", "c", "d", "e" };
		int[] b = { 1, 2, 3, 4, 5 };
		double[] c = { 0.1, 0.2, 0.3, 0.4, 0.5 };

		for (int i = 0; i < c.length; i++) {
			System.out.println(a[i] + "\t" + b[i] + "\t" + c[i]);
		}

	}
}