package 자바DB연결;

import javax.swing.JOptionPane;

import 화면DB연결.BbsUI2;
import 화면DB연결.MemberUI3;
import 화면DB연결.MemberVO;

public class Login {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("비밀번호 입력");
		MemberDao3 dao = new MemberDao3();
		MemberVO bag = new MemberVO();
		bag.setId(id);
		bag.setPw(pw);
		int result = dao.login(bag);
		if (result == 1) {
			BbsUI2 bbs = new BbsUI2();
			bbs.open();
		}else {
			MemberUI3 member = new MemberUI3();
			member.open();
		}

	}

}
