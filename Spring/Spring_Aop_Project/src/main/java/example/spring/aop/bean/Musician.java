package example.spring.aop.bean;

import org.springframework.stereotype.Component;

@Component
public class Musician {
	public void perform() {
		System.out.println("Playing a guitar...");
	}
}
