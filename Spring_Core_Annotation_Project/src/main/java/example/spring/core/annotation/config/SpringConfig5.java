package example.spring.core.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"second","third","example"})
public class SpringConfig5 {
	
//	@Bean("first")
//	public FirstComponent getFirstComp(){
//		return new FirstComponent();
//	}
	
	
}
