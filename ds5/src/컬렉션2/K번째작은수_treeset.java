package 컬렉션2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째작은수_treeset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("k입력");
		int k = sc.nextInt(); // k번째큰수
		TreeSet<Integer> tree = new TreeSet<Integer>();
		System.out.println("list입력");
		while (true) {
			int data = sc.nextInt();
			if (data == 0) {
				break;
			} else {
				tree.add(data);
			}
		}
		Object[] arr = tree.toArray();
		System.out.println(arr[k-1]);
	}

}
