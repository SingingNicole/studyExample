package day0222.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferTest2 {

	public static void main(String[] args) {
		// BufferedReader - readLine(): 한 줄씩 읽어오기 -> String 타입으로 받아온다.
		try (FileReader fr = new FileReader("reader.txt"); BufferedReader br = new BufferedReader(fr)) {
			// FileReader와 BufferedReader를 연결
			String msg;
			while ((msg = br.readLine()) != null) { // reader.txt의 값을 msg에 String 저장
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
