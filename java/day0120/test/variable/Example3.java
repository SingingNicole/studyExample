package day0120.test.variable;

import java.util.Scanner;
public class Example3 {
	public static void main(String[] args) {
		//제품명(name), 수량(count), 단가(price)를 입력받아 제품명과 총금액을 출력하세요
	System.out.println("제품명을 입력하세요");
	Scanner scanner =  new Scanner(System.in);
	String name = scanner.nextLine();
	System.out.println("수량을 입력하세요");
	int count = scanner.nextInt();
	System.out.println("단가를 입력하세요(단위 : 원)");
	int price = scanner.nextInt();
	int total = count*price;
	System.out.printf("구매하신 제품은 %s이고 총 금액은 %,d원입니다.", name, total);
	System.out.printf("구매하신 제품은 %s이고 총 금액은 %,d원입니다.", name, (count*price));

	scanner.close();
	/*
	 *  System.out.println("구매하신 제품은 " +name+"이며 수량은 "
	 * +count+"개이고 총 금액은 " +(count*price)+ "원 입니다.");
	 */
	
	/*
	Scanner scanner =  new Scanner(System.in);
	System.out.println("제품명 > ");
	
	String name = scanner.nextLine();
	System.out.println("수량>");
	
	int count = scanner.nextInt();
	
	System.out.println("단가 > ");
	int price = scanner.nextInt();
	
	int total = count * price;
	
	System.out.printf("제품 : %s, 총금액 : %,d원", name, total);
	*/
	
	}
}
