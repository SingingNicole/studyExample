package day0119.variable.primitive;

public class ConversionEx3 {
	public static void main(String[] args) {
		
		double d = 100;//8byte
		int i = (int)d;//4byte
		/*실수를 정수로 변경할 때 사용
		 * 소숫점 뒷자리는 버린다.
		 * 실수를 정수로 바꾸기도 가능.
		 */
		
		System.out.println("d : "+d);
		System.out.println("i : "+i);
	}
}
