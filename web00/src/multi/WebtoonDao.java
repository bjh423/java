package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class WebtoonDao {
	WebtoonVO bag = new WebtoonVO();

	

	public int insert(WebtoonVO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multi?serverTimezone=UTC", "root",
					"1234");
			System.out.println("2.mysql 연결");

			String sql = "insert into webtoon values(?,?,?,?,?) ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getCartoonist());
			ps.setString(4, bag.getStar());
			ps.setString(5, bag.getImg());
			System.out.println("3.sql문 작성");

			result = ps.executeUpdate();
			System.out.println("4.sql문 전송");

			if (result == 1) {
				System.out.println("insert문 작동");
			}

		} catch (Exception e) {
			System.out.println("오류발생");
		}

		return result;
	}

	// delete
	public int delete(String id) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multi?serverTimezone=UTC", "root",
					"1234");
			System.out.println("2.mysql 연결");

			String sql = "delete from webtoon where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, id);
			System.out.println("3.sql문 작성");

			result = ps.executeUpdate();

			if (result == 1) {
				System.out.println("delete문 작동");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	// update
	public int update(WebtoonVO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multi?serverTimezone=UTC", "root",
					"1234");
			System.out.println("2.mysql 연결");

			String sql = "update webtoon set title = ?, cartoonist = ?, star = ?, img = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getCartoonist());
			ps.setString(3, bag.getStar());
			ps.setString(4, bag.getImg());
			ps.setString(5, bag.getId());
			System.out.println("3.sql문 작성");

			result = ps.executeUpdate();

			if (result == 1) {
				System.out.println("update문 작동");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	// one
	public WebtoonVO one(String id) {
		WebtoonVO bag = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multi?serverTimezone=UTC", "root",
					"1234");
			System.out.println("2.mysql 연결");

			String sql = "select * from webtoon where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, id);
			System.out.println("3.sql문 작성");

			rs = ps.executeQuery();
			System.out.println("4.sql문 전송");
			if (rs.next()) {
				bag = new WebtoonVO();
				bag.setId(rs.getString(1));
				bag.setTitle(rs.getString(2));
				bag.setCartoonist(rs.getString(3));
				bag.setStar(rs.getString(4));
				bag.setImg(rs.getString(5));
			}

		} catch (Exception e) {
			System.out.println("오류발생");
		}

		return bag;
	}

	// list
	public ArrayList<WebtoonVO> list() {
		WebtoonVO bag = null;
		ArrayList<WebtoonVO> list = new ArrayList<WebtoonVO>();
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multi?serverTimezone=UTC", "root",
					"1234");
			System.out.println("2.mysql 연결");

			String sql = "select * from webtoon ";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3.sql문 작성");

			rs = ps.executeQuery();
			System.out.println("4.sql문 전송");

			while (rs.next()) {
				bag = new WebtoonVO();

				bag.setId(rs.getString(1));
				bag.setTitle(rs.getString(2));
				bag.setCartoonist(rs.getString(3));
				bag.setStar(rs.getString(4));
				bag.setImg(rs.getString(5));

				list.add(bag);
			}
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("오류발생");
		}

		return list;
	}

}
