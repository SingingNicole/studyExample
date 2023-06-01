package spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) { 
		@SuppressWarnings("resource")
		AbstractApplicationContext context
			= new GenericXmlApplicationContext("aop.xml");

		GreetingService gs = context.getBean("greeting", GreetingService.class);
		gs.sayHello("springKim");
		try { // RuntimeException을 제외하고는 try-catch 처리
			gs.sayGoodbye("springA");
		} catch (Exception e) { // 가지고 있던 error 객체가 throwing 되다가 해당 시점에서 catch
			System.out.println("예외 처리");
		}
		System.out.println("program end!!");
	}

}
