package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx;
		String filePath = "./src/main/resources/spring-config.xml";
		String fileName = "spring-config.xml";
//		ctx = new FileSystemXmlApplicationContext(filePath);
		ctx = new ClassPathXmlApplicationContext(fileName);
		Object obj = ctx.getBean("myBean");
		GreetingService gs = (GreetingService)obj; //casting 
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
	}
}
