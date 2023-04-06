package spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // bean으로 생성한다.
public class Foo {
	@Autowired // @Resource 어노테이션 역시 사용 가능하다(이름 우선 -> type).
	// @inject 어노테이션도 따로 설치한다면 가능 / Autowired는 spring에서 지원하고 있어 설치 필요 x.
	// setter 위에도 붙일 수 있으나 일반적으로 객체 위에 붙인다.
	Bar bar; // Bar 객체(Bean) autowired => 의존하고 있는 객체를 container에서 주입받음.
	// type을 기준으로 받아온다.

	public void doFoo() {
		System.out.println("Foo.doFoo() 실행.");
		bar.doBar();
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

}