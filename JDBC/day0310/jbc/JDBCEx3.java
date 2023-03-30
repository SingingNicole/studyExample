package day0310.jbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx3 {
// customer 테이블에 6, '손흥민', '영국 토트넘', '010-1111-1111' 입력
	public static void main(String[] args) {
		// 밖에서 커넥션과 스테이먼트 선언
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
			stmt = conn.createStatement();
			int x = stmt.executeUpdate("insert into customer values" + "(6, '손흥민', '영국 토트넘', '010-1111-1111')");
			if (x == 1) { // update한 숫자 => 업데이트가 되었으면 1, 되지 않았으면 0
				System.out.println("입력 완료");
			} else {
				System.out.println("입력 실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
