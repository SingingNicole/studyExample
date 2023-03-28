package day0215.lang;

class StringEx7 {
	public static void main(String[] args) {
		// int -> String
		int value = 100;
		String strValue = String.valueOf(value); // String타입으로 변환

		int value2 = 100;
		String strValue2 = value2 + ""; // 역시 문자열로 저장한다.

		System.out.println(strValue);
		System.out.println(strValue2);
	}
}
