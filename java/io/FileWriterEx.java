package day0222.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("writer.txt");) {
			fw.write('A');

			char[] arr = { 'B', 'C', 'D' };
			fw.write(arr);

			fw.write("안녕하세요 \n");
			fw.write("여기까지");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
