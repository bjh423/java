package 컬렉션2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class K번째작은수_list {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("k입력");
		int k = sc.nextInt(); // k번째큰수
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list입력");
		while (true) {
			int data = sc.nextInt();
			if (data == 0) {
				break;
			} else {
				list.add(data);
			}
		}
		Collections.sort(list);// 원본을 정렬해서 저장
		System.out.println(list.get(k-1));
	}

}
