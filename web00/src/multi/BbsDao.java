package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDao {
	public void insert(BbsVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "insert into bbs(title, content, writer) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());

			System.out.println("3. sql문 부품(객체)로 만들기");

			ps.executeUpdate();
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete(int no) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "delete from bbs where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. sql문 부품(객체)로 만들기");

			ps.executeUpdate();
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(BbsVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "update bbs set content = ? where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());
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
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "select * from bbs where no = ? ";
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

	public ArrayList<BbsVO> list() {
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		ArrayList<BbsVO> list = new ArrayList<>(); // BbsVO만 들어간 arraylist
		BbsVO bag = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "select * from Bbs ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			while (rs.next()) { // 검색결과가 있는가? true = 있다, false = 없다
				int no = Integer.parseInt(rs.getString(1));
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);

				bag = new BbsVO();
				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

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
/*
 * 1. JDBC4단계 정리 : 드라이버 연결 -> 오라클 로그인 -> sql객체 생성 -> 객체 전송 2. 데이터를 접근해서 처리하는
 * 클래스를 부르는 이름 : DAO(data access object) 3. DAO에 주로 넣는 기능 - 4가지 : crud 4. DAO에
 * 주로 넣는 기능 중 C(insert)만 사용해봄. : String x = "insert into 테이블 values(입력할 값,값,값)"
 * 5. sql를 객체를 만들었을 때 모르는 값을 표현하는 연산자. : ?
 */
