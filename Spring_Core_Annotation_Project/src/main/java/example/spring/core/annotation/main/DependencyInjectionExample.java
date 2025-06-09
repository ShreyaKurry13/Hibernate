package example.spring.core.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.annotation.config.SpringConfig;

public class DependencyInjectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annoctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Object firstMessage = annoctx.getBean("firstMessage");
		Object secondMessage = annoctx.getBean("secondMessage");
		Object thirdMessage = annoctx.getBean("thirdMessage");
	
		System.out.println(firstMessage);
		System.out.println(secondMessage);
		System.out.println(thirdMessage);
	}

}
