package 자바DB연결;

import java.util.Scanner;

public class BbsDelete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 no 입력");

		String no = sc.next();

		BbsDao dao = new BbsDao();
		dao.delete(no);
	}

}