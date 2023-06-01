package day0222.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest { // 직렬화: 파일에 객체를 저장하고 복원할 때 사용한다.

	public static void main(String[] args) {

		Person p1 = new Person("김자바", "학생");
		Person p2 = new Person("이자바", "요리사");

		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			// 파일에 객체를 직렬화해서 출력(저장)하는 스트림(파일에 객체의 상태(값) 저장)
			// 메서드는 저장하지 않고 변수만 파일에 저장한다.
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person kim = (Person) ois.readObject();
			System.out.println(kim);
			Person lee = (Person) ois.readObject();
			System.out.println(lee);
			// 파일로부터 객체를 읽어오는 스트림(역직렬화 - 객체 복원)
			// transient 처리된 객체는 복원할 수 없다. => job의 값이 저장/복원되지 않아 기본값 null로 저장된다.
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
