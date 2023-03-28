package day0216.collection.list;

import java.util.*;

public class IteratorEx {
// Iterator: 컬렉션 내 저장된 객체를 읽어오는 방법을 표준화 한 interface
// hasNext(): 이후에 요소가 더 있는지 체크한다. 다음 요소가 있다면 true.
// next(): 다음 요소를 반환한다.
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(3);
		list.add("A");
		list.add("B");
		list.add("c");

		Iterator<String> iter = list.iterator();
		// 데이터가 있는 경우 주소를 가리키고 있다고 간주(iterator 객체 생성) -> 커서의 개념
		while (iter.hasNext()) { // iter에 요소가 있는 경우 ture.
			System.out.println(iter.next()); // true인 경우 iter 내의 요소를 반환한다.
		}
		// iter.next(); => 더 이상 객체가 존재하지 않으므로 NoSuchElementException 예외 발생

	}

}
