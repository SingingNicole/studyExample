
public class Testpractice {

	public static void main(String[] args) {
		String target = "ccazzzbb";

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

		System.out.println(isGroup);

	}

}
