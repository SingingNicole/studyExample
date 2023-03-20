package day0119.variable.primitive;

public class ConversionEx4 {
	public static void main(String[] args) {
		
		short s = 10;
		short s2 = 20;
		
		int s3 = s + s2;
		short s4 = (short)(s + s2);
		
		System.out.println(s4);
		
		/*short s = 10;
		short s2 = 20;
		*s + s2의 계산 => short로 진행 불가.(int 값)
		*자바에서는 4byte 미만의 계산은 int로 바꿔서 계산한다.(byte, short, char의 경우)
		*/
		System.out.println(" s + s2 = "+s3);
		
		char c = 'A';//A = 65
		System.out.println(c + 1);
		char c1 = (char)(c + 1);
		System.out.println(c1);
				
	}
}
