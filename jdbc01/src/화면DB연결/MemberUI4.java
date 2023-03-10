package 화면DB연결;

import java.util.ArrayList;

import 자바DB연결.MemberDao3;

public class MemberUI4 {

	public static void main(String[] args) {
		MemberDao3 dao = new MemberDao3();
		ArrayList<MemberVO> list = dao.list();
		if(list.size() == 0) {
			System.out.println("검색 결과 없음");
		}else {
			System.out.println("총 " + list.size() + "개의 검색결과가 있습니다.");
			
			for (MemberVO bag : list) {
				System.out.println(bag.getId());
				System.out.println(bag.getPw());
				System.out.println(bag.getName());
				System.out.println(bag.getTel());
				System.out.println("-------------");
			}
		}

	}

}
