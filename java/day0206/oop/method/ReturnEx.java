package day0206.oop.method;

public class ReturnEx {
	
	int max(int a, int b) {
		int result = 0;
		if(a > b) {
			result = a;
		} else {
			result = b;
		}
		return result;
		// 되도록이면 return은 최소화시키는게 좋다.
	}

	public static void main(String[] args) {
		

	}

}
