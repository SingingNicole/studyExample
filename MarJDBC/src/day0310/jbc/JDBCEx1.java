package day0310.jbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {

	public static void main(String[] args) {
		// 1. 드라이버 로딩 - mySQL DBMS 선택
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. db 접속 - connection, url, user, password(jdbc:mysql://아이피:port/데이터베이스명)
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
			// 3. sql문 실행
			Statement stmt = conn.createStatement();
			// 수행할 문장 입력: select * from book where bookid = 1;
			ResultSet rs = stmt.executeQuery("select * from book where bookid = 100");

			if (rs.next()) {
				// int bookid = rs.getInt("bookid");
				String bookname = rs.getString("bookname");
				String publisher = rs.getString(3);
				int price = rs.getInt(4);
				System.out.printf("이름: %s, 출판사: %s, 가격: %d", bookname, publisher, price);
			} else {
				System.out.println("레코드 없음.");
			} // 데이터가 존재할 경우 책의 정보 데이터를 출력하는 if문

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
