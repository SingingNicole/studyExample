package day0210.oop.polymorphism;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal[] animals = { new Human(), new Eagle(), new Tiger() };
		// super 타입으로 배열을 선언하면 sub 객체들을 저장할 수 있다.
		for (int i = 0; i < animals.length; i++) {
			animals[i].move();
			// animals[i].readBook(); => super 타입인 animal 의 객체들이 모여 있으므로 sub에 선언한 클래스는 사용 불가
			if (animals[i] instanceof Human) {
				((Human) animals[i]).readBook();
			} else if (animals[i] instanceof Eagle) {
				((Eagle) animals[i]).flying();
			} else if (animals[i] instanceof Tiger) {
				((Tiger) animals[i]).hunting();
			}
		}
	}

}
