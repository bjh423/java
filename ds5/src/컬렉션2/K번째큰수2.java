package 컬렉션2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class K번째큰수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); //입력할개수
		int k = sc.nextInt(); //k번째큰수
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num); //원본을 정렬해서 저장
		System.out.println(k + "번째 큰 수" + num[num.length-k]);
	}

}
