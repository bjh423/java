package 정렬;

import java.util.Arrays;

public class 자리바꾸기3 {

	public static void main(String[] args) {
		int[] num = {6,1,2,3,4,5,9};
		print(num);
		
		swap(num,0,6);
		print(num);

	}
	
	public static void swap(int[] x, int a, int b) {
		int temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
	
	public static void print(String[] num) {
		System.out.println(Arrays.toString(num));
	}

}

