package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * DBMS에 연결하기
 * 1. 드라이버 설정 : Build Path > classpath 설정
 * 2.jdbc 사용
 * 	  - java.sql 패키지 import
 *    - 드라이버 선택 : class.forName("클래스명")
 *    - 연결객체 생성 : DriverManager.getConnection(url.user,password)
 *    - 명령전달 객체 : Statement
 */
public class JdbcEx1 {
	public static void main(String[] args) {
		try {
			//org.mariadb.jdbc.Driver 메모리에 로드
		Class.forName("org.mariadb.jdbc.Driver");
//		오라클
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection : dbms 와 연결된 객체
		/*
		 * jdbc:mariadb : jdvb로 mariadb와 연결
		 * localhost	: dbms 서버의 ip주소. localhost(현재컴퓨터)
		 * 3306			: post 번호
		 * gdudb		: databse 이름;
		 */
		Connection conn = DriverManager.getConnection
		("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
		System.out.println("마리아db 연결 완료");
		//명령전달 객체
		Statement stmt = conn.createStatement();
		//sql 명령 실행
		//ResultSet : select 구문의 실행 결과를 저장한 객체
		ResultSet rs = stmt.executeQuery("select * from student");
		while(rs.next()) { // 조회된 레코드가 있으면 true, 조회된 레코드 리턴 
			//(rs.getString("studno") : 컬럼명이 studno인 컬럼의 값 리턴
			System.out.println(rs.getString("studno") + "\t");
			//System.out.print(rs.getString(1) + "\t");
			//(rs.getString(2) : 조회 2번 컬럼의 값
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.println(rs.getString(5));
		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
