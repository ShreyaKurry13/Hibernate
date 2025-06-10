package example.spring.core.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.annotation.bean.HelloBean;
import example.spring.core.annotation.config.SpringConfig;

public class SpringSimpleExample2 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext();
		annoCtx.register(SpringConfig.class);
		annoCtx.refresh();
		Object obj = annoCtx.getBean("getHelloBean");
		HelloBean hello = (HelloBean)obj;
		hello.sayhello();
	}
}
