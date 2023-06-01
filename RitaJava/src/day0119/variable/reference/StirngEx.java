package day0119.variable.reference;

public class StirngEx {
	public static void main(String[] args) {
		/*String class : java.lang 클래스
						 문자열을 표현하기 위해 만든 클래스. ""로 표현
						 참조형 데이터는 클래스 이름을 타입으로 가진다.
						-> StirngEx 역시 타입이 될 수 있음.
						 여러 개의 문자열을 표현할 때 사용한다.
						 */
	String str = "문자열 표현";
	String empty = ""; // 빈 문자열도 표현 가능하다.
	String blank = " "; // 공백 문자열도 표현이 가능하다.
	System.out.println(str + empty + blank);
	/*String과 + 연산자가 만나면 숫자를 더하는 것이 아니라 이어쓰기(결합)됨. -, *, /(연산부호)는 String과 사용 불가.
		연산 데이터는 정수형, 실수형 데이터에만 사용 가능.
		새로운 문자열이 만들어진다.
	*/
	
	/*String과 다른 타입(기본형)의 + 연산 시
	  다른 타입은 자동으로 String으로 변환된다.
	 */
	
	String add = "hello "+"String";
	System.out.println(add);
	
	int classNumber = 504;
	String name = "Soldesk";
	String fullname = name + classNumber;
	System.out.println(fullname);
	
	String a = 7 + " ";// "7 "(문자열)
	String b = " " + 7;// " 7"(문자열)
	String c = 7 + "";// "7"(문자열)
	String d = "" + 7;// "7"(문자열)
	/*int -> String 변환 : 빈 문자열을 더해준다.
	 */
	
	System.out.println(a + b + c + d);
	
	String e = 7 + 7 + ""; // "14"
	String f = "" + 7 + 7; // "77"
	System.out.println(e);
	System.out.println(f);
	/*e = 7과 7을 먼저 더한 후 문자열로 변환.
	 *f = 7을 각각 문자열로 먼저 변환한 후 더함.
	 */
	
	}
}
