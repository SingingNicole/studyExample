package day0214.exception;

public class ExceptionEx3 {

	public static void main(String[] args) {

		String[] str = { "abc", null };

		try {
			for (String s : str) {
				System.out.println(s.toUpperCase());
				// toUpperCase() : String 클래스에 선언된 메서드. 문자열을 대문자로 바꾸어서 리턴한다.
				
				// NullPointerException : 사용할 객체가 실제로 없는데(주소값이 null) 타입에 선언된 멤버를 사용하는 경우 발생
			}
		} catch (NullPointerException ne) {
			System.out.println("객체 없음. " +  ne.getMessage());
		}
		
		for(String s : str) {
			if(s != null) {
				System.out.println(s.toUpperCase());
			} // s의 값이 null이 아닐 때만 수행하여 NullPointerException을 방지
		}

	}

}
