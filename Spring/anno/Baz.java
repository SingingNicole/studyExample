package spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Baz {
	@Bean(name="foo1")
	public Foo getFoo() {
		Foo f = new Foo();
		return f;
	}

}
