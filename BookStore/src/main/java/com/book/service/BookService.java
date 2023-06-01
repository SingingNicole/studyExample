package com.book.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.book.command.BookDto;
import com.book.command.CustomerDto;

@Service
public class BookService {
	@Autowired
	BookDao dao;
	
	// 1. 모든 Book의 정보 출력
	public List<BookDto> bookInfo(){
		return dao.bookInfo();
	}
	
	// 2. 모든 customer 정보 출력
	public List<CustomerDto> custInfo() {
		return dao.custInfo();
	}
	
	// 3. 주문 내역 검색 - 고객명, 책 이름, 구입 날짜, 구매 가격
	// 3-1. 날짜 범위로 검색
	public List<Map<String, Object>> searchOrderDate(Date searchStart, Date searchEnd) {
		Map<String, Date> map = new HashMap<>();
		map.put("searchStart", searchStart);
		map.put("searchEnd", searchEnd);
		return dao.searchOrderDate(map);
	}
	
	// 3-2. 고객명 검색
	public List<Map<String, Object>> searchOrderName(String name) {
		return dao.searchOrderName(name);
	}
	
	// 4. 책 추가
	@Transactional
	public void addBook(BookDto newBook) {
		dao.addBook(newBook);
	}
	
	// 5. 1번 결과 책 클릭 시 가격 수정
	public void changePrice(int newBookprice) {
		
	}

}
