//package test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
///*
// * 문제 :
// * 1. dept 테이블을 복사하여 deptcopy 테이블을 생성
// * 2. deptcopy 테이블에 
// *   deptno :9001  dname:특판1팀 loc : '서울지사' 추가
// *   deptno :9002  dname:특판2팀 loc : '서울지사' 추가
// * 3. dcode 9002인 부서코드의 loc 컬럼의 값을 울산지사 변경
// * 4. 9001번 부서를 제거하기
// * 5. 각각의 스텝에   모든 레코드 조회 기능 추가    
// */
//public class Test1 {
//	public static void main(String[] args) {
//		Connection conn = null;
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			conn = DriverManager.getConnection
//					("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery
//					("create table deptcopy as select * from dept");
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 문제 :
 * 1. dept 테이블을 복사하여 deptcopy 테이블을 생성
 * 2. deptcopy 테이블에 
 *   deptno :9001  dname:특판1팀 loc : '서울지사' 추가
 *   deptno :9002  dname:특판2팀 loc : '서울지사' 추가
 * 3. deptno 9002인 부서코드의 loc 컬럼의 값을 울산지사 변경
 * 4. 각각의 스텝에   모든 레코드 조회 기능 추가    
 */
public class Test1 {
	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		String sql = "create table deptcopy as select * from dept";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate();
		System.out.println("create deptcopy:" + result);
		pstmt.close();
		System.out.println(sql + "======");
		select(conn);
		sql = "insert into deptcopy (deptno,dname,loc) values(?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 9001);
		pstmt.setString(2, "특판1팀");
		pstmt.setString(3, "서울지사");
		pstmt.executeUpdate();
		pstmt.setInt(1, 9002);
		pstmt.setString(2, "특판2팀");
		pstmt.setString(3, "서울지사");
		pstmt.executeUpdate();
		System.out.println(sql + "======");
		select(conn);
		pstmt.close();
		sql = "update deptcopy set loc=? where deptno=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "울산지사");
		pstmt.setInt(2, 9002);
		pstmt.executeUpdate();
		System.out.println(sql + "======");
		select(conn);
		pstmt.close();
		conn.close();
	}
	private static void select(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from deptcopy");
		while(rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getString(3));
		}
		
	}
	private static Connection getConnection() {
		Connection conn = null;
		try {
		   Class.forName("org.mariadb.jdbc.Driver");
		   conn = DriverManager.getConnection
			  ("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
		   return conn;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}