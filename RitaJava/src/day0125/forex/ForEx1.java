package day0125.forex;

public class ForEx1 {
	
	public static void main(String[] args) {
		int summary = 0;
		
		for (int i = 1; i <= 100; i++ ) {
			// 순서대로 초기식, 조건식, 증감식
			summary = summary + i;//수행문
			}
		System.out.println(summary);
		//반복문을 사용하면 코드의 길이가 줄어든다.
		
		/*
		 * for(시작점; 끝나는 지점; 증감) {true일 때 반복할 문장;}
		 */
		
	}	
}

