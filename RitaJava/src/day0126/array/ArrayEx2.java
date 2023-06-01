package day0126.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 총합, 평균

		int[] score = { 100, 98, 100, 88, 90 };

		int sum = 0; // 총합을 저장할 공간
		double avg = 0.0; // 평균을 저장할 공간

		for (int i : score) {
			sum += i;
		}
		avg = sum / (double) score.length;
		// length => 항상 정수의 값을 가지기 때문에 float나 double로 선캐스팅 필요

		System.out.println("총점 : " + sum);
		System.out.println("총점 : " + avg);
	}

}
