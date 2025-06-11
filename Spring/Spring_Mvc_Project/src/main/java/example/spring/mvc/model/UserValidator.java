package example.spring.mvc.model;

public class UserValidator {
	public static boolean isValid(User userObject) {
		//admin asAdmin
		boolean validationStatus = false;
		String currentUserName = userObject.getUserName();
		String currentUserPassword = userObject.getPassword();
		if (currentUserName.equals("shreya") && currentUserPassword.equals("password")) 
			validationStatus = true;
		return validationStatus;
	}
}
