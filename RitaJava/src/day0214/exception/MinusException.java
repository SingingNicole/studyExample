package day0214.exception;

public class MinusException extends Exception { // 예외 클래스는 무조건 Exception을 extends 받아야 한다

	public MinusException() {
		super("입력한 점수가 음수입니다.");
	}

	public MinusException(int score) {
		super("입력한 점수가 음수입니다.: " + score);
	}

}
