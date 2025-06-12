package example.spring.rest.controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.bean.Message;

@RestController
public class SpringRestController {

	@GetMapping("/do-greet")
	public String getGreeting() {
		return "Welcome to Spring REST Example";
	}
	
	@GetMapping("/do-message")
	public Message getMessage() {
		return new Message();
	}
	
	@GetMapping("/do-messages")
	public Collection<Message> getMessages() {
		Message m1 = new Message();
		Message m2 = new Message("Happy Republic Day",LocalDate.of(2025, 1, 26));
		Message m3 = new Message("Happy Independence Day",LocalDate.of(2025, 8, 15));
		List<Message> listOfMessages = List.of(m1,m2,m3);
		return listOfMessages;
	}
}
