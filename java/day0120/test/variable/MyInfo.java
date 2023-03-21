package day0120.test.variable;

public class MyInfo {
	public static void main(String[] args) {
		String 이름 = "나유림";
		int 나이 = 25;
		String MBTI = "ENTJ";
		String email = "pumpkinyeah3@gmail.com";
		
		System.out.println("이름 : " + 이름);
		System.out.println("나이 : " + 나이);
		System.out.println("MBTI : " + MBTI);
		System.out.println("email : " + email);
		System.out.println();
		System.out.println("제 이름은 "+이름+"이고 나이는 " +나이+"살입니다.\n"
				+ "MBTI는 "+MBTI+"이며 이메일은 "+email+"입니다.");
		// \n = 라인피드. 해당 지점에서 줄바꿈 진행.
		System.out.println();
		System.out.printf("제 이름은 %s이고 나이는 %d살입니다.\nMbti는 %s이며 이메일은 %s입니다.", 이름, 나이, MBTI, email);
	}
	
}
