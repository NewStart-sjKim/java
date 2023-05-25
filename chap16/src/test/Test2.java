//package test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
///*
//[결과]  
//sql 문장을 입력하세요
//select * from dept
//조회된 컬럼 수:3
//deptno	dname	loc	
//10	대표이사	서울	
//20	기획부	서울	
//30	기술부	서울	
//40	영업부	서울	
//50	운용팀	울산	
// */
//public class Test2 {
//	public static void main(String[] args) {
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			Connection conn = DriverManager.getConnection
//					("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from dept");
//			ResultSetMetaData rsmd = rs.getMetaData();
//			for(int i=1;i<=rsmd.getColumnCount();i++) {
//				System.out.print(rsmd.getColumnName(i) + "\t");
//			}
//			System.out.println();
//			while(rs.next()) {
//				System.out.print(rs.getString("deptno") + "\t");
//				System.out.print(rs.getString("dname") + "\t");
//				System.out.println(rs.getString("loc") + "\t");
//			}
//			}catch(ClassNotFoundException e) {
//				e.printStackTrace();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
/*

[결과]  
sql 문장을 입력하세요
select * from dept
조회된 컬럼 수:3
컬럼명       컬럼타입      NULL 허용   
deptno    INTEGER(2)	NOT NULL  
dname     VARCHAR(14)	NULL      
loc       VARCHAR(20)	NULL      
deptno	dname	loc	
10	대표이사	서울	
20	기획부	서울	
30	기술부	서울	
40	영업부	서울	
50	운용팀	울산	
 */
public class Test2 {
	public static void main(String[] args) throws SQLException{
		System.out.println("sql 문장을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String sql = scan.nextLine();

		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int colCnt = rsmd.getColumnCount();
		System.out.println("조회된 컬럼 수:" + colCnt);
		System.out.printf("%-10s","컬럼명");
		System.out.printf("%-10s","컬럼타입");	  
		System.out.printf("%-10s\n","NULL 허용");	
		//조회된 컬럼의 자료형의 크기를 출력.
		for(int i=1;i<=colCnt;i++) {
			System.out.printf("%-10s",rsmd.getColumnName(i));
			System.out.printf("%s(%d)\t",
					rsmd.getColumnTypeName(i),rsmd.getPrecision(i));
			System.out.printf ("%-10s\n",
					(rsmd.isNullable(i)==0)?"NOT NULL":"NULL");
		}

		for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();
		while(rs.next()) {
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
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