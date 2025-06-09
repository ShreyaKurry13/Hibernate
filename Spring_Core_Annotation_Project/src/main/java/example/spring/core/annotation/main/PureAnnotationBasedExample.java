package example.spring.core.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.annotation.config.FirstComponent;
import example.spring.core.annotation.config.SpringConfig5;
import second.SecondComponent;
import third.ThirdComponent;
import third.child.ThirdChildComponent;

public class PureAnnotationBasedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(SpringConfig5.class);
	   
		FirstComponent firstComp = annoCtx.getBean(FirstComponent.class);
	    firstComp.doTest();
		
	    System.out.println("---------------------------------");
	    
		SecondComponent secondComp = annoCtx.getBean(SecondComponent.class);
		secondComp.doTest();
		
		System.out.println("---------------------------------");
		
		ThirdComponent thirdComp = annoCtx.getBean(ThirdComponent.class);
		thirdComp.doTest();
		
		System.out.println("---------------------------------");
		
//		ThirdChildComponent thirdChildComp = annoCtx.getBean(ThirdChildComponent.class);
//		thirdChildComp.doTest();
	
		Object obj = annoCtx.getBean("thirdId");
		ThirdChildComponent thirdChildComp = (ThirdChildComponent)obj;
		thirdChildComp.doTest();
		
	}

}
