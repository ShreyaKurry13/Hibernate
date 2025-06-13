package example.spring.rest.security;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class SpringRestSecurityProjectApplication {
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
		return passwordEncoder;
	}
	
	@Bean
	public UserDetailsService getUserDetailsService() {
		UserDetails user1 = User.withUsername("AppUser").password(encoder().encode("asUser")).roles("Regular_User").build();
		UserDetails user2 = User.withUsername("AppAdmin").password(encoder().encode("asAdmin")).roles("Admin_User").build();
		
		InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager(user1,user2);
		return userDetailsManager;
	}
	
	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception {
		 http.authorizeHttpRequests(
				auth -> {
					auth.requestMatchers("/home").permitAll();
					auth.requestMatchers("/user").hasAnyRole("Regular_User","Admin_User");
					auth.requestMatchers("/admin").hasAnyRole("Admin_User");
					auth.anyRequest().authenticated();
					}
				);
		http.csrf(csrf->csrf.disable());
		http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityProjectApplication.class, args);
	}
}


