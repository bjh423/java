package com.multi.mvc00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;

@Component
public class BookDao {
	BookDTO dto = new BookDTO();

	public int insert(BookDTO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "insert into Book values (null,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());

			System.out.println("3. sql문 부품(객체)로 만들기");

			result = ps.executeUpdate();

			System.out.println("4. sql문 전송 성공");

			if (result == 1) {
				System.out.println("게시글작성 성공");
			}

		} catch (Exception e) {
			// insert가 실패한 경우, 실행
			result = 0;
			// e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public int delete(int id) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "delete from Book where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id + "");
			System.out.println("3. sql문 부품(객체)로 만들기");

			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("게시글 삭제 성공");
			}
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result = 0;
			// e.printStackTrace();
		}
		return result;
	}

	public int update(BookDTO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "update Book set url = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getUrl());
			ps.setString(2, bag.getId()+"");
			System.out.println("3. sql문 부품(객체)로 만들기");
			

			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("게시글 수정 성공");
			}
			System.out.println("4. sql문 전송 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
	
	public BookDTO one(int id) {
		ResultSet rs = null; // 기본형 : 값으로 초기화, 참조형 : null
		BookDTO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공");

			String sql = "select * from Book where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id+"");
			System.out.println("3. SQL문 객체화");

			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 성공");
			if (rs.next()) { // 검색결과가 있는가? true = 있다, false = 없다
				System.out.println("검색결과 있음");
				String no2 = rs.getString(1);
				String content2 = rs.getString(2);
				String title2 = rs.getString(3);
				String writer2 = rs.getString(4);
				//System.out.println(no2 + " " + content2 + " " + title2 + " " + writer2);

				bag = new BookDTO();
				bag.setId(Integer.parseInt(no2));
				bag.setName(title2);
				bag.setUrl(content2);
				bag.setImg(writer2);
			} else {
				System.out.println("검색결과 없음");
			}
		} catch (Exception e) {
			System.out.println("검색 중 문제 발생");
		}
		return bag;
	}

}
