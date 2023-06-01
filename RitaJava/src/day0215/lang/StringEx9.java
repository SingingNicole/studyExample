package day0215.lang;

class StringEx9 {
	public static void main(String[] args) {
		String fullName = "Hello.java";
		// indexOf() : 문자열의 시작 인덱스를 리턴
		// 문자열안에 없다면 -1을 리턴 -> 해당 문자열을 가지고 있는지 확인 하는 용도로 많이 사용됨
		int index = fullName.indexOf("."); // 5
		System.out.println(index);

		if (fullName.indexOf("Z") != -1) {
			System.out.printf("%s에 %s는 있음.\n", fullName, "Z");
		} else {
			System.out.printf("%s에 %s는 없음.\n", fullName, "Z");
		}

		String fileName = fullName.substring(0, index);
		// substring(b,e) : b부터 e앞까지 추출
		// substring(b) : b부터 끝까지 추출
		String ext = fullName.substring(index + 1);

		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext);
	}
}
