package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	
	@Pointcut("execution(public * *(..))") // 퍼블릭 메서드 호출될때마다 around 동작
	private void pointCut() {}
   
	@Around("pointCut()") // 여러 곳에서 사용할 것이라면 pointcut
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
		// ProceedingJoinPoint: round 사용 가능. => 먼저 처리
		Signature s = joinPoint.getSignature(); // 메서드 정보 구하기
		String methodName = s.getName(); // 메서드 정보에서 이름 구하기

		long startTime = System.nanoTime();

		System.out.println("[Log]METHOD Before: " + methodName + " time check start");

		Object obj = null;
		
		try {
			obj = joinPoint.proceed();// .proceed(); : 핵심로직 메서드 호출, 호출한 지점으로 돌아 옴.
			// obj 타입으로 반환 값 저장, 값이 없으면 null
		} catch(Exception e) {
			System.out.println("[Log]METHOD error: " + methodName);
			// 예외가 발생하면 예외 객체 처리.
		}

		long endTime = System.nanoTime();
		System.out.println("[Log]METHOD After: " + methodName + " time check end");
		System.out.println("[Log]" + methodName + " Processing time is " + (endTime - startTime) + "ns");
		return obj;
	}

}
