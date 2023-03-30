package day0310.jbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx2 {
// select * from book
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
			// 코스트가 들기 때문에 한번 만들어 두면 최대한 여러 번 사용하도록 한다.
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");

			while (rs.next()) { // 자료가 여러 개 있을 수 있으므로 while 문을 사용한다.
				// int bookid = rs.getInt("bookid");
				String bookname = rs.getString("bookname");
				String publisher = rs.getString(3);
				int price = rs.getInt(4);

				System.out.printf("이름: %s, 출판사: %s, 가격: %d\n", bookname, publisher, price);
				// null값일 경우 int는 0 출력, 문자열은 null 출력

			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
