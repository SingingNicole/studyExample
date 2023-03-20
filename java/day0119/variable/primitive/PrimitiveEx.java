package day0119.variable.primitive;

public class PrimitiveEx {
	public static void main(String[] args) {
	//변수 선언=값;
		int age;
		age = 10;
		
		System.out.println(age);
		
		boolean boo1 = false;
		System.out.println("boo1 : "+boo1);
		//boo1의 값을 출력한다
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
				//글자 선언은 작은따옴표
		
		char c3 ='가';
		char c4 = '\uAc00';
		System.out.println("c3 : "+c3);
		System.out.println("c4 : "+c4);
		
	/* 키보드의 문자는 아스키코드로 표현
	 * 한글의 경우 유니코드(UTF-8)표로 표현=캐릭터셋
	 * 존재할 수 없는 글자도 유니코드로 표현 가능하다.
	 * 글자 한 개를 코드로 매핑해둠. ex)가=\uAc00로 표현.
	 */
		
	/*리터럴 정수 => int 타입이 기본
	 *int의 범위를 넘어가면 long으로 자동 바뀌는 것이 아니라 error 발생
	 *long i = 2100000000;(X)
	 *int의 범위를 넘은 리터럴 정수에 접미사 L을 붙여준다
	 *해당 데이터는 long타입이라고 명시
	 *long i = 21000000000L;(소문자는 혼동 가능성 있어 사용 X)
	 */
	
		int num = 10;//10진수
		int bNum = 0B1010;//2진수 10
		int oNum = 012;//8진수 10
		int hNum = 0XA;//16진수 10
		
		System.out.println(num);
		
		//변수에 저장된 값을 꺼내 와 출력 시 10진수로 출력해야 한다.
		
		System.out.println("2진수 : " +bNum);
		System.out.println("8진수 : " +oNum);
		System.out.println("16진수 : " +hNum);
		
		double d = 3.14;//더블타입
		float f = 3.14F;
		
		System.out.println(d + f);
		
		/*실수형 리터럴은 무조건 double 사용.
		 * float 타입에는 실수형 리터럴을 저장할 수 없음.
		 * float f = 3.14;(X)
		 * 실수형 리터럴 뒤에 접미사 F를 붙여 주면 float타입 데이터가 된다.
		 * float타입의 경우 소숫점 뒷자리가 넘어갈 경우 표기 오류 발생.
		 */
		
		float f1 = 0.1000000001F;
		double d1 = 0.1000000001;
		
		System.out.println("f1 : "+f1);
		System.out.println("d1 : "+d1);
		
		var mon = "Jan"; //String mon = "Jan";
		var day = 19;//int day = 19;
		
		System.out.println(mon + day);
		
		/*String과 char의 차이점 : String을 출력했을 땐 문자 그대로 출력되지만
		 * char는 자칫하면 정수로 나타난다는 것.
		 * String은 참조형 데이터, char은 기본형 데이터.
		 
		 예시
		 * char c1 = 'A';
		 * String c2 = "A";
		System.out.println(c1 + 2);//67
		System.out.println(c2 + 2);//A2
		 */
		
	}
	
}