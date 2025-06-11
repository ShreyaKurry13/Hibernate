package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;

@Controller
@SessionAttributes("loggedInUser")
public class SpringMvcController {
//	@RequestMapping("/home")
	@GetMapping("/home")
	public String getHomePage() {
		System.out.println("Request Recieved");
		return "index";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		System.out.println("Login Page Recieved");
		return "login";
	}
	
//	@RequestMapping(value = "/doValidate", method = RequestMethod.POST)
	@PostMapping("/doValidate")
	public String doValidateUser(
		@RequestParam("uid") String userId,
		@RequestParam("pwd") String password
		) {
			  	String resultPage = "failure";
			  	User currentUser = new User(userId,password);
			    boolean valid =	UserValidator.isValid(currentUser);
			    if (valid) {
					resultPage = "success";
				}
			   return resultPage;
		  }
	
	@PostMapping("/doValidateAgain")
	public String doValidateUserAgain(
			@RequestParam("uid") String userId,
			@RequestParam("pwd") String password,
			Model dataModel
			) {
		String resultPage = "failurePage";
	  	User currentUser = new User(userId,password);
	    boolean valid =	UserValidator.isValid(currentUser);
	    if (valid) {
	    	dataModel.addAttribute("loggedInUser", userId);
			resultPage = "successPage";
		}
	   return resultPage;
	}
}
