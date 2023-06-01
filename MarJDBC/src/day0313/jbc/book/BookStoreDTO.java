package day0313.jbc.book;

import java.util.Date;

public class BookStoreDTO {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;

	private int custid;
	private String name;
	private String address;
	private String phone;

	private int orderid;
	private int saleprice;
	private Date orderdate;

	public BookStoreDTO() {
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String orderInfo() {
		return "orderInfo [orderid=" + orderid + ", name=" + name + ", bookname=" + bookname + ", orderdate="
				+ orderdate + "]";
	}

	public String bookInfo() {
		return "bookInfo [bookid=" + bookid + ", bookname=" + bookname + ", publisher=" + publisher + ", price=" + price
				+ "]";
	}

	public String customerInfo() {
		return "customerInfo [custid=" + custid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	// 책 정보만 업데이트
	public void setBookInfo(int bookid, String bookname, String publisher, int price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}

}
