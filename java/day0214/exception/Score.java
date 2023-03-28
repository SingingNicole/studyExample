package day0214.exception;

public class Score {

	int score;

	public void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException(score);
		} else if (score > 100) {
			throw new OverException(score);
		}
		this.score = score;
		System.out.println("점수 저장");
	}

	public static void main(String[] args) {
		Score sc = new Score();

		try {
			sc.checkScore(85);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("점수: " + sc.score);

	}

}
