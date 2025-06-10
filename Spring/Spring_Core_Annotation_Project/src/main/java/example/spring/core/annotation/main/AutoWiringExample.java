package example.spring.core.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.annotation.bean.MyBean;
import example.spring.core.annotation.config.SpringConfig3;
import example.spring.core.annotation.config.SpringConfig4;

public class AutoWiringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(SpringConfig4.class);
		Object fruitBasket = annoCtx.getBean("myBasket");
		System.out.println(fruitBasket);
	
	}
}
