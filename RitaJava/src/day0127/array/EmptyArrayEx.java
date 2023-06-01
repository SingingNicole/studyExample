package day0127.array;

public class EmptyArrayEx { 
	 // 비어 있는 배열
	public static void main(String[]args) {
		String[] s1 = {}; // = new String[0];
		// 배열은 있지만 크기는 0인 상태
		// 객체는 없지만 비어 있는 배열(주소 존재)
		
		System.out.println(s1.length);
		System.out.println(s1); // 객체가 위치하고 있는 주소값을 16진수(해시코드)로 출력.
		
	}
}
