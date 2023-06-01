package day0310.jbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JBCDEx5 {
// 6번 고객님 탈퇴 - 탈퇴 완료
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
			pstmt = conn.prepareStatement("delete from customer where custid = ?");
			pstmt.setInt(1, 6);

			int x = pstmt.executeUpdate();// 업데이트 실행

			if (x == 1) {
				System.out.println("고객이 탈퇴하였습니다.");
			} else {
				System.out.println("없는 고객번호입니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (pstmt != null) {
				try {
					pstmt.close();
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

		} // finally 종료

	} // main 종료

} // class 종료
