import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
	List<WebElement> list = driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	System.out.println(list.toString());
	driver.switchTo().alert().accept();
}
}
