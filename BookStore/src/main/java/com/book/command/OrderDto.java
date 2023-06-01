package com.book.command;

import java.util.Date;

import lombok.Data;

@Data
public class OrderDto {
	private int orderid;
	private int custid;
	private int bookid;
	private int saleprice;
	private Date orderdate;

}
