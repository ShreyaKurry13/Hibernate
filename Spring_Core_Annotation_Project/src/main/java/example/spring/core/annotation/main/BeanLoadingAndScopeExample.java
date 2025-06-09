package example.spring.core.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.annotation.config.SpringConfig3;

public class BeanLoadingAndScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(SpringConfig3.class);
		Object first = annoCtx.getBean("first");
		Object first1 = annoCtx.getBean("first");
		System.out.println("first = first1 ? " +(first == first1));
	
	}

}
