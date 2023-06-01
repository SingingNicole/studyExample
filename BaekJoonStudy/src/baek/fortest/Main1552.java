package baek.fortest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main1552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 문자열을 숫자로 바꾸며 오류가 생길 수 있으므로 입력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// BufferedReader, BufferedWriter 선언
		// ctr + shift + o => 자동 import

		StringTokenizer st;
		// 입력된 문자를 공백 단위로 분리한다.

		int x = Integer.parseInt(br.readLine());
		// 첫 번째 입력한 숫자(엔터)

		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(br.readLine());
			// 이후 입력된 문자는 공백 단위로 추출한다.
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
			// 입력된 문자를 순서대로 대입하여 출력한다. (줄바꿈도 진행)
		}

		bw.close();// BufferedWriter를 닫는다.
	}

}
