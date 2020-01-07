import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNgJunit {
	WebDriver driver;

	@Test
	public void logInToGmail() {
		driver = new FirefoxDriver();
		driver.get("http:www.gmail.com");

	}

	@Test
	public void loginToFacebook() {
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

	@Test
	public void LoginToYoutube() {
		//driver = new FirefoxDriver();
		driver.get("http://www.youtube.com");
	}

}
