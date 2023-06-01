package day0222.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {// 데이터의 순서를 그대로 유지해야 할 때 활용하는 Stream

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeInt(100);
			dos.writeBoolean(true);
			dos.writeUTF("Test");
			dos.writeFloat(3.14f);
		} catch (IOException e) {
			e.printStackTrace();
		} // 파일에 기본형 데이터 출력 스트림

		try (FileInputStream fis = new FileInputStream("Data.txt"); DataInputStream dis = new DataInputStream(fis)) {
			System.out.println(dis.readInt() + 10);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
			System.out.println(dis.readFloat());
		} catch (IOException e) {
			e.printStackTrace();
		} // 파일로부터 기본형 데이터를 읽어 오는 스트림

	}

}
