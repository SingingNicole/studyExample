package day0222.io;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");

		int i;
		try {
			while ((i = System.in.read()) != '\n') { // 1바이트씩만 문자를 가져온다.
				// 알파벳을 제외한 다른 문자는 오류가 발생한다.
				System.out.println((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// main 끝

}
