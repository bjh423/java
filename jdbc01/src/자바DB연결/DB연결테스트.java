package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB연결테스트 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			/*Connection con = */DriverManager.getConnection(url,user,password);
			System.out.println("2. 오라클연결 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*String sql = "insert into member values ('win','win','win','win')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 객체 생성 성공");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공, 결과 >>" + result);*/

	}

}

