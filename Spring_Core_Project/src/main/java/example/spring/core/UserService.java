package example.spring.core;

public class UserService implements GreetingService {

	private String firstname;
	private String lastname;
	private int age;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		String greeting = "Hello "+firstname +" " + lastname + ", your age is " + age;
		return greeting;
	}

	public UserService(String firstname, String lastname, int age) {
		System.out.println("UserService(String,String,int)");
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public UserService(int age, String firstname, String lastname) {
		System.out.println("UserService(int,String,String,)");
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public void setFirstname(String firstname) {
		System.out.println("***** Setting First Name *****");
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserService [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
}
