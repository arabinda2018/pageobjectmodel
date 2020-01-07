import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlert {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.irctc.co.in");
	Thread.sleep(8000);
driver.findElement(By.id("loginText")).click();
driver.findElement(By.xpath("")).click();
}
}
