package com.test0215;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee[] employeeInfo = new Employee[3];

		employeeInfo[0] = new Employee("A1892", "이진선", "AI개발부", "사원", 3500);
		employeeInfo[1] = new Employee("B8007", "심용권", "Web개발부", "부장", 7000);
		employeeInfo[2] = new Employee("F5691", "신지영", "총괄개발부", "전무", 9000);

		/*
		 *						 = {
		 * 			new Employee("A1892", "이진선", "AI개발부", "사원", 3500)
		 * 			new Employee("B8007", "심용권", "Web개발부", "부장", 7000)
		 * 			new Employee("F5691", "신지영", "총괄개발부", "전무", 9000)
		 * 		};
		 */

		System.out.print("사원번호 > ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("=======================");

		for (Employee s : employeeInfo) {
			if (s.getNo().equals(input)) {
				System.out.println(s.toString());
			}
		}

		sc.close();

	}

}
