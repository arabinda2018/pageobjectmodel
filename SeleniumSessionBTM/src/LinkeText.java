import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkeText {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		list.get(2).click();
	}
}
