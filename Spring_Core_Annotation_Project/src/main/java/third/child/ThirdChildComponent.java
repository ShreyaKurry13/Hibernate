package third.child;

import org.springframework.stereotype.Component;

@Component("thirdId")
public class ThirdChildComponent {
	public void doTest() {
		System.out.println("Third child Component works..");
	}
}
