package day0215.lang;

public class StringEx14 {
	
	public static void main(String[] args) {
		String sObj = "Hello";
		setValue(sObj);
		System.out.println(sObj);
	}

	private static void setValue(String str) {
		str.replace("H", "h");
		str += " World";
		System.out.println(str);
	}
}
