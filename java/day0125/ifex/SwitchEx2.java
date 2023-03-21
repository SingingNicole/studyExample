package day0125.ifex;

public class SwitchEx2 {
	public static void main(String[] args) {
		
		char g = 'B';
		
		switch(g) {
		case 'A': case 'a' :
			System.out.println("우수회원입니다."); break;
		case 'B': case 'b':
			System.out.println("일반회원입니다."); break;
		default:
			System.out.println("손님입니다.");
		}
		
		/*
		 * if( g=='a' || g == 'a') {
		 * 	System.out.println("우수회원입니다.");
		 * } else if(g == 'B' || g == 'b') {
		 * System.out.println("일반회원입니다.");
		 * else {
		 * System.out.println("손님입니다.");
		 * }
		 */
		
	}
}
