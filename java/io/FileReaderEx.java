package day0222.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx { // 가져올 파일이 영어가 아닌 다른 언어로 이루어져 있다면 FileReader 사용

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("reader.txt");) {
			char[] arr = new char[10];
			int i;
			if ((i = fr.read(arr)) != -1) {
				System.out.println(arr);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("end");

	}

}
