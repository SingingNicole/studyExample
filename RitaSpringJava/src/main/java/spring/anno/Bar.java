package spring.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // bean 생성
public class Bar {
	@Value("javakim")
	String str; // 기본형 데이터 타입을 주입받을때는 value annotation 사용

	public void doBar() {
		System.out.println(str + ": Bar.doBar() 실행.");
	}
	@PostConstruct // 초기화 어노테이션
	public void start() {
		System.out.println("Bar.init");
	}
	@PreDestroy // 소멸 어노테이션
	public void stop() {
		System.out.println("Bar.destroy");
	}

	public void setStr(String str) {
		this.str = str;
	}

}
