package baek.test.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2292 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		long N = Integer.parseInt(bf.readLine());

		int answer = 1;

		while (3 * answer * (answer + 1) + 1 < N) {
			answer++;
		}

		if (N == 1) {
			answer = 0;
		}

		System.out.println(answer + 1);
	}

}
