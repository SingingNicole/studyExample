package baek.stringtest;

import java.util.Scanner;

public class Main1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] words = new String[N];
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			words[i] = sc.next();
			if (findGroup(words[i]) == true) {
				count++;
			}
		}

		sc.close();
		System.out.println(count);

	}

	public static boolean findGroup(String target) {

		boolean isGroup = true;

		for (int i = 0; i < target.length(); i++) {
			int count = 0;
			try {
				String find = target.substring(i + 1);
				while (target.charAt(i) == find.charAt(count)) {
					count++;
				}
				find = find.substring(count);
				if (find.indexOf(String.valueOf(target.charAt(i))) != -1) {
					isGroup = false;
					break;
				}
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return isGroup;
	}

}
