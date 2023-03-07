package 자바DB연결;

import java.util.Scanner;

public class BbsCreate {

	public static void main(String[] args) {
		//System.out.println("번호, 제목, 내용, 작성자 순으로 입력");
		System.out.println("제목, 내용, 작성자 순으로 입력");
		Scanner sc = new Scanner(System.in);

		/*String no = sc.next();*/
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();

		BbsDao dao = new BbsDao();
		dao.insert(title, content, writer);

	}

}

