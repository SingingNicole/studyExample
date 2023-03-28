package day0222.exam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileMove {

	public static void main(String[] args) {
		// 입력한 경로의 파일을 원하는 경로에 이동한다(복사X).
		// 파일의 이름은 변경하지 않는다.
		// 입력한 경로에 파일이 없다면 "경로가 잘못되었습니다."를 출력한다.
		// 원본 파일은 삭제되어야 한다.
		// byte stream을 사용한다.
		Scanner sc = new Scanner(System.in);

		System.out.println("복사할 파일의 경로를 입력하세요.");
		System.out.print("경로 > ");
		String fileDir = sc.next();
		File old = new File(fileDir); // File 객체 생성

		System.out.println("파일이 이동할 경로를 입력하세요.");
		System.out.print("경로 > ");
		String newDir = sc.next();

		File change = new File(newDir, old.getName());

		try (FileInputStream fis = new FileInputStream(old);
				FileOutputStream fos = new FileOutputStream(change);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			// file 안의 내용을 읽어오고 보낸다.
			byte[] readByte = new byte[fis.available()];
			while (bis.read(readByte) != -1) {
				bos.write(readByte);
			}

		} catch (IOException e) {
			System.out.print("경로가 잘못되었습니다.");
			return;
		}

		old.delete();
		System.out.print("이동 완료.");

	}

}
