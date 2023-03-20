package day0119.variable.primitive;

public class ConversionEx2 {
	
 /* 다른 타입과 계산해야 하는 경우=>작은 타입이 큰 타입에 맞춰 변환된다.
 * int i = 10;
 * long l = 10L;
 * i + l => 같은 파일이 아니라 계산 불가
 */

public static void main(String[] args) {
byte b = 10;//00001010
int i = b;//00000000 00000000 00000000 00000000 00000000
//선언된 데이터의 종류가 다르지만 정보의 손실이 없어 명시하지 않아도 자동 변환됨.
System.out.println("b : "+b);
System.out.println("i : "+i);

int i2 = 300;// 00000000 00000000 00000001 00101100
//byte b2 = i2;//                          00101100(error)
byte b2 = (byte)i2;//손실이 발생하더라도 형변환한다.

System.out.println("i2 : "+i2);//원본 데이터는 변하지 않음
							   //변수 사용 시 변수에 저장된 값만 꺼내서 사용함.
System.out.println("b2 : "+b2);

	}
}
