package mytest;

import java.util.HashMap;
import java.util.Map;

public class ModelUse {

	public static void main(String[] args) { // tomcat 컨테이너로 가정한다.
		// 요청을 받으면 Map 변수를 만든다.
		Map<String, String> model = new HashMap<>();
		// 리퀘스트 맵핑에 의해 메서드를 호출하며 메서드에 객체 변수를 넘겨준다.
		String sReturn = root(model);
		// 컨테이너가 다시 출력 view 메서드 호출, 페이지 이름과 사용 정보를 파라미터로 모두 전달.
		// 호출이 종료되면 지역 메서드가 끝나 객체 변수가 메모리에서 제거된다.
		printData(sReturn, model);

	}

	// 리퀘스트 매핑에 의해 실행되는 메서드
	public static String root(Map<String, String> model) {
		// model 객체에 파라미터 저장
		model.put("name1", "홍길동");
		model.put("name2", "전우치");
		// 뷰 페이지의 이름 return
		return "Hello";
	}
	
	public static void printData(String s, Map<String, String> model) {
		String str1 = (String)model.get("name1");
		System.out.println(str1);
		System.out.println("WEB-INF/views/" + s + ".jsp");
	}

}
