package example.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"cars_api"})
public class SpringExamProjectCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExamProjectCarApplication.class, args);
	}

}
