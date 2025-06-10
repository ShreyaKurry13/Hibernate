package example.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"example"})
@EnableAspectJAutoProxy
public class SpringAopConfig {
	
	
}
