package spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	@Pointcut("execution(* sayGood*(String))")
	private void pointCut() {}

	@Before("execution(public * spring.aop.*.sayHello(..))") // 특정 메서드에서만 작동하려면 지시자로 명시
	public void beforeLogging() {
		System.out.println("**메서드 호출 전**");
	}
	
	@AfterReturning(pointcut = "pointCut()", returning = "returnValue")
	public void afterLogging(Object returnValue) {
		System.out.println("**메서드 호출 후**");
	}
	
	@AfterThrowing(pointcut = "pointCut()", throwing = "ex")
	// 모든 타입의 예외 객체를 저장히는 Exception ex
	public void throwingLogging(Exception ex) {
		System.out.println("**예외 발생: " + ex.getMessage() + "**");
	}
	
	@After("pointCut()")
	public void alwaysLogging() {
		System.out.println("**항상 실행**");
	}

}
