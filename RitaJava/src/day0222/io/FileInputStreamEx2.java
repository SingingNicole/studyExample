package day0222.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt");) {
			byte[] b = new byte[fis.available()]; // 읽어와서 저장할 바이트의 길이
			int len;

			while ((len = fis.read(b)) != -1) {
				System.out.println(new String(b));
				System.out.println(": " + len + " byte 읽음.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("end");

	}

}
