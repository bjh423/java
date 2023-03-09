package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import 화면DB연결.BbsVO;

public class BbsDao {
	public void insert(/* String no, */ String title, String content, String writer) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "insert into hr.BBS values (hr.BBS_ID_SEQ.nextVal,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			// ps.setString(1, no);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);

			System.out.println("3. sql문 부품(객체)로 만들기");

			ps.executeUpdate();
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete(String no) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "delete from hr.BBS where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, no);
			System.out.println("3. sql문 부품(객체)로 만들기");

			ps.executeUpdate();
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(String no, String content) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "update hr.BBS set content = ? where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setString(2, no);
			System.out.println("3. sql문 부품(객체)로 만들기");

			ps.executeUpdate();
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BbsVO one(int no) {
		ResultSet rs = null;
		BbsVO bag = new BbsVO();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클연결 성공");

			String sql = "select * from hr.BBS where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, no + "");
			System.out.println("3. sql문 부품(객체)로 만들기");
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");

			if (rs.next()) {
				System.out.println("검색 성공");
				bag.setNo(rs.getInt(1));
				bag.setTitle(rs.getString(2));
				bag.setContent(rs.getString(3));
				bag.setWriter(rs.getString(4));
			} else {
				System.out.println("검색 실패");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bag;
	}

}
/*
 * 1. JDBC4단계 정리 : 드라이버 연결 -> 오라클 로그인 -> sql객체 생성 -> 객체 전송 2. 데이터를 접근해서 처리하는
 * 클래스를 부르는 이름 : DAO(data access object) 3. DAO에 주로 넣는 기능 - 4가지 : crud 4. DAO에
 * 주로 넣는 기능 중 C(insert)만 사용해봄. : String x = "insert into 테이블 values(입력할 값,값,값)"
 * 5. sql를 객체를 만들었을 때 모르는 값을 표현하는 연산자. : ?
 */
