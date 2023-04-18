package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_중복o_정렬o {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); //입력할개수
		int k = sc.nextInt(); //k번째큰수
		TreeSet<Integer> set = new TreeSet<Integer>(); //오름차순
		TreeSet<Integer> set2 = new TreeSet<Integer>(Collections.reverseOrder()); //내림차순
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		Arrays.sort(num); //원본을 정렬해서 저장
		System.out.println(k + "번째 큰 수" + num[num.length-k]);
	}

}
