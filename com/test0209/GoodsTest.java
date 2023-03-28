package com.test0209;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		
		System.out.println("다음 항목의 값을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		System.out.println("수량 : ");
		int quantity = sc.nextInt();
		
		Goods product = new Goods(name, price, quantity);

		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println();
		System.out.println(product); // 객체 안에는 무조건 정보가 있어 자동으로 toString()이 리턴값 출력
		System.out.println("총 구매 가격 : " + product.getPrice() * product.getQuantity() + "원");

		sc.close();
	}

}
