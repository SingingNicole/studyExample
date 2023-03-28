package day0214.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int[] iarr = { 10, 200, 30 };

		for (int i = 0; i <= iarr.length; i++) {
			try { // try 안의 문장은 무조건 수행한다
				System.out.println(i + 1 + "번 수행");
				System.out.println("iarr[" + i + "] : " + iarr[i]);
				System.out.println(i + 1 + "~~~~~~~~~");
			} catch (Exception e) { // catch 안의 문장은 지정한 예외 타입이 발생했을 때 수행한다
				// Super 타입인 Exception을 사용해도 다형성으로 인해 작동이 가능하다
				System.out.println("예외 발생 - 인덱스 범위가 맞지 않음");
				System.out.println(e.getMessage());
				//e.printStackTrace();// 예외 추적 메서드
				return; // main 메서드 종료
			} finally {
				System.out.println(i + 1 + "-finally"); // return문이 있어도 무조건 실행된다.
			}
		}

		System.out.println("program end!!"); // return 문에서는 사용되지 않음

 	}

}
