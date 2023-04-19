package 정렬;

import java.util.Arrays;

public class 자리바꾸기2 {

	public static void main(String[] args) {
		String[] num = {"햄버거","샌드위치","커피"};
		print(num);
		
		swap(num,0,1);
		print(num);

	}
	
	public static void swap(int[] x, int a, int b) {
		int temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}
	
	public static void swap(String[] x, int a, int b) {
		String temp = x[a];
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

