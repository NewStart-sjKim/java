package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * PreparedStatement
 * int 			executeUpdate(sql)	: insert,update,delete,...
 * 									  변경된 레코드 건수 리턴	
 * ResultSet	executeUpdate(sql)	: select 구문 실행시
 * 
 * Statement > PreparedStatement
 * int 			executeUpdate(sql)	: insert,update,delete,...
 * 									  변경된 레코드 건수 리턴	
 * ResultSet	executeUpdate(sql)	: select 구문 실행시
 */
public class JdbcEx3 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection
					("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			String sql = "create table jdbctemp"
					+"(id varchar(10), passwd varchar(10))";
			pstmt = conn.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("결과 :" + result);
			pstmt.close();

			sql = "insert into jdbctemp (id,passwd)" + "values ('hong','1111')";
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
			System.out.println("결과 :" + result);//1
			pstmt.close();

			sql = "insert into jdbctemp (id,passwd) values (?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"kim");// sql 구문의 첫번째 '?'
			pstmt.setString(2,"2222");//sql 구문의 두번째 '?'
			result = pstmt.executeUpdate();
			System.out.println("결과 :" + result);//1
			pstmt.setString(1,"lee");
			pstmt.setString(2,"3333");
			result = pstmt.executeUpdate();
			System.out.println("결과 :" + result);

			pstmt.close();
			sql = "select * from jdbctemp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //select 구문 실행 => (리턴값이)ResultSet 리턴
			while(rs.next()) {
				System.out.print(rs.getString("id") + "\t");
				System.out.println(rs.getString("passwd"));
			}
			pstmt.close();
			System.out.println("update : lee의 비밀번호를 1234 변경하기");
			sql = "update jdbctemp set passwd=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "1234");
			pstmt.setString(2, "lee");
			pstmt.executeUpdate();
			System.out.println("결과 :" + result);
			pstmt.close();
			
			sql = "select * from jdbctemp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("id") + "\t");
				System.out.println(rs.getString("passwd"));
			}
			System.out.println("delete 명령어 실행");
			System.out.println("id=lee d인 레코드 제거하기");
			sql = "delete from jdbctemp where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "lee");
			result = pstmt.executeUpdate();
			System.out.println("결과 :" + result);
			pstmt.close();
			
			sql = "select * from jdbctemp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("id") + "\t");
				System.out.println(rs.getString("passwd"));
			}
			
			sql = "drop table jdbctemp";
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
			System.out.println("결과 :" + result);
		}catch(Exception e) {
		}
	}
}
