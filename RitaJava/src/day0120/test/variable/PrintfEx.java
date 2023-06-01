package day0120.test.variable;

public class PrintfEx {
	public static void main(String[] args) {
		/*System.out.print("값"); 
		 *System.out.println("값");
		 *System.out.printf("포맷형식", "값n", "값n+1", "값n+2"); // format된 문자열 출력*/
	// system : 구동 화면 // out : 출력 // in : 읽기
		// 포맷 형식 안의 값이 정수라면 %d, 실수라면 %f, 문자열이라면 %s, 16진수값이라면 %x, char값은 %c
			// 포맷 형식과 값을 일치시켜야 한다.
		
		System.out.printf("정수 : %d , %d\n", 100, 200); // 100, 200의 값을 %d 위치에 순서대로 저장하여 문자열로 만들고 출력.
		System.out.printf("pie는 %f입니다.\n", 3.1415921535); // float 사용하면 강제로 소숫점 뒤 6자리까지 출력. //넘어갈 경우 반올림 처리.
		System.out.printf("pie는 %.2f입니다.\n", 3.1415921535); // %.n => 소숫점 뒤 n번째 자리까지 출력.
		System.out.printf("%s\n", "Hello");
		System.out.printf("%5s\n", "java"); //$ns => n의 개수만큼 문자를 출력한다.(모자랄 경우 공백 처리, 데이터는 오른쪽 정렬.)
		System.out.printf("%5d\n" , 123);
		System.out.printf("%05d\n", 123); // 빈 자리를 0으로 채워서 출력하는 포맷 형식.
		
		System.err.println("빨강색으로 출력"); // system.err. : 에러 메세지처럼 붉은 색으로 출력 가능.
		
	}
}
