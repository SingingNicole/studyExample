package baek.fxex;

public class Main4637 {

	public static int selfnumberTest(int target) {

		int sum = target;

		while (target != 0) {
			sum += target % 10;
			target /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {

		boolean[] isselfNumber = new boolean[10000];
		int n = 0;

		for (int i = 1; i < isselfNumber.length; i++) {
			n = selfnumberTest(i);

			if (n < 10000) {
				isselfNumber[n] = true;
			}

			if (isselfNumber[i] == false) {
				System.out.println(i);
			}
		}

	}

}
