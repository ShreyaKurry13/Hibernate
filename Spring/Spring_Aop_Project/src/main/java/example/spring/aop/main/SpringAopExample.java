package example.spring.aop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.aop.bean.Musician;
import example.spring.aop.bean.Singer;
import example.spring.aop.config.SpringAopConfig;

public class SpringAopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(SpringAopConfig.class);
		
		Musician musicianObject = annoCtx.getBean(Musician.class);
		musicianObject.perform();
		
		System.out.println("---------------------------");
		
		Singer singerObject =annoCtx.getBean(Singer.class);
		singerObject.perform();
	
		System.out.println("Printing class names of the objects: ");
		System.out.println("First Class: " +musicianObject.getClass().getName());
		System.out.println("Second Class: "+singerObject.getClass().getName());
	}

}
