package example.spring.core.annotation.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.spring.core.annotation.bean.HelloBean;
import example.spring.core.annotation.bean.MessageBean;
import example.spring.core.annotation.bean.WelcomeBean;

@Configuration
public class SpringConfig2 {
	
	@Bean("firstMessage")
	public MessageBean getFirstMessageBean() {
		MessageBean message = new MessageBean();
		message.setContent("Merry Christmas!!");
		message.setDeliveredOn(LocalDate.of(2025,11,05));
		return message;
	}
	
	@Bean("secondMessage")
	public MessageBean getSecondMessageBean() {
		MessageBean message = new MessageBean("Happy Republic Day",LocalDate.of(2025, 1, 26));
		return message;
	}
	
	@Bean("thirdMessage")
	public MessageBean getThirdMessageBean() {
		MessageBean message = new MessageBean(LocalDate.of(2025, 8, 15),"Happy Independence Day");
		return message;
	}
	
}
