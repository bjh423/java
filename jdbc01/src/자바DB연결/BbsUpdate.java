package 자바DB연결;

import java.util.Scanner;

public class BbsUpdate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("no content순으로 입력.");

		String no = sc.next();
		String content = sc.next();

		BbsDao dao = new BbsDao();
		dao.update(no, content);
	}

}