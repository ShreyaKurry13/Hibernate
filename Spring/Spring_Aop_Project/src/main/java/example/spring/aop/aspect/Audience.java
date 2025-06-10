package example.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class Audience {
	//"execution(* example.spring.aop.bean.*.perform(..))"
	
	@Pointcut("execution(* example.spring.aop.bean.*.perform(..))")
	private void myPointCut() {}
	
	@Before("myPointCut()")
	public void takeSeats() {
		System.out.println("Please take your seat");
	}
	
	@Before("myPointCut()")
	public void turnOffMobile() {
		System.out.println("Please turn off your mobile");
	}
	
	@AfterReturning("myPointCut()")
	public void clap() {
		System.out.println("Clap Clap Clap");
	}
	
	@AfterThrowing("myPointCut()")
	public void demandForRefund() {
		System.out.println("Please give my money back");
	}
	
	@After("myPointCut()")
	public void leave() {
		System.out.println("Bye, leaving now");
	}
}
