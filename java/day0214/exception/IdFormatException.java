package day0214.exception;

// ID값 저장 시 값에 문제가 있는 경우 발생할 예외
public class IdFormatException extends Exception {

	public IdFormatException() {
		super();
	}
	
	public IdFormatException(String message) {
		super(message);
	}
	
}
