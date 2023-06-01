package day0126.array;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 0부터 9까지의 배열 만들기
		int[] nums = new int[45];

		for (int i = 1; i <= 45; i++) {
			nums[i - 1] = i;
		} // 섞을 데이터 for문으로 형성
		//System.out.println(Arrays.toString(nums));

		for (int i = 0; i < 100; i++) {
			int r = (int) (Math.random() * 44); // 0부터 9 사이의 랜덤값
			int temp = nums[0];
			nums[0] = nums[r];
			nums[r] = temp;
		} // 생성된 데이터를 100번 랜덤 배열
		//System.out.println(Arrays.toString(nums));
		for(int j = 0; j < 6; j++) {
			System.out.println(nums[j]);// 6개를 임의로 선정하여 출력
		}
	}

}
