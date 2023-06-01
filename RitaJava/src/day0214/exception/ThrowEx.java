package day0214.exception;

public class ThrowEx {

	public static void main(String[] args) {
		
		try {
		throw new Exception("강제 예외 발생"); // 예외 개체 생성
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
