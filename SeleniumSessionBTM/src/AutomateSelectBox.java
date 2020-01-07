import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateSelectBox {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
WebElement element=	driver.findElement(By.xpath("//select[@name='birthday_day']"));
element.click();
	Select select = new Select(element);
	select.selectByIndex(18);
	Thread.sleep(2000);
	select.selectByIndex(1);
	

}
}
