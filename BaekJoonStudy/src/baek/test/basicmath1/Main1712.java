package baek.test.basicmath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main1712 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		final long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());

		long salseRate = 1;

		if (B < C) {
			salseRate = A / (C - B) + 1;
		} else {
			salseRate = -1;
		}
		bw.write(salseRate + "\n");
		bw.flush();
		bw.close();
	}

}
