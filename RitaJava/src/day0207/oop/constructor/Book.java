package day0207.oop.constructor;

public class Book {

	String bookname;
	String author;
	int price;

	public Book() {
	}

	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	}

	public Book(String bookname, String author, int price) {
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}

}
