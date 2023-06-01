package baek.stringtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2908 {

	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String sg = null;
		try {
			sg = bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] temp = sg.split(" ");
		String[] ss = new String[temp.length];

		for (int i = 0; i < temp.length; i++) {
			StringBuffer sb = new StringBuffer(temp[i]);
			ss[i] = sb.reverse().toString();
		}

		if (Integer.valueOf(ss[0]) > Integer.valueOf(ss[1])) {
			System.out.println(ss[0]);
		} else {
			System.out.println(ss[1]);
		}

	}

}
