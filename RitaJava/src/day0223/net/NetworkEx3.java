package day0223.net;

import java.net.*;
import java.io.*;

public class NetworkEx3 {

	public static void main(String args[]) {
		URL url = null;
		BufferedReader input = null; // 한글이 깨지지 않도록 2byte 데이터를 읽어 올 수 있는 BufferedReader 사용
		String address = "https://docs.oracle.com/en/java/javase/11/docs/api/index-files/index-1.html";
		String line = "";

		try {
			url = new URL(address);

			input = new BufferedReader(new InputStreamReader(url.openStream()));
			// 기록된 문서 파일을 읽어 올 수 있도록 InputStream이 연결
			// openStream으로 받아온 1byte 데이터를 InputStreamReader를 이용하여 2byte로 늘림
			// 한 줄씩 데이터를 읽어올 수 있다.

			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close(); // 연결된 stream 종료
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}