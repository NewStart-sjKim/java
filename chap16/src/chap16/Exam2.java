package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 메뉴를 선택하세요 (1~4): 
 * 1. create() : member 테이블 생성하기 : id,pass 컬럼을 가짐
 * 2. insert() : 화면에서 id,pass 입력받아 member에 wjwkdgkrl
 * 3. select() : 현재 등록된 내용을 출력하기
 * 4. delete() : id를 입력받아 레코드 삭제
 * 5. drop()   : member 테이블 제거하기 
 */
public class Exam2 {
	public static void main(String[] args) throws SQLException {
		while(true) {
			System.out.println("메뉴를 선택하세여");
			System.out.println("1: 테이블 생성");
			System.out.println("2: 테이블에 id,pass 내용 등록");
			System.out.println("3: 테이블의 내용 조회");
			System.out.println("4: 테이블의 id 입력받아 레코드 삭제");
			System.out.println("5: 테이블 제거");
			System.out.println("9: 프로그램 종료");
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			if(menu == 9) break;
			switch(menu) {
			case 1 : create();break;
			case 2 : insert();break;
			case 3 : select();break;
			case 4 : delete();break;
			case 5 : drop();break;
			}
		}//while 끝
	}

	private static void delete() throws SQLException {
		System.out.println("삭제할 id를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		Connection conn = getConnection();
		PreparedStatement pstmt = 
				conn.prepareStatement("delete from member where id=?");
		pstmt.setString(1,id);
		System.out.println("삭제 레코드 건수 :" + pstmt.executeUpdate());
		pstmt.close();
		conn.close();
	}

	private static void drop() throws SQLException {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("drop table member");
		stmt.close();
		conn.close();
	}
	private static void select() throws SQLException {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from member");
		while(rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.println(rs.getString(2));
		}
		rs.close();
		stmt.close();
		conn.close();
	}

	private static void insert() throws SQLException {
		System.out.println("id와 password를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		String pass = scan.next();
		String sql = "insert into member (id,pass) values(?,?)";
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,id);
		pstmt.setString(2,pass);
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();
	}

	private static void create() throws SQLException {
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("create table member(id varchar(10),pass varchar(10))");
		stmt.close();
		conn.close();
	}

	private static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection
					("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			return conn;
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;

	}
}
