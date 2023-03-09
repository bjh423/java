package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import 화면DB연결.MP_StaffVO;

public class MP_StaffDAO {
	MP_StaffVO bag = new MP_StaffVO();

	// insert
	public int insert(MP_StaffVO bag, String Lock) { // 관리자 가입, Lock는 유저가 입력한 인증코드
		int result = 0; // insert 성공시 1, 실패시 0
		ResultSet rs = null;
		MP_StaffVO Stf_Bag = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 로그인 성공");

			String sql = "SELECT TEL FROM HR.MP_STA WHERE CODE = ?;"; // 인증코드 확인절차
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getLevel()+"");

			System.out.println("3.1 인증코드 관련 sql문 객체화 완료");
			System.out.println(sql);
			rs = ps.executeQuery();

			System.out.println("4.1 인증코드 관련 sql문 전송 성공");
			
			if (rs.getString(1).equals(Lock)) {// 설정한 직책의 tel(인증코드)와 입력한 인증코드가 같다면 회원가입 진행

				String sql2 = "INSERT INTO MP_STA VALUES(MP_STA_ID_SEQ.nextval,?,?,?,?,?);";// code,id,pw,name,tel,level
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setString(1, bag.getId());
				ps2.setString(2, bag.getPw());
				ps2.setString(3, bag.getName());
				ps2.setString(4, bag.getTel());
				ps2.setInt(5, bag.getLevel());
				System.out.println("3. sql문 객체화 완료");

				result = ps.executeUpdate();
				System.out.println("4. sql문 전송 성공");
				if (result == 1) {
					System.out.println("회원가입 성공");
				}
			} else {
				System.out.println("잘못된 인증코드 입력");
				JOptionPane.showMessageDialog(null, "잘못된 인증코드입니다.");
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

		return result;
	}

	// delete
	public int delete(MP_StaffVO bag) { // STA테이블에서 code를 통해 관리자를 삭제, 1,2,3,4는 삭제 못하게 막기?
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "delete from hr.MP_STA where code = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getCode());
			System.out.println("3. sql문 부품(객체)로 만들기");
			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("관리자삭제 성공");
			}
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

	// update
	public int update(MP_StaffVO bag, String Lock) { // 관리자 정보 수정
		int result = 0;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "select tel from hr.MP_STA where id = ? );"; // 인증코드 확인절차
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getLevel());
			rs = ps.executeQuery();
			if (rs.getString(1).equals(Lock)) {// 설정한 직책의 tel(인증코드)와 입력한 인증코드가 같다면 정보수정

				String sql2 = "update hr.MP_STA set id = ?, pw = ? ,name = ? , tel = ?, level = ? where code = ? ";
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setString(1, bag.getId());
				ps2.setString(2, bag.getPw());
				ps2.setString(3, bag.getName());
				ps2.setString(4, bag.getTel());
				ps2.setInt(5, bag.getLevel());
				ps2.setInt(6, bag.getCode());
				System.out.println("3. sql문 부품(객체)로 만들기");

				result = ps2.executeUpdate();
				if (result == 1) {
					System.out.println("회원정보 수정 성공");
				}
			} else {
				System.out.println("잘못된 인증코드 입력");
				JOptionPane.showMessageDialog(null, "잘못된 인증코드입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

	// search
	public MP_StaffVO one(int code) { // 구현만, 사용x?
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		MP_StaffVO bag = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "select * from hr.mp_sta where code = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, code);
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			if (rs.next()) { // 검색결과가 있는가? true = 있다, false = 없다
				System.out.println("검색결과 있음");
				String id2 = rs.getString(2);
				String pw2 = rs.getString(3);
				String name2 = rs.getString(4);
				String tel2 = rs.getString(5);
				int level = rs.getInt(6);
				String level2 = null;
				switch (level) {
				case 1:
					level2 = "점장";
					break;
				case 2:
					level2 = "매니저";
					break;
				case 3:
					level2 = "정직원";
					break;
				case 4:
					level2 = "아르바이트";
					break;
				default:
					break;
				}

				System.out.println(id2 + " " + pw2 + " " + name2 + " " + tel2 + " " + level2);

				bag = new MP_StaffVO();
				bag.setId(id2);
				bag.setName(name2);
				bag.setPw(pw2);
				bag.setTel(tel2);
				bag.setLevel(level);
			} else {
				System.out.println("검색결과 없음");
			}
		} catch (Exception e) {
			System.out.println("검색 중 문제 발생");
		}
		return bag;
	}
	

}
