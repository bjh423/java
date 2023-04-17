package 문자열;

import java.util.*;

public class 가장긴단어 {

	public static void main(String[] args) {
		String s = "i am a boy";
		String[] x = s.split(" ");
		int max = 0;
		String maxString = "";
		
		
		for (int i = 0; i < x.length; i++) {
			if (max<x[i].length()) {
				max = x[i].length();
				maxString = x[i];
			}
		}
		System.out.println(maxString);
	}

}