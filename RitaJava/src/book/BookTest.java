package book;

public class BookTest {

	public static void main(String[] args) {

		Book book1 = new Book("SQL Plus", 50000, 5.0);
		Book book2 = new Book("Java 2.0", 40000, 3.0);
		Book book3 = new Book("JSP Servlet", 60000, 6.0);
		// 배열을 선언하여 저장할 수도 있다.

		System.out.println("    책 이름         가격       할인율      할인 후 금액");
		System.out.println("-------------------------------------------------");
		System.out.println("   " + book1.getBookName() + "      " + book1.getBookPrice() + "원     "
				+ book1.getBookDiscountRate() + "%       " + book1.getDiscountBookPrice() + "원");
		System.out.println("   " + book2.getBookName() + "      " + book2.getBookPrice() + "원     "
				+ book2.getBookDiscountRate() + "%       " + book2.getDiscountBookPrice() + "원");
		System.out.println(" " + book3.getBookName() + "     " + book3.getBookPrice() + "원     "
				+ book3.getBookDiscountRate() + "%       " + book3.getDiscountBookPrice() + "원");
		// 배열로 선언한다면 for 반복문으로 줄일 수 있음! for (Book b : books){~}
		// override 로 toString 메소드를 만들어 활용도 가능하다
		// \t : tap 공백
	}

}
