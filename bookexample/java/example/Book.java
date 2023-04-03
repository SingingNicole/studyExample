package array.example;

public class Book {
	//책 이름과 저자를 멤버 변수로 가지는 클래스
	//get() : 변수의 값 가져오기
	//set() : 변수의 값 지정
	

	private String bookName;
	private String author;
	
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	} // 책 이름과 저자 이름을 매개변수로 받는 생성자
	public String getBookname() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(bookName + " , " + author);
	}// 책 정보를 출력해주는 메서드
}
