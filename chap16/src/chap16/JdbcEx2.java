package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 조회된 컬럼명을 출력하기
 * resultSetMetaDta : 조회된 결과 정보
 */
public class JdbcEx2 {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			Connection conn = DriverManager.getConnection
					("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery
					("select p.no,p.name,p.hiredate,p.deptno,m.name mname " 
							+ "from professor p, major m where p.deptno = m.code " 
							+ "order by deptno");
			//ResultSetMetaData : 조회된 결과의 정보
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();

			while(rs.next()) { //rs.next() : 무조건 해야지 조회가된다
				System.out.print(rs.getInt("no") + "\t");
				//			System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString("p.name") + "\t");
				System.out.print(rs.getDate("hiredate") + "\t");
				//			System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString("deptno") + "\t");
				//			System.out.println(rs.getInt(4) + "\t");
				System.out.println(rs.getString("mname"));
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
