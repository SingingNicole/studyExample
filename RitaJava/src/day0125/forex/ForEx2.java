package day0125.forex;

public class ForEx2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}// 1~10까지 10번 반복
		
		for (int i1 = 0; i1<10; i1++) {
			System.out.println(i1+"\t"); // \t : tap 공백
		}// 0~9까지 10번 반복
		
		for (int i2 = 0; i2<=9; i2+=2) {
			System.out.println("i2 : "+i2);
		}// 0~9까지 4번 반복, 2씩 증가.

		for (int i3 = 10; i3 >=1; i3--) {
			System.out.println(i3);
		}// 10에서 1까지 10번 반복, 1씩 감소.
		
		int j = 0;
		for(;j < 5;) {
			j++;
			System.out.println(j);
		}// 초기식과 증감식을 생략할 수 있다.
		
		for(int i = 0, k = 100; i <50 && j > 50; i++, k--) {
			System.out.println(i + " : " + k);
		}// 초기식과 증감식이 둘 이상 있는 for문도 가능하다.
	}
}
