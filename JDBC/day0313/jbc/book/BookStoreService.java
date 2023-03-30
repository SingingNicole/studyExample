package day0313.jbc.book;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class BookStoreService {

	BookStoreDAO dao = new BookStoreDAO();

	@SuppressWarnings("resource")
	public void searchBook(Connection conn) {
		System.out.print("검색하실 책 이름을 입력하세요 > ");
		Scanner sc = new Scanner(System.in);
		String bookname = sc.nextLine();

		List<BookStoreDTO> targetlist = dao.searchBook(conn, bookname);

		if (targetlist.size() != 0) {
			for (BookStoreDTO dto : targetlist) {
				System.out.println(dto.bookInfo());
			}
		} else {
			System.out.println("찾으시는 책이 존재하지 않습니다.");
		}
	} // searchBook end

	@SuppressWarnings("resource")
	public void searchCustomer(Connection conn) {
		System.out.print("검색하실 고객명을 입력하세요 > ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		List<BookStoreDTO> targetlist = dao.searchCustomer(conn, name);

		if (targetlist.size() != 0) {
			for (BookStoreDTO dto : targetlist) {
				System.out.println(dto.customerInfo());
			}
		} else {
			System.out.println("찾으시는 고객이 존재하지 않습니다.");
		}
	} // searchCustomer end

	// 주문 내역 출력
	public void orderAll(Connection conn) {
		List<BookStoreDTO> orderlist = dao.orderAll(conn);
		for (BookStoreDTO dto : orderlist) {
			System.out.println(dto.orderInfo());
		}
	} // orderAll end

	// 책 정보 추가
	@SuppressWarnings("resource")
	public void updateBook(Connection conn) {
		System.out.println("새 책을 추가합니다.");
		Scanner sc = new Scanner(System.in);

		System.out.print("책 이름을 입력하세요. > ");
		String bookname = sc.nextLine();

		System.out.print("출판사를 입력하세요. > ");
		String publisher = sc.nextLine();

		System.out.print("가격을 입력하세요. > ");
		int price = sc.nextInt();

		BookStoreDTO dto = new BookStoreDTO();
		dto.setBookInfo(dao.getNewBookid(conn), bookname, publisher, price);

		int i = dao.updateBook(conn, dto);

		if (i != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("오류가 발생하였습니다.");
		}
	} // updateBook end

} // main end
