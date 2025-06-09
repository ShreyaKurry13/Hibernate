package example.spring.core.annotation.config;

import java.time.LocalDate;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.spring.core.annotation.bean.HelloBean;
import example.spring.core.annotation.bean.MessageBean;
import example.spring.core.annotation.bean.WelcomeBean;

@Configuration
public class SpringConfig {
	
	@Bean
	public HelloBean getHelloBean() {
		HelloBean hello = new HelloBean();
		return hello;
	}
	
	@Bean("welcome") //assigning a customized ID
	public WelcomeBean getWelcomeBean() {
		return new WelcomeBean();
	}
}
