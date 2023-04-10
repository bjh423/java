package 배열;

public class 배열최소최대 {

	public static void main(String[] args) {
		int min = 99;
		int[] s = {89,80,20,60,70};

		for (int i = 0; i < s.length; i++) {
			if (s[i]<min) {
				min = s[i];
			}
		}
		System.out.println(min);
	}
}
