package 자바DB연결;

import java.util.Scanner;

public class 회원정보수정 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("id tel순으로 입력.");
		
		String id = sc.next();
		String tel = sc.next();
		
		MemberDao2 dao = new MemberDao2();
		dao.update(id, tel);
	}

}