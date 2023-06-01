package day0222.io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File dDrive = new File("d:\\"); // d드라이브 표현
		String[] list = dDrive.list(); // 해당 경로에 있는 폴더명, 파일명을 String[]으로 반환
		for (int i = 0; i < list.length; i++) {
			File f = new File("d:\\", list[i]);
			if (f.isDirectory()) {
				System.out.println("디렉토리: " + list[i]);
			} else {
				System.out.printf("파일: %s (%,d바이트) \n", list[i], f.length());
			}
		}
	}

}
