package com.multi.mvc500;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import 화면DB연결.MemberVO;

//그냥 하면 싱글톤x
//@(어노테이션) or XML파일에 설정
@Component
public class MemberDao {

	@Autowired
	SqlSessionTemplate my;

	MemberVO bag = new MemberVO();

	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		// namespace . id
		return result;
	}

	public int delete(String id) {
		int result = my.delete("member.del", id);
		return result;
	}

	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		return result;
	}

	public MemberVO one(String id) {
		bag = my.selectOne("member.one", id);
		return bag;
	}

//	public int login(MemberVO bag) {
//		return result;
//	}
//
//	public ArrayList<MemberVO> list() {
//		return list;
//	}

}

/*
 * 1. JDBC4단계 정리 : 드라이버 연결 -> 오라클 로그인 -> sql객체 생성 -> 객체 전송 2. 데이터를 접근해서 처리하는
 * 클래스를 부르는 이름 : DAO(data access object) 3. DAO에 주로 넣는 기능 - 4가지 : crud 4. DAO에
 * 주로 넣는 기능 중 C(insert)만 사용해봄. : String x = "insert into 테이블 values(입력할 값,값,값)"
 * 5. sql를 객체를 만들었을 때 모르는 값을 표현하는 연산자. : ?
 */
