package com.book.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.book.command.BookDto;
import com.book.command.CustomerDto;

@Mapper
public interface BookDao {
	
	// 1. 모든 Book의 정보 출력
	@Select("select * from Book")
	public List<BookDto> bookInfo();
	
	// 2. 모든 customer 정보 출력
	@Select("select * from customer")
	public List<CustomerDto> custInfo();
	
	// 3. 주문 내역 검색 - 고객명, 책 이름, 구입 날짜, 구매 가격
	// 3-1. 날짜 범위로 검색
	@Select("select name, address, bookname, orderdate, saleprice"
			+ " from orders, book, customer where orders.custid = customer.custid"
			+ " and book.bookid = orders.bookid"
			+ " and orderdate between #{searchStart} and #{searchEnd}")
	public List<Map<String, Object>> searchOrderDate(Map<String, Date> map);
	
	// 3-2. 고객명 검색
	@Select("select address, bookname, orderdate, saleprice"
			+ " from orders, book, customer where orders.custid = customer.custid"
			+ " and book.bookid = orders.bookid"
			+ " and name like concat('%', #{name}, '%')")
	public List<Map<String, Object>> searchOrderName(String name);	
	
	// 4. 책 추가
	@Insert("insert into book (bookid, bookname, publisher, price)"
			+ " values(#{bookid}, #{bookname}, #{publisher}, #{price})")
	public void addBook(BookDto newBook);
	
	// 5. 1번 결과 책 클릭 시 가격 수정
	@Update("update book where bookprice = #{bookprice}")
	public void changePrice(int newBookprice);

}
