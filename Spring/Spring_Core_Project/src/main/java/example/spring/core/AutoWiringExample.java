package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "spring-config5.xml";
		ApplicationContext ctx =new ClassPathXmlApplicationContext(fileName);
		Object carObject = ctx.getBean("simpleCar");
		System.out.println(carObject);
	}

}
