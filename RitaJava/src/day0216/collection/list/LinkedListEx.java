package day0216.collection.list;

import java.util.LinkedList;

public class LinkedListEx {

	// 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
	// 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음
	// 자료가 추가될때 노드만큼의 메모리를 할당받고 이전 노드의 링크로 연결함(정해진 크기가 없음)

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();

		myList.add("a");
		myList.add("b");
		myList.add("c");

		System.out.println(myList);

		myList.add(1, "D");
		System.out.println(myList);

		myList.addFirst("0");
		System.out.println(myList);

		System.out.println(myList.removeLast());
		System.out.println(myList);
		
		// linkedlist는 중간 수정이 용이하다.

	}

}