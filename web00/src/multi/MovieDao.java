package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//import 화면DB연결.MovieVO;

public class MovieDao {
	MovieVO bag = new MovieVO();

	public int insert(MovieVO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "insert into Movie values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getLocation());
			ps.setString(5, bag.getDirector());

			System.out.println("3. sql문 부품(객체)로 만들기");

			result = ps.executeUpdate();

			System.out.println("4. sql문 전송 성공");

			if (result == 1) {
				System.out.println("회원가입 성공");
			}

		} catch (Exception e) {
			// insert가 실패한 경우, 실행
			result = 0;
			// e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public int delete(MovieVO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "delete from Movie where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 부품(객체)로 만들기");

			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("회원탈퇴 성공");
			}
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result = 0;
			// e.printStackTrace();
		}
		return result;
	}

	public int update(MovieVO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "update Movie set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getContent());
			ps.setString(2, bag.getId());
			System.out.println("3. sql문 부품(객체)로 만들기");

			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("회원정보 수정 성공");
			}
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

	public MovieVO one(String id) {
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		MovieVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "select * from Movie where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			if (rs.next()) { // 검색결과가 있는가? true = 있다, false = 없다
				System.out.println("검색결과 있음");
				String id2 = rs.getString(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3);
				String location2 = rs.getString(4);
				String director = rs.getString(5);

				bag = new MovieVO();
				bag.setId(id2);
				bag.setTitle(title2);
				bag.setContent(content2);
				bag.setLocation(location2);
				bag.setDirector(director);
			} else {
				System.out.println("검색결과 없음");
			}
		} catch (Exception e) {
			System.out.println("검색 중 문제 발생");
		}
		return bag;
	}

	public int login(MovieVO bag) {
		ResultSet rs = null;
		int result = 0; // 로그인 실패시
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "select pw,name from Movie where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 부품(객체)로 만들기");

			rs = ps.executeQuery();
			if (rs.next()) { // 검색 성공
				System.out.println("아이디 존재");
				if (bag.getId().equals(rs.getString(1))) {// 비밀번호 일치
					JOptionPane.showMessageDialog(null, "환영합니다 " + rs.getString(2) + "님");
					result = 1;
				} else {// 비밀번호 불일치
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.");
			}
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

	public ArrayList<MovieVO> list() {
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		ArrayList<MovieVO> list = new ArrayList<>(); // MovieVO만 들어간 arraylist
		MovieVO bag = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "select * from Movie ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			while (rs.next()) { // 검색결과가 있는가? true = 있다, false = 없다
				String id2 = rs.getString(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3);
				String location2 = rs.getString(4);
				String director = rs.getString(5);

				bag = new MovieVO();
				bag.setId(id2);
				bag.setTitle(title2);
				bag.setContent(content2);
				bag.setLocation(location2);
				bag.setDirector(director);

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
