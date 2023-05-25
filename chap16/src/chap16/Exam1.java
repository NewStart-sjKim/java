package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 교수의 교수번호, 이름, 입사일, 부서코드를 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		try {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select no,name,hiredate,deptno from professor");
		while(rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.println(rs.getString(4));
		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
