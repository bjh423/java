package 문자열;

import java.util.*;

public class StringBuliderTest2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("pongpong");
		System.out.println(sb1);

		StringBuilder sb11 = new StringBuilder("pongpong");
		System.out.println(sb11);

		StringBuilder sb2 = new StringBuilder("pongpong");
		System.out.println(sb2);

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		sb1.append("qwe");
		System.out.println(sb1);
		sb1.replace(0, 8, "abcdefgh");
		System.out.println(sb1);

		sb1.delete(0, 4);
		System.out.println(sb1);

		sb1.deleteCharAt(4);
		System.out.println(sb1);

		sb1.reverse();
		System.out.println(sb1);

		String x = sb1.toString();
		String[] xx = x.split("");
		List<String> list = Arrays.asList(xx);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

		String s = "asdaquovlzmsb";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String s2 = new String(c);
		System.out.println(s2);

	}

}
