import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	@AfterTest
	public void forgetPassword() {
		System.out.println("logout");

	}

	@BeforeTest
	public void userName() {
		System.out.println("login");
	}

	@Test
	public void passWord() {
		System.out.println("compose");

	}

	@Test
	public void staySignedIn() {
		System.out.println("draft");

	}

}
