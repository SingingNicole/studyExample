package day0214.exception;

import java.util.Scanner;

public class IdFormatTest { // 사용자 정의 예외 클래스

	private String userId;

	public String getUserId() {
		return userId;
	}

	// id가 null이면 X, 8~20글자 이하로 입력
	public void setUserId(String userId) throws IdFormatException {
		if (userId == null) {
			throw new IdFormatException("아이디는 null일 수 없습니다.");
		} else if (userId.length() < 8 || userId.length() > 20) {
			throw new IdFormatException("아이디는 8자 이상 20자 이하로 작성하세요.");
		}
		this.userId = userId;
	}

	public static void main(String[] args) {
		IdFormatTest ift = new IdFormatTest();
		Scanner scanner = new Scanner(System.in);

		while (ift.getUserId() == null) {
			System.out.println("저장할 id 값을 입력하세요.");
			String id = scanner.next();

			try {
				ift.setUserId(id);
				System.out.println("저장되었습니다.: " + ift.getUserId());
			} catch (IdFormatException e) {
				System.out.println(e.getMessage());
			}
		}

		scanner.close();
	}

}
