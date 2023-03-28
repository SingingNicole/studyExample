package day0210.oop.polymorphism;

public class AnimalTest1 {
	
	public void moveAnimal(Animal a) {
		a.move();
		// a.flying(); -> sub에 선언된 멤버는 사용할 수 없다
	}

	public static void main(String[] args) {
		AnimalTest1 at1 = new AnimalTest1();
		at1.moveAnimal(new Human());
		at1.moveAnimal(new Tiger());
		at1.moveAnimal(new Eagle());

	}

}
