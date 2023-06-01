package day0214.exception;

public class OverException extends Exception {

	public OverException(int score) {
		super("입력한 점수가 100보다 큽니다.: " + score);
	}
}
