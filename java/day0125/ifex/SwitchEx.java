package day0125.ifex;

public class SwitchEx {

	public static void main(String[] args) {
		int grade = 1;
		
		switch (grade) {
		case 1:
			System.out.println("금메달입니다."); break;
		case 2:
			System.out.println("은메달입니다."); break;
		case 3:
			System.out.println("동메달입니다."); break;
		default:
			System.out.println("열심히 하셨습니다~~");
		}//switch문은 여기까지.

	}

}
