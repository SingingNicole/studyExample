package spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AbstractApplicationContext context
		// bean 생성, 의존 객체 주입
			= new GenericXmlApplicationContext("applicationContext.xml");
		// 사용할 bean 가져오기
		Foo f = context.getBean("foo", Foo.class); // object가 아니라 Foo 타입으로 가져오도록 미리 설정.
		f.doFoo();
		
		Fooo f1 = context.getBean("fooo", Fooo.class);
		f1.doFooo();
		
		context.registerShutdownHook(); // 컨테이너 강제 종료
	}

}
