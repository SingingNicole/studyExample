package com.book.command;

import lombok.Data;

@Data
public class BookDto {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;

}
