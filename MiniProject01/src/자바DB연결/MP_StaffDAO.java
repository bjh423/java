package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import 화면DB연결.MP_StaffVO;

public class MP_StaffDAO {
	MP_StaffVO bag = new MP_StaffVO();

	public int codeCheck(int rank, String code) {// 직책과 그에맞는 인증코드를 비교하는 메소드, 0성공 1불일치 2오류발생
		int result = 1;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "select TEL from hr.MP_STA where CODE = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, rank + "");
			rs = ps.executeQuery();

			// rs.getString(1) : 사용자가 입력한 rank 에 맞는 인증코드
			// code = 유저가 입력한 코드
			if (rs.next()) {
				if (rs.getString(1).equals(code)) {
					result = 0;
				} else {
					result = 1;
					System.out.println("인증코드 불일치");
				}
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
			result = 2;
		}
		System.out.println("인증코드 확인 종료");
		return result;
	}

	// insert
	public int insert(MP_StaffVO bag) { // 관리자 가입
		int result = 0; // insert 성공시 1, 실패시 0

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 로그인 성공");

			String sql = "INSERT INTO HR.MP_STA VALUES(HR.MP_STA_ID_SEQ.nextval, ? , ? , ? , ? , ? ) ";// code,id,pw,name,tel,rank
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			ps.setInt(5, bag.getRank());
			System.out.println("3. sql문 객체화 완료");

			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 성공");

			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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

			String sql = "delete from hr.MP_STA where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 부품(객체)로 만들기");
			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("관리자삭제 성공");
			}
			System.out.println("4. sql문 전송 성공");
			ps.close();
			con.close();
		} catch (Exception e) {
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

	// update
	public int update(MP_StaffVO bag, String PreID) { // 관리자 정보 수정 (변경 후 정보, 변경 전 아이디)
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "update HR.MP_STA SET ID=?, PW=?, NAME=?, TEL=?, STA_RANK=? where ID=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			ps.setInt(5, bag.getRank());
			ps.setString(6, PreID);
			System.out.println("3. sql문 부품(객체)로 만들기");

			result = ps.executeUpdate();
			System.out.println("4. sql문 전송");

			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

	// search
	public int login(String id, String pw) { // 아이디 비밀번호 일치 확인, 0일치 1아이디없음 2비밀번호 틀림
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		int result = 1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "select pw from hr.mp_sta where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			if (rs.next()) {// 아이디 있음

				if (rs.getString(1).equals(pw)) {// 가져온 패스워드 = 원래 패스워드
					result = 0;
				} else {
					result = 2;
				}

			} else {// 아이디 없음
				result = 1;
			}

			ps.close();
			con.close();
			rs.close();

		} catch (Exception e) {
			System.out.println("검색 중 문제 발생");
		}
		System.out.println("로그인 정보 확인 종료");
		return result;
	}

	public ArrayList<MP_StaffVO> search() {
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		ArrayList<MP_StaffVO> list = new ArrayList<>(); //MP_StaffVO만 들어간 arraylist
		MP_StaffVO bag = null;
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "select * from hr.MP_STA WHERE code>4 ORDER BY CODE";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			while (rs.next()) { // 검색결과가 있는가? true = 있다, false = 없다
				int code = rs.getInt(1);
				String id = rs.getString(2);
				String pw = rs.getString(3);
				String name = rs.getString(4);
				String tel = rs.getString(5);
				int rank = rs.getInt(6);
				
				bag = new MP_StaffVO();
				bag.setCode(code);
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				bag.setRank(rank);
				
				list.add(bag);
			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("검색 중 문제 발생");
		}
		return list;
	}
}
