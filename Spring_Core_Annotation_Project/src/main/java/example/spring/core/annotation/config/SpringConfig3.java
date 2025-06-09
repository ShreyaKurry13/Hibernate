package example.spring.core.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import example.spring.core.annotation.bean.HelloBean;
import example.spring.core.annotation.bean.MyBean;
import example.spring.core.annotation.bean.WelcomeBean;

@Configuration
public class SpringConfig3 {
	
	@Bean("first")
	@Lazy
	@Scope("prototype")
	public MyBean getMyBean() {
		return new MyBean();
	}
}
