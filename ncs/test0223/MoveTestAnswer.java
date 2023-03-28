package ncs.test0223;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MoveTestAnswer {

	public static void main(String[] args) {

		Map<String, String[]> filmo = new HashMap<>();

		filmo.put("송강호", new String[] { "박쥐", "괴물", "관상" });
		filmo.put("김수현", new String[] { "도둑들", "수상한 그녀", "은밀하게 위대하게" });
		filmo.put("이병헌", new String[] { "지아이조", "레드", "광해" });

		int cnt = 0;

		System.out.println("검색할 배우: ");
		Scanner scan = new Scanner(System.in);
		String actName = scan.next();

		Set<String> names = filmo.keySet();
		for (String n : names) {
			if (n.equals(actName)) {
				System.out.println(Arrays.toString(filmo.get(n)));
				cnt++;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("해당 배우가 존재하지 않습니다.");
		}

	}

}
