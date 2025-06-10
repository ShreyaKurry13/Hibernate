package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLoadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "spring-config4.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(fileName);
		Object obj =  ctx.getBean("myBean");
		Object obj2 =  ctx.getBean("myBean");
		System.out.println("Is obj equal to obj2? "+ (obj == obj2));
	}

}
