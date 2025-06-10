package example.spring.aop.bean;

import org.springframework.stereotype.Component;

@Component
public class Singer {
	public void perform() {
		System.out.println("Singing a song...");
//		throw new RuntimeException();
	}
}
