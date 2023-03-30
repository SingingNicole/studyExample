package day0310.jbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsertEx {

	public static void main(String[] args) {
		boolean commit = false;
		// create table test(id varchar(10) primary key, password varchar(10))
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
			stmt = conn.createStatement();

			conn.setAutoCommit(false);// 트랜잭션 시작

			stmt.addBatch("INSERT INTO test " + "VALUES('abc1011', '1111')");
			stmt.addBatch("INSERT INTO test " + "VALUES('abc2022', '2222')");
			stmt.addBatch("INSERT INTO test " + "VALUES('abc3033', '3333')");
			stmt.addBatch("INSERT INTO test " + "VALUES('abc4044', '4444')");
			// addBatch를 사용하여 sql문을 모아 둠

			int[] updateCounts = stmt.executeBatch(); // 모아 둔 레코드를 배열로 묶어 한 번에 실행
			commit = true; // 저장이 성공하면 commit 변수에 true 저장
			conn.commit();
			conn.setAutoCommit(commit);

			rs = stmt.executeQuery("SELECT * FROM test"); // select 실행

			while (rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				System.out.println("id: " + id + " , password: " + password);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!commit)
					conn.rollback(); // 커밋이 실패했을 경우 롤백을 수행한다.
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}

	}

}
