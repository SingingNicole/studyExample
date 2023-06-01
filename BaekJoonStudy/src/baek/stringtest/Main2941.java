package baek.stringtest;

import java.util.Scanner;

public class Main2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String target = sc.next();
		sc.close();

		int count = 0;

		for (int i = 0; i < target.length(); i++) {
			char hrvatAlpha = target.charAt(i);
			try {
				if (hrvatAlpha == 'c' || hrvatAlpha == 's' || hrvatAlpha == 'z') {
					switch ((int) target.charAt(i + 1)) {
					case 61: case 45:
						count++;
						break;
					}
				} else if (hrvatAlpha == 'l' || hrvatAlpha == 'n') {
					if (target.charAt(i + 1) == 'j') {
						count++;
					}
				} else if (hrvatAlpha == 'd') {
					if (target.charAt(i + 1) == 'z' && target.charAt(i + 2) == '=') {
						count++;
					} else if (target.charAt(i + 1) == '-') {
						count++;
					}
				}
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}

		System.out.println(target.length() - count);

	}

}
