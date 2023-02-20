package 형변환;

import java.util.LinkedList;

public class 냉장고우유2 {

	public static void main(String[] args) {
		LinkedList x = new LinkedList();
		x.add("국어");
		x.add("수학");
		x.add("영어");
		x.add("컴퓨터");

		for (; 0 < x.size() + 1;) {
			System.out.println(x);

			if (x.size() == 0) {
				break;
			}

			x.remove();

		}

	}

}
