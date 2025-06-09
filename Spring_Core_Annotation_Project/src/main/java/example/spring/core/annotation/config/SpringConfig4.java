package example.spring.core.annotation.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import example.spring.core.annotation.bean.FruitBasket;
import example.spring.core.annotation.bean.HelloBean;
import example.spring.core.annotation.bean.MyBean;
import example.spring.core.annotation.bean.WelcomeBean;

@Configuration
public class SpringConfig4 {
	
	@Bean("summerFruits")
	public List<String> getFruits(){
		List<String> summerFruits = List.of("Mango","WaterMelon","Grapes");
		return summerFruits;
	}
	
	@Bean("winterFruits")
	@Primary
	public List<String> getwinterFruits(){
		List<String> winterFruits = List.of("Apple","Orange","Strawberry");
		return winterFruits;
	}
	
	@Bean("myBasket")
	public FruitBasket getFruitBasket() {
		FruitBasket myBasket = new FruitBasket();
		myBasket.setBacthNo(123);
		myBasket.setLabel("My Fav Fruits");
		return myBasket;
	}
}
