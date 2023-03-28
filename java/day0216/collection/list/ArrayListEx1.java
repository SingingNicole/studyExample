package day0216.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		list1.add(1); // list.add(new Integer(1));로 적어야 하나 오토박스 기능으로 그냥 기본형을 적어도 ok
		list1.add(4);
		list1.add(6);
		list1.add(0);
		list1.add(3);
		// 저장된 순서가 그대로 유지된다.

		for (int i : list1) { // Integer 타입의 변수이나 언박싱 가능
			System.out.println(i);
		}

		List<Integer> list2 = list1.subList(1, 3);
		System.out.println(list2);

		Collections.sort(list1);
		System.out.println(list1);

		list2.add(1, 10);
		System.out.println(list2);

		list2.set(1, 20);
		System.out.println(list2);

	}

}
