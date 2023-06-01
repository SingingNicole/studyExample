package day0208.oop.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

/*import java.text.SimpleDateFormat;
import java.util.Date; // ctrl + space : 자동으로 추가
*/

public class ImportTest {

	public static void main(String[] args) {

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm a");
		// 날짜를 보여 주는 패턴을 지정하여 포맷해 준다
		
		String str = sdf.format(now);
		System.out.println("현재 시간 : " + str);
	}

}
