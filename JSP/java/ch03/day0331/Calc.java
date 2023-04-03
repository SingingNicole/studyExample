package ch03.day0331;

public class Calc {

	public int sum(int start, int end) {
		int result = 0;
		for (int i = start; i <= end; i++) {
			result += i;
		}
		return result;
	}
}
