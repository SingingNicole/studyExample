package day0221.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book {
	String name;
	int price;

	Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		// 스트림 생성하고 출력하기
		// 1. 모든 책 가격의 합
		// 2. 책의 가격이 20000원 이상인 책의 이름을 정렬해서 출력

		int total = bookList.stream().mapToInt(b -> b.getPrice()).sum(); // 저장하고 있는 모든 책의 가격 더하기
		// mapToInt => int Stream의 객체를 map으로 추출하고 다시 int로 변환
		System.out.println("모든 책 가격의 합 : " + total + "원");

		int total2 = bookList.stream().mapToInt(b -> b.getPrice()).reduce(0, (a, b) -> a + b); // bookList Stream에서 가격만 추출
																// return값 -> Stream 내 모든 수의 총합 (=sum)
																// 마지막 index가 없을 때까지 반복한다.

		bookList.stream().filter(b -> b.getPrice() >= 20000).map(b -> b.getName()).sorted()
				.forEach(name -> System.out.print(name + " ")); // Stream에 책의 정보를 업로드 -> 가격이 20000원 이상인 객체만 남김 -> 해당 책의 이름을 map으로 추출
																// Sort된 문자열 Stream을 하나씩 출력

	}

}