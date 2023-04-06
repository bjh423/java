package com.multi.mvc00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class WebtoonDao {
	WebtoonVO bag = new WebtoonVO();

	public int insert(WebtoonVO bag) {
		System.out.println("시작");
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "insert into Webtoon values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getCartoonist());
			ps.setString(4, bag.getStar());
			ps.setString(5, bag.getImg());

			System.out.println("3. sql문 부품(객체)로 만들기");
			System.out.println(bag);

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

	public int delete(String id) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "delete from Webtoon where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
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

	public int update(WebtoonVO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "update Webtoon set title = ?,cartoonist=?,star=?,img=? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getCartoonist());
			ps.setString(3, bag.getStar());
			ps.setString(4, bag.getImg());
			ps.setString(5, bag.getId()+"");
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

	public WebtoonVO one(int id) {
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		WebtoonVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "select * from Webtoon where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id+"");
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			if (rs.next()) { // 검색결과가 있는가? true = 있다, false = 없다
				System.out.println("검색결과 있음");
				String id2 = rs.getString(1);
				String title2 = rs.getString(2);
				String ist2 = rs.getString(3);
				String star2 = rs.getString(4);
				String img2 = rs.getString(5);
				System.out.println(id2 + " " + title2 + " " + ist2 + " " + star2 + " " + img2);

				bag = new WebtoonVO();
				bag.setId(id2);
				bag.setTitle(title2);
				bag.setCartoonist(ist2);
				bag.setStar(star2);
				bag.setImg(img2);
			} else {
				System.out.println("검색결과 없음");
			}
		} catch (Exception e) {
			System.out.println("검색 중 문제 발생");
		}
		return bag;
	}

	public ArrayList<WebtoonVO> list() {
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		ArrayList<WebtoonVO> list = new ArrayList<>(); // WebtoonVO만 들어간 arraylist
		WebtoonVO bag = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "select * from Webtoon ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			while (rs.next()) { // 검색결과가 있는가? true = 있다, false = 없다
				String id2 = rs.getString(1);
				String title2 = rs.getString(2);
				String ist2 = rs.getString(3);
				String star2 = rs.getString(4);
				String img2 = rs.getString(5);
				//System.out.println(id2 + " " + title2 + " " + ist2 + " " + star2 + " " + img2);

				bag = new WebtoonVO();
				bag.setId(id2);
				bag.setTitle(title2);
				bag.setCartoonist(ist2);
				bag.setStar(star2);
				bag.setImg(img2);

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
