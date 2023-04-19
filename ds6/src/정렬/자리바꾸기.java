package 정렬;

import java.util.Arrays;

public class 자리바꾸기 {

	public static void main(String[] args) {
		int[] num = {6,1,2,3,4,5,9};
		System.out.println(Arrays.toString(num));
		
		int temp = num[5];
		num[5] = num[0];
		num[0] = temp;
		System.out.println(Arrays.toString(num));

	}
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
	
	public static void print(String[] num) {
		System.out.println(Arrays.toString(num));
	}

}

