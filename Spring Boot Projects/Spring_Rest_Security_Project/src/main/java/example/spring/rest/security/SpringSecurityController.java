package example.spring.rest.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
	
	@GetMapping("/home")
	public String getHome() {
		return "Welcome to Spring Security";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "Welcome to User's Portal";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "Welcome to Admin's Portal";
	}
}
