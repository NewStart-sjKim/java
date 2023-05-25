package test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Test33 {
//	public static void main(String[] args) throws SQLException {
//		Connection conn = null;
//		Statement pstmt = null;
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			conn = DriverManager.getConnection
//					("jdbc:mariadb://localhost:3306/gdudb","gdu", "1234");
//			pstmt = conn.createStatement();
//			String sql = "create table car (mon int(10), con int(10), car varchar(10), qty int(10), remark varchar(10))";
//			pstmt.executeQuery(sql);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.sql.Statement;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

//public class Test33 {
//   public static void main(String[] args) throws SQLException, IOException {
//	   BufferedReader br = new BufferedReader
//			   (new FileReader("D:\\java\\workspace\\chap16\\product.txt"));
//	   String temp = "";
//		try { String[] str;
//		temp = str[4];
//		} catch (ArrayIndexOutOfBoundsException e) {
//			temp = "";	}
//      Connection conn = null;
//      Statement stmt = null;
//      try {
//         Class.forName("org.mariadb.jdbc.Driver");
//         conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb", "gdu", "1234");
//         stmt = conn.createStatement();
//         String sql = "create table car(mon int(10), con int(10), car varchar(10), qty int(10), remark varchar(10))";
//         stmt.executeQuery(sql);
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//   }
//}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test33 {

public static void main(String[] args) throws IOException {

      String filePath = "D:/java/workspace/chap16/product.txt";

      // 파일 읽기
      try {
         Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu", "1234");
         PreparedStatement pstmt = conn
               .prepareStatement("INSERT INTO car (mon, con, car, qty, remark) VALUES (?, ?, ?, ?, ?)");

         BufferedReader br = new BufferedReader(new FileReader(filePath));
         String line;
         while ((line = br.readLine()) != null) {

            String[] data = line.split(",");
            int mon = Integer.parseInt(data[0]);
            int con = Integer.parseInt(data[1]);
            String car = data[2];
            int qty = Integer.parseInt(data[3]);
            String remark = data.length > 4 ? data[4] : "";
            pstmt.setInt(1, mon);
            pstmt.setInt(2, con);
            pstmt.setString(3, car);
            pstmt.setInt(4, qty);
            pstmt.setString(5, remark);
            pstmt.executeUpdate();
            
         }
         br.close();
         pstmt.close();
         conn.close();

      } catch (SQLException e) {
         e.printStackTrace();
      } catch (IOException e) {
               e.printStackTrace();
            }
   }
}
//public class Test33 {
//	public static void main(String[] args) {
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//
//			Connection conn = DriverManager.getConnection
//					("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery
//					("select * from car");
//			ResultSetMetaData rsmd = rs.getMetaData();
//			for(int i=1;i<=rsmd.getColumnCount();i++) {
//				System.out.print(rsmd.getColumnName(i) + "\t");
//			}
//			System.out.println();
//
//			while(rs.next()) { //rs.next() : 무조건 해야지 조회가된다
//				System.out.print(rs.getInt("mon") + "\t");
//				//			System.out.print(rs.getString(1) + "\t");
//				System.out.print(rs.getString("con") + "\t");
//				System.out.print(rs.getString("car") + "\t");
//				//			System.out.print(rs.getString(3) + "\t");
//				System.out.println(rs.getInt("qty") + "\t");
//	
//			}
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}
//
