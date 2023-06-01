package day0216.collection.list;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {

		// 마지막 자리에 데이터를 추가하거나 검색하는 경우는 arraylist가 빠르다
		// 중간에 저장된 객체를 제거, 중간에 삽입하는 경우 linkedlist가 빠르다.
		// list 내의 정보가 빈번하게 변경이 이뤄지는 경우는 linkedlist를 사용한다.
		// 큐 인터페이스 등도 구현하는 클래스임

		List<String> l1 = new ArrayList<>();
		List<String> l2 = new LinkedList<>();

		long start;
		long end;

		start = System.nanoTime(); // 처리되는 현재 시간을 나노 단위로 나눔
		for (int i = 0; i < 10000; i++) {
			l1.add(0, String.valueOf(i)); // 0번 인덱스에 추가(기존에 있던 자리는 밀림)
		}
		end = System.nanoTime();
		// 기존 데이터 자리에 추가하며 밀려 속도가 느리다.

		System.out.println("ArrayList : " + (end - start));

		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			l2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();

		System.out.println("LinkedList : " + (end - start));
	}
}