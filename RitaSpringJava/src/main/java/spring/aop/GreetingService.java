package spring.aop;

import org.springframework.stereotype.Component;

@Component
public interface GreetingService {

	public void sayHello(String name);
	
	public void sayGoodbye(String name) throws Exception;
	// super class에서 가장 많은 exception을 처리하고 있어야 함.

}
