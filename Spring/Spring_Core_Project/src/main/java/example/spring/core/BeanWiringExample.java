package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWiringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "spring-config3.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(fileName);
		Object customerObject = ctx.getBean("custBean")	;
		System.out.println(customerObject);
	}

}
