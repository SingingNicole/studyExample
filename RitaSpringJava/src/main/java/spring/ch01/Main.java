package spring.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext beanFactory = new GenericXmlApplicationContext("applicationContext.xml"); // 컨테이너 생성
		
		WriteArticleService articleService = (WriteArticleService)beanFactory.getBean("writeArticleService"); // 객체를 가져옴
		// 이름이 writeArticleService인 Bean => beanFactory로 만든 객체
		
		articleService.write(new Article()); // 객체 안의 write 메서드 호출
		// 오버라이딩된 insert 메서드 수행 => mySQLArticleDao의 insert 메서드 실행
		
		// Spring에서는 Container 개념이 중요하다 => Container를 통해 Bean 형성, 의존하고 있는 요소들 주입.
		// 직접 new를 통해 선언하는 것이 아닌 해당하는 객체 주입.
		// 객체의 생성과 소멸을 Container가 권장.

	}

}
