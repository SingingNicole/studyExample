package day0313.jbc.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BookStoreMain {

	private static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
		return conn;
	} // getConnection end

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Connection conn = null;
		BookStoreService service = new BookStoreService();
		Scanner s = new Scanner(System.in);

		try {
			conn = getConnection();
			while (true) {
				System.out.println("메뉴를 선택하세요.");
				System.out.println("=============================");
				System.out.println("1. 도서명 검색 / 2. 고객명 검색 / 3. 주문 정보 출력 / 4. 책 정보 추가");
				int menu = s.nextInt();
				if (menu == 1) {
					service.searchBook(conn);
				} else if (menu == 2) {
					service.searchCustomer(conn);
				} else if (menu == 3) {
					service.orderAll(conn);
				} else if (menu == 4) {
					service.updateBook(conn);
				} else {
					System.out.println("시스템 종료.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	} // main end

} // class end
