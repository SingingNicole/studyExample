package day0222.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("print.txt"); PrintStream ps = new PrintStream(fos);) {
			ps.println(true);
			ps.println("string");
			ps.println(100);
			ps.print('A');
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
