package example.spring.core.annotation.config;

import org.springframework.stereotype.Component;

@Component
public class FirstComponent {
	
	public void doTest() {
		System.out.println("First Component works..");
	}
}
