package day0221.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Tomas");
		list.add("Edward");
		list.add("Jack");

		list.stream().forEach(s -> System.out.print(s + " ")); // Stream을 최종 요소로 바로 출력 가능
		System.out.println();
		list.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
	}

}
