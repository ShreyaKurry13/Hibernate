package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "spring-config2.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(fileName);
		Object obj = ctx.getBean("userBean");
		GreetingService gs = (GreetingService)obj; //casting 
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		
		System.out.println("--------------------");
		obj = ctx.getBean("userBean2");
		gs = (GreetingService)obj; //casting 
		reply = gs.sayGreeting();
		System.out.println(reply);
	}

}
