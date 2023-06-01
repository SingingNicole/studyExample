package baek.stringtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1152 {

	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		input.trim();
		String[] answer = input.split(" ");

		if (answer.length == 0) {
			System.out.println(0);
		} else if (answer[0].length() == 0) {
			System.out.println(answer.length - 1);
		} else {
			System.out.println(answer.length);
		}
	}
}
