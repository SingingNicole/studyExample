package day0222.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferTest3 {

	public static String consoleInput(String input) throws IOException { // input 스트링은 1byte 상태
		System.out.println(input + ": ");
		InputStreamReader isr = new InputStreamReader(System.in); // 화면과 연결된 스트림이 2byte로 늘어남
		BufferedReader br = new BufferedReader(isr); // buffer를 사용하는 스트림
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		String id = consoleInput("id");
		String password = consoleInput("password");

		System.out.write("아이디".getBytes());
		System.out.printf("id: %s, password: %s", id, password);

	}

}
