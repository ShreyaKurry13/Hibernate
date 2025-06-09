package example.spring.core.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.annotation.bean.HelloBean;
import example.spring.core.annotation.bean.WelcomeBean;
import example.spring.core.annotation.config.SpringConfig;

public class SpringSimpleExample {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Object obj = annoCtx.getBean("welcome");
		WelcomeBean welcome = (WelcomeBean)obj;
		welcome.sayWelcome();
	}
}
