package day0222.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input.txt");) {
			System.out.println(fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
