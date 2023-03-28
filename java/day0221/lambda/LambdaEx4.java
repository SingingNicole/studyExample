package day0221.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx4 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1; // Integer get(): 매개변수 없는 get 메서드 오버라이딩
		// 100까지의 랜덤한 수를 리턴한다
		Consumer<Integer> c = i -> System.out.printf(i + ", "); // void accept(Integer): Integer를 매개변수로 하는 void 메서드
																// 오버라이딩
		// 받아온 랜덤한 수를 받아 출력한다
		Predicate<Integer> p = i -> i % 2 == 0;
		Function<Integer, Integer> f = i -> i / 10 * 10; // i의 일의 자리를 없앤다.
		// Integer apply(Integer): 결과물을 int로 리턴할 수 있도록 apply 메서드 오버라이딩

		List<Integer> list = new ArrayList<>(); // 비어 있는 메서드 생성
		makeRandomList(s, list); // s: 구현 객체, list: 공백 리스트
		System.out.println(list);

		printEvenNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);

	}

	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for (T i : list) {
			newList.add(f.apply(i));
		}
		return newList;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.printf("[");
		for (T i : list) {
			if (p.test(i)) {
				c.accept(i);
			} // 짝수인 경우에만 출력
		}
		System.out.printf("]\n");

	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		// Supplier: 조상 클래스
		for (int i = 0; i < 10; i++) {
			list.add(s.get()); // 1부터 100까지의 값이 리턴될 수 있도록 가져 옴, 리스트 추가. 10번 반복
		} // 1부터 100까지의 랜덤한 숫자가 10번동안 리스트에 저장

	}

}
