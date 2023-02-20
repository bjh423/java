package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또2 {
	public static void main(String[] args) {
		Random r = new Random(42);
		HashSet lotto = new HashSet();

		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add(r.nextInt(45) + 1);
		}
		System.out.println(lotto);

	}
}
