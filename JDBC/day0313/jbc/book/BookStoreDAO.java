package day0313.jbc.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookStoreDAO {
	// 1. 책 이름 검색
	public List<BookStoreDTO> searchBook(Connection conn, String bookname) {
		List<BookStoreDTO> booklist = new ArrayList<>();

		String sql = "select * from book where bookname like ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, "%" + bookname + "%");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				BookStoreDTO dto = new BookStoreDTO(); // 반복문 안에서 생성해야 반복할 때마다 계속 생성됨.

				dto.setBookname(rs.getString("bookname"));
				dto.setBookid(rs.getInt("bookid"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setPrice(rs.getInt("price"));

				booklist.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return booklist;
	} // serachBook end

	// 2. 고객 이름 검색
	public List<BookStoreDTO> searchCustomer(Connection conn, String name) {
		List<BookStoreDTO> customerList = new ArrayList<>();

		String sql = "select * from customer where name like ?";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "%" + name + "%");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				BookStoreDTO dto = new BookStoreDTO();

				dto.setName(rs.getString("name"));
				dto.setCustid(rs.getInt("custid"));
				dto.setAddress(rs.getString("address"));
				dto.setPhone(rs.getString("phone"));

				customerList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	} // searchCustomer end

	// 3. 주문 내역 확인
	public List<BookStoreDTO> orderAll(Connection conn) {
		List<BookStoreDTO> orderList = new ArrayList<>();

		String sql = "select * from orders, customer, book"
				+ " where orders.custid = customer.custid and orders.bookid = book.bookid";
		// 줄을 나눌 때 공백이 삭제되지 않도록 주의

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				BookStoreDTO dto = new BookStoreDTO();
				dto.setOrderid(rs.getInt("orderid"));
				dto.setName(rs.getString("name"));
				dto.setBookname(rs.getString("bookname"));
				dto.setOrderdate(rs.getDate("orderdate")); // 타입을 timestamp로 설정하면 시, 분, 초까지 출력이 가능하다.

				orderList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orderList;
	} // orderAll end

	// 책 번호 추가
	public int getNewBookid(Connection conn) {
		int newid = 0;
		String sql = "select max(bookid) + 1 from book";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				newid = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return newid;
	} // getNewBookid end

	// 책 정보 추가
	public int updateBook(Connection conn, BookStoreDTO dto) {
		int i = 0;
		String sql = "insert into book values (?, ?, ?, ?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, dto.getBookid());
			pstmt.setString(2, dto.getBookname());
			pstmt.setString(3, dto.getPublisher());
			pstmt.setInt(4, dto.getPrice());

			i = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	} // updateBook end

} // main end
